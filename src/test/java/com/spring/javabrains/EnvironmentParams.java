package com.spring.javabrains;

import org.springframework.stereotype.Component;

@Component
public class EnvironmentParams {

	
	private String selenium_browser;	
	private String app_url;

	public String getSelenium_browser() {
		return selenium_browser;
	}

	public void setSelenium_browser(String selenium_browser) {
		this.selenium_browser = selenium_browser;
	}
	
	public String getApp_url() {
		return app_url;
	}

	public void setApp_url(String app_url) {
		this.app_url = app_url;
	}

	
	
	
}
