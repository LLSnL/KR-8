package com.company.task;

public class WrongPasswordException extends Exception{

    public WrongPasswordException() {
        super("Ошибка, связанная с паролем!");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
