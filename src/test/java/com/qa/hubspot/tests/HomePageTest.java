package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest extends BaseTest
{

	@Test(priority=1)
	public void VerifyHomePageTitleTest() throws InterruptedException
	{
		page.getInstance(LoginPage.class).doLogin("bharath.amex@gmail.com", "Kalyani@4341");
		String HomepageTitle=page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("HomePage title is"+HomepageTitle);
		Assert.assertEquals(HomepageTitle, "Getting Started | HubSpot");
		
		
		
	}
	@Test(priority=2)
	public void verifyHomePageHeaderTest() throws InterruptedException
	{
		page.getInstance(LoginPage.class).doLogin("bharath.amex@gmail.com", "Kalyani@4341");
		String header=page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("HomePage header is"+header);
		Assert.assertEquals(header, "Getting started with HubSpot");
		
	}
	
	
}
