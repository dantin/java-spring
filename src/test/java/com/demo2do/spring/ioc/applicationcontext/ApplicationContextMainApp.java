package com.demo2do.spring.ioc.applicationcontext;

import com.demo2do.spring.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Context IoC Demo
 */
public class ApplicationContextMainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc/application-context.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}
