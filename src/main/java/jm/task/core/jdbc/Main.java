package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService us = new UserServiceImpl();
    public static void main(String[] args) {
        us.createUsersTable();

        us.saveUser("Alex", "Chernyak", (byte) 78);
        us.saveUser("Misha", "Finger", (byte) 22);
        us.saveUser("Pahom", "Highman", (byte) 45);
        us.saveUser("Dude", "Dudevich", (byte) 16);

        us.getAllUsers();
        us.createUsersTable();
        us.dropUsersTable();
    }
}
