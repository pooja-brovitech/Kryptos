package com.bs.demo;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchMsiteInChrome {

	public static void main(String[] args) {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
	    cap.setCapability(CapabilityType.BROWSER_NAME,"chrome");
	    cap.setCapability("deviceName", "GM1901");
	    cap.setCapability("platformVersion", "12");
	    cap.setCapability("platformName", "Android");
	    
	    
	}
}
