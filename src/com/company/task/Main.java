package com.company.task;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = sc.nextLine();
        System.out.println("Введите пароль");
        String password = sc.nextLine();
        System.out.println("Подтвердите пароль");
        String confirmPassword = sc.nextLine();

        System.out.println(loginPasswordCheck(login,password,confirmPassword));
    }

    public static boolean loginPasswordCheck(String login, String password, String confirmPassword){
        boolean check = true;
        try {
            if (!Pattern.matches("\\w{1,19}", login)) {
                throw new WrongLoginException();
            }
            if (!Pattern.matches("\\w{1,19}", password)) {
                throw new WrongPasswordException();
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
        } catch(WrongLoginException | WrongPasswordException e){
            check = false;
            System.out.println(e.getMessage());
        }
        return check;
    }
}