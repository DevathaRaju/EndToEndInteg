package com.cg.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {

	@Test
	public void tc1(){
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse workspace-07May18\\SeleniumTestNgMavenJenkinsIntegration\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

}
