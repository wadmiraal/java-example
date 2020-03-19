package com.mycompany.app;

/**
 * Hello brave world!
 */
public class App
{

    private final String message = "Hello brave World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
