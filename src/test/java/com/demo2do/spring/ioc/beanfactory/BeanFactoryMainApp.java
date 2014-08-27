package com.demo2do.spring.ioc.beanfactory;

import com.demo2do.spring.beans.HelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Test Case for BeanFactory
 */
public class BeanFactoryMainApp {

    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("ioc/bean-factory.xml"));

        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
    }
}
