package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;


public class LogisticSystem {
    private static List<User> ussers = new ArrayList<>(); //список пользователей
    private static List<String> loadfile = new ArrayList<>();
    private Map map;
    private User currentUser;


    public static void addUser(String name, String login, String password){ //Добавление пользователя
            ussers.add(new User(name, login, password));
    }

    public static boolean findUser(String login){ //Поиск пользователя по массиву пользователей
        for(User u: ussers){
            if(u.getLogin().equals(login)){
                return true;
            }
        }
        return false;
    }

    public static boolean FindLoadUser(String login, String password){//поиск пользователей по загруженному файлу
        int indexA = loadfile.indexOf(login);
        int indexB = loadfile.indexOf(password);
        for(int i = 0; i < loadfile.size(); i++){
            if(indexA == i && indexB == i+1){
                return true;
            }
        }
        return false;
    }

    public static void save() throws IOException { //Сохранение данных пользователя в файл
        try {
            FileWriter out = new FileWriter("Ussers.txt", true);
            for (User u : ussers) {
                out.append(u.getLogin() +" ");
                out.append(u.getLogin() + " ");
                out.append(u.getPassword());
                out.append("\n");
            }
            out.close();
        }
        catch (IOException e){
            System.out.println("Error: File already exists");
        }
    }

    public static void load() throws FileNotFoundException {//Чтение данных пользователя из файл
        try {

            Scanner in = new Scanner(new File("Ussers.txt"));
            while (in.hasNext()) {
                loadfile.add(in.next());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error: File not found");
        }
    }

//    public static void saveXML(String name, String login, String password) throws FileNotFoundException {//В разработке
//        try {
//            FileOutputStream file = new FileOutputStream(new File("person.xml"));
//            XMLEncoder encoder = new XMLEncoder(file);
//            encoder.writeObject(ussers.toString());
//            encoder.close();
//            file.close();
//        }
//        catch (FileNotFoundException e){
//            System.out.println("Error: File not found");
//        } catch (IOException e) {
//            e.fillInStackTrace();
//        }
//    }

}



