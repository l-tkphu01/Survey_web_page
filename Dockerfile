# Sử dụng image Maven chính thức để build
FROM maven:3.9.4-eclipse-temurin-17 AS build

# Tạo thư mục trong container và copy source code vào đó
WORKDIR /app
COPY . .

# Build project
RUN mvn clean package -DskipTests

# ---- Runtime Stage ----
FROM eclipse-temurin:17-jdk

# Cài Tomcat (nếu app là WAR)
RUN apt-get update && apt-get install -y curl unzip \
 && curl -O https://downloads.apache.org/tomcat/tomcat-10/v10.1.15/bin/apache-tomcat-10.1.15.tar.gz \
 && tar -xvzf apache-tomcat-10.1.15.tar.gz \
 && mv apache-tomcat-10.1.15 /opt/tomcat \
 && rm apache-tomcat-10.1.15.tar.gz

# Copy file WAR sang Tomcat
COPY --from=build /app/target/*.war /opt/tomcat/webapps/ROOT.war

# Mở cổng
EXPOSE 8080

# Run Tomcat
CMD ["/opt/tomcat/bin/catalina.sh", "run"]
