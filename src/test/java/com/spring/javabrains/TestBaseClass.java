package com.spring.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = {"classpath:spring.xml"})
public class TestBaseClass extends AbstractTestNGSpringContextTests{

	@Autowired
	private EnvironmentParams selenium;
	
	@Test
	public void testgetEnvDetails(){
		System.out.println(selenium.getApp_url());
		System.out.println(selenium.getSelenium_browser());
	}
	
	



}
