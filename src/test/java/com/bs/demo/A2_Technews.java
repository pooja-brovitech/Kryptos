package com.bs.demo;

import java.awt.Dimension;
import java.awt.Point;
import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.slf4j.helpers.Util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class A2_Technews {
	

	static AndroidDriver driver;
	
		
	public void techFlow() throws InterruptedException {
		
//		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
//		
		Thread.sleep(3000);
		
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		//driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"NEXT\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(AppiumBy.accessibilityId("SKIP")).click();
//		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"SKIP\"]")).click();
//      driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"SKIP\"]")).click();
//		driver.findElement(AppiumBy.accessibilityId("NEXT")).click();
//		driver.findElement(AppiumBy.accessibilityId("NEXT")).click();	
		Thread.sleep(5000);
		
		driver.findElement(AppiumBy.accessibilityId("Get Started")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]")).sendKeys("poojahadpad2@gmail.com");
		
		
		
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[2]")).sendKeys("#P2903");
		
////		scrollDown(AppiumDriver<MobileElement>driver);
//		
////	    scroll("RIGHT", 0.5);
////		driver.findElement(By.xpath("//android.widget.ScrollView")).click();
//		Thread.sleep(3000);
//		
////		Duration SCORLL_DUR = Duration.ofMillis(300);
//		
////		Point midPoint = new Point((int)(size.width * 0.5), (int)(size.height * 0.5));
////		int a = (int)(midPoint.x * scrollRatio);
////		int b = (int)(midPoint.y * scrollRatio);
//		
////		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Log In\"]")).click();
////   	driver.findElement(AppiumBy.accessibilityId("Log In")).click();
//	
////	    driver.findElement(AppiumBy.xpath("//android.widget.Button[@index=6]")).click();
//		
//	}
//	public static void scroll(String pageDirection, double scrollRatio) {
//		
//		Duration SCROLL_DUR = Duration.ofMillis(300);
////		if(scrollRatio < 0 || scrollRatio > 1 );
////		throw new Error("scroll distance must be between 0 and 1 ");
//	}
//	
//	org.openqa.selenium.Dimension size = driver.manage().window().getSize();
//	Point midPoint = new Point((int)(size.width * 0.5), (int)(size.height * 0.5));
//	
//	 int scrollRatio;
//	 
//	int a = (int)(midPoint.x * scrollRatio);
//	int b = (int)(midPoint.y * scrollRatio);
//	
//	int bottom = midPoint.y + (int)(midPoint.y * scrollRatio);
//	int top = midPoint.y - (int)(midPoint.y * scrollRatio);
//	int left = midPoint.y - (int)(midPoint.x * scrollRatio);
//	int right = midPoint.y + (int)(midPoint.x * scrollRatio);
//	
////	swipe(new Point(midPoint.x, top),new point (midPoint.x, bottom),SCROLL_DUR);
//	
//	
////	scroll("LEFT", 0.5);
//	
	
		
		
//	 driver.findElementByAndroidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Log In\").instance(0))").click();
//		driver.findElement(new AppiumBy.androidUIAutomator("new UiScrollable(new    UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\\\"Log In\\\").instance(0))"));
////	driver.findElement(AppiumBy.accessibilityId("Log In")).click();
	
		int  height = driver.manage().window().getSize().getHeight();
		
		int width = driver.manage().window().getSize().getWidth();
		int startY = (int)(height * 0.8);
		
		int endY = (int)(height * 0.2);
		int startX = width/2;
		
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(PointOption.point(startX, startY))
		.waitAction()
		.moveTo(PointOption.point(startX, endY))
		.release()
		.perform();
		
		
		
		
		
		
		
        
//		driver.findElement(By.className("android.view.View")).click();
	driver.findElement(AppiumBy.accessibilityId("Log In")).click();
		
	}

	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.out.println("-----Run  Started-----");
		A0_UiAutomator2Options options = new A0_UiAutomator2Options();
		driver= new AndroidDriver(new URL("http://127.0.0.1:4723/"), options.getAppDebugApkOptions());
		
		A2_Technews obj = new A2_Technews();
		obj.techFlow();
		
		
	
		
		System.out.println("-----Run Finished-----");
		
		

	}

}
