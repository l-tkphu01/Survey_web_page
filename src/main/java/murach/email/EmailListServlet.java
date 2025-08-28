package murach.email;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import murach.business.User;
import murach.data.UserDB;

@WebServlet("/survey")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy dữ liệu từ form
        String firstName   = request.getParameter("firstName");
        String lastName    = request.getParameter("lastName");
        String email       = request.getParameter("email");
        String dob         = request.getParameter("dob");
        String heardFrom   = request.getParameter("heardFrom");
        String contactVia  = request.getParameter("contactVia");

        boolean wantsUpdates = request.getParameter("wantsUpdates") != null;
        boolean emailOK      = request.getParameter("emailOK") != null;

        // Tạo đối tượng User
        User user = new User(firstName, lastName, email, dob,
                heardFrom, wantsUpdates, emailOK, contactVia);

        // Lưu dữ liệu (tạm thời chỉ in ra console)
        UserDB.insert(user);

        // Đưa user vào request
        request.setAttribute("user", user);

        // Forward đến thanks.jsp
        getServletContext().getRequestDispatcher("/thanks.jsp")
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
