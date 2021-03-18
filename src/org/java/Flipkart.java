package org.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {
	
	public static void main(String[] args) {
		
		System.setProperty("geckodriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Project2\\Driver2\\geckodriver.exe ");
		
		WebDriver driver = new FirefoxDriver();
		
		System.getProperty("https://www.flipkart.com/");
		
		
	}

}
