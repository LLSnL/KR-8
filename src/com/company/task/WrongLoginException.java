package com.company.task;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
        super("Ошибка, связанная с логином!");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
