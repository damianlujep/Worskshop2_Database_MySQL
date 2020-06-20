package pl.coderslab.dao;

import pl.coderslab.entity.User;

public class MainDao {
    public static void main(String[] args) {
        User newUser = new User();
        newUser.setId(1);
        newUser.setUserName("Mela Trix");
        newUser.setEmail("melatrix@gmail.com");
        newUser.setPassword("melapassword2020");
//
        UserDao newUserDao = new UserDao();
//        newUserDao.create(newUser);
        User read = newUserDao.read(6);
        System.out.println(read+ "\n");
//
        User user2 = newUserDao.read(7);
//        user2.setUserName("new user 7");
//        user2.setEmail("username7@gmail.com");
//        user2.setPassword("newUser7Password");
//        newUserDao.update(user2);
//        newUserDao.read(7);

        newUserDao.delete(7);

        UserDao findAllUsers = new UserDao();
        User[] all = findAllUsers.findAll();

        for (User user : all) {
            System.out.println(user.getId() + "   " + user.getUserName() + "   " + user.getEmail() + "   " + user.getPassword());
        }
    }
}
