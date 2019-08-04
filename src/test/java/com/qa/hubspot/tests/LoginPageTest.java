package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest()
	{
		String title=page.getInstance(LoginPage.class).getloginPageTitle();
		System.out.println("Login page title is"+title);
		Assert.assertEquals(title, "HubSpot Login");
		
	}
	@Test(priority=2)
	public void loginTest() throws InterruptedException
	{
		page.getInstance(LoginPage.class).doLogin("bharath.amex@gmail.com", "Kalyani@4341");
		
	}
	

}
