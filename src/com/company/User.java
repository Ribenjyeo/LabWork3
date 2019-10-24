package com.company;

public class User {
    private String name;
    private String login;
    private String password;

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }

    String getName(){
        return this.name;
    }

    String getLogin(){ //Возвращает логин
        return this.login;
    }

    public String getPassword(){ //Возвращает пароль
        return this.password;
    }



}
