package com.bs.demo;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class A1_AppiumBasicApp {

	
		static AndroidDriver driver;
		
		//app > activity > Animation > Back to HomePage
		public void testBasicFlow() {
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Activity\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]")).click();
			driver.navigate().back();
		    driver.navigate().back();
		    driver.navigate().back();
		    
		    
//			//content > assets > read assets > print the given text
//			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@index=4]")).click();
//			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Assets\"]")).click();
//			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Read Asset\"]")).click();
			
		}
		
		public static void main(String[] args) throws MalformedURLException {
			// TODO Auto-generated method stub
			A0_UiAutomator2Options options = new A0_UiAutomator2Options();
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options.getApiDemoApkOptions());
			
			A1_AppiumBasicApp obj = new A1_AppiumBasicApp();
			obj.testBasicFlow();
			
			
			System.out.println("------Run Finished------");
					
					

		}
	}


