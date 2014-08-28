package com.demo2do.spring.dependency;

import com.demo2do.spring.beans.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Constructor-based Dependency Injection Demo
 */
public class ConstructorBasedDependencyMainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependency/constructor-based.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");

        te.spellCheck();
    }
}
