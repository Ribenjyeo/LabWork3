package com.company;

import java.io.Serializable;

public class User implements Serializable{
    public static Object Admin;
    private String name;
    private String login;
    private String password;

    public User(String name, String login, String password){
        super();
        this.name = name;
        this.login = login;
        this.password = password;
    }

    String getName(){//Возвращает имя
        return this.name;
    }

    String getLogin(){ //Возвращает логин
        return this.login;
    }

    public String getPassword(){ //Возвращает пароль
         return this.password;
    }

    @Override
    public String toString(){
        return "User [name = " +name +", login = " + login +", password = " +password + "]";
    }

    class Admin{//Внутрений класс Админ
        User a = new User("Alex Kinsman", "admin", "admin");

    }
}
