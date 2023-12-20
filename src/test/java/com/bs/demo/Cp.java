package com.bs.demo;

import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Cp {
	
	static AppiumDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			openCp();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
		

	}
public static void openCp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "IN1b");
		cap.setCapability("udid", "BS6523M4JM122001464");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.crosspayments.crosspay.crosspayments");
		cap.setCapability("appActivity", "com.crosspayments.crosspay.crosspayments.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub/");
		
		driver = new AppiumDriver (url, cap);
		System.out.println("Application Started...");
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text=\" Sign in\"]")).click();
		
		
		
	}
	
	
}
