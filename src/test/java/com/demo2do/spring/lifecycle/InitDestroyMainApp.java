package com.demo2do.spring.lifecycle;

import com.demo2do.spring.beans.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Initialization & Destruction Callbacks
 */
public class InitDestroyMainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("life-cycle/init-destroy-callback.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}
