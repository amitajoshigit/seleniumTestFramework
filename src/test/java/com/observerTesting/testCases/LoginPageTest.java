package com.observerTesting.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.observer.qa.base.TestBase;
import com.observer.qa.pages.LoginPage;
import com.observer.qa.pages.ObserverHomePage;


public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	ObserverHomePage homePage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		System.out.println("title is "+title);
		Assert.assertEquals(title, "The Observer");
	}
	
	@Test(priority=2)
	public void velocisLogoImageTest(){
		boolean flag = loginPage.validateVelocisLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() throws InterruptedException {
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
