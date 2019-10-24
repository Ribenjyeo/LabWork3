package com.company;
import java.io.IOException;
import java.util.Scanner;
import static com.company.LogisticSystem.addUser;
import static com.company.LogisticSystem.findUser;
import static com.company.LogisticSystem.save;
import  static com.company.LogisticSystem.load;
import static com.company.LogisticSystem.FindLoadUser;


public class Main {
    public static void main(String[] args) throws IOException {
    load(); //загрузка файла
	System.out.println("Добро пожаловать в интерфейс для входа в систему. Выберите дальнейшее действие:");
	Scanner in = new Scanner(System.in);
	Scanner case1 = new Scanner(System.in);
	Scanner case2 = new Scanner(System.in);
	int y;
	while(true){//Основное меню
        load();
        System.out.println("1. Войти в систему");
        System.out.println("2. Регистрация");
        System.out.println("3. Выйти из системы");
	    y = in.nextInt();
	    switch(y){
	        case 1: //Авторизация пользователя
	                System.out.println("Введите ваш логин и пароль:");
                    System.out.println("Логин: "); String login1 = case1.nextLine();
                    System.out.println("Пароль: "); String password1 = case1.nextLine();
                        if(FindLoadUser(login1, password1) == false){
                            System.out.println("Вы ввели не правильный логин и пароль, повторите попытку");
                        }
	            break;
            case 2: //Регистрация пользователя
                    System.out.println("Добро пожаловать в интерфейс регистрации пользователя. Введите ваше Имя, логин и пароль");
                    System.out.println("Имя: "); String name = case2.nextLine();
                    System.out.println("Логин: "); String login2 = case2.nextLine();
                    if(name.equals(login2)){
                        System.out.println("Имя не может быть такое же как и логин, попробуйте в следующий раз");
                        break;
                    }
                    System.out.println("Пароль: "); String passowd2 = case2.nextLine();
                        if (FindLoadUser(login2, passowd2) == true) {
                            System.out.println("Пользователь с таким логином или паролем уже существует");
                            break;
                        }
                    addUser(name, login2, passowd2);
                    save();
                break;
            case 3: //Выход из программы
                System.exit(0);
                break;
        }
	}
    }


}
