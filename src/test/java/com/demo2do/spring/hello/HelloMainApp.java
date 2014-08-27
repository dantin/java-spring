package com.demo2do.spring.hello;

import com.demo2do.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello World Test
 */
public class HelloMainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hello/beans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();
    }
}
