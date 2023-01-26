package com.motivity.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleAOP {
    public static void main(String[] args) throws ClassNotFoundException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanInitializationInJava.class);
        BusinessLogic bl = context.getBean(BusinessLogic.class);
        int i1 = bl.method1();
        int i2 = bl.method2();
        int i3 = bl.method3();
        context.close();
    }
}
