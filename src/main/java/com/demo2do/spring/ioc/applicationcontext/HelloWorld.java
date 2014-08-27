package com.demo2do.spring.ioc.applicationcontext;

/**
 * Hello World POJO
 */
public class HelloWorld {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}
