package com.bs.demo;

import java.io.File;

import io.appium.java_client.android.options.UiAutomator2Options;

public class A0_UiAutomator2Options {
	
	public UiAutomator2Options getApiDemoApkOptions() {
		System.out.println("----- Started:  apk-----");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("builds/ApiDemos-debug (2).apk").getFile());
		String apkPath =file.getAbsolutePath();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options
		.setPlatformName("Android")
		.setPlatformVersion("12.0")
		
		.setAutomationName("UiAutomator2")
		.setDeviceName("emulator-5554")
		
		.setAppPackage("io.appium.android.apis")
		.setAppActivity(".ApiDemos")
		
		.setApp(apkPath)
		.setNoReset(false);
		
	
		return options;
		
		}
	
	public UiAutomator2Options getAppDebugApkOptions() {
		System.out.println("-----Started ApP Debug Apk-----");
		ClassLoader classLoader = getClass().getClassLoader();
		
		File file = new File(classLoader.getResource("builds/app-debug.apk").getFile());
		String apkPath =file.getAbsolutePath();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options
		.setPlatformName("Android")
		.setPlatformVersion("13.0")
		
		.setAutomationName("UiAutomator2")
		.setDeviceName("emulator-5554")
		
		.setAppPackage("com.example.technews")
		.setAppActivity("com.example.technews.MainActivity")
		
		.setApp(apkPath)
		.setNoReset(false);
		
	
		return options;
		
		
	}
	public UiAutomator2Options getChromeOptions() {
		System.out.println("-----Started : ChromeBrowser-----");
		
		UiAutomator2Options options = new UiAutomator2Options();
		options
		.setPlatformName("Android")
		.setPlatformVersion("12.0")
		
		.setAutomationName("UiAutomator2")
		.setDeviceName("emulator-5554")
		.noReset()
		.withBrowserName("Chrome");
		
		return options;
		
	}
	
	
}
