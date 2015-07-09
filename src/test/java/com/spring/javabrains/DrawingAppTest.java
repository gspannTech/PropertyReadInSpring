package com.spring.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppTest {

	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		EnvironmentParams env = (EnvironmentParams) context.getBean("selenium");
		System.out.println(env.getApp_url());
		System.out.println(env.getSelenium_browser());
	}

}
