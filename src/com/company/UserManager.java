package com.company;

public class UserManager extends User {
    public void show(User user){
        System.out.println("kullanıcı numarası :" + user.getUserNumber());
    }
    public void showMultiple(User[] users){
        for (User user : users){
            show(user);

        }
    }
}
