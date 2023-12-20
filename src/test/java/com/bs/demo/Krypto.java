package com.bs.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Krypto {
	
	static AppiumDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openKryptoskatt();
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
		
		
	}
	
	public static void openKryptoskatt() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "IN1b");
		cap.setCapability("udid", "BS6523M4JM122001464");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.kryptoskatt.android");
		cap.setCapability("appActivity", "com.kryptoskatt.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/w"
				+ "d/hub/");
		driver = new AppiumDriver (url, cap);
		System.out.println("Application Started...");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text=\" Sign in\"]")).click();
		
		
		
	}
}
