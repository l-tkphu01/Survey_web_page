package murach.data;

import murach.business.User;

public class UserDB {
    public static int insert(User user) {
        System.out.println("User saved: " + user.getFirstName() + " " + user.getLastName()
                + " (" + user.getEmail() + ")");
        return 1; // giả sử luôn thành công
    }
}
