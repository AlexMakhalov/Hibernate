package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Alex", "Makhalov", (byte) 22);
        userService.saveUser("Leo", "Messi", (byte) 37);
        userService.saveUser("Alex", "Ovechkin", (byte) 39);
        userService.saveUser("Vladimir", "Putin", (byte) 72);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
