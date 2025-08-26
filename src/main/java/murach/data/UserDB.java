package murach.data;

import murach.business.User;
import java.util.ArrayList;
import java.util.List;

public class UserDB {
    // Giả lập database bằng một danh sách static
    private static List<User> users = new ArrayList<>();

    // Thêm user vào "database"
    public static void insert(User user) {
        users.add(user);
        System.out.println("User saved: "
                + user.getFirstName() + " "
                + user.getLastName() + " ("
                + user.getEmail() + ")");
    }

    // Trả về toàn bộ danh sách user (nếu muốn xem)
    public static List<User> getAll() {
        return users;
    }
}
