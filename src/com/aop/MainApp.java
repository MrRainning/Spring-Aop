package com.aop;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("aop.xml");
		HelloWorld obj1=(HelloWorld)context.getBean("helloWorldImp1");
		HelloWorld obj2=(HelloWorld)context.getBean("helloWorldImp2");
		obj1.doPrint();
		obj1.printHelloWorld();
		System.out.println();
		obj2.doPrint();
		obj2.printHelloWorld();
	}
}
