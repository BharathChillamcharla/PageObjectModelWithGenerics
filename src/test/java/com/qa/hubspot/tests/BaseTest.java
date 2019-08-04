package com.qa.hubspot.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hubspot.pages.Page;

public class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	@BeforeMethod
	public void SetUp() throws InterruptedException
	{
		//String Srcdirectory=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium jar\\Lib\\chromedriver_win32 (6)\\chromedriver.exe");
		driver =new ChromeDriver();
		
		wait =new WebDriverWait(driver,15);
		driver.manage().window().fullscreen();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(6000);	
		//create the object of Page class: instantiate pageclass
		page=new Page(driver, wait);
				
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
