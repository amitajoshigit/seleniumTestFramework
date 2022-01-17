package com.observerTesting.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.observer.qa.base.TestBase;
import com.observer.qa.pages.LoginPage;
import com.observer.qa.pages.ObserverHomePage;

public class ObserverPageTest extends TestBase{
	
	ObserverHomePage homePage;
	LoginPage loginPage;
	
	public ObserverPageTest() {
		super();
	}
	
	
	  @BeforeMethod 
	  public void setUp() 
	  { 
		  initialization();
		  loginPage = new LoginPage();
		  loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		  homePage = new ObserverHomePage(); 
	  }
	 
	
	@Test(priority=1)
	public void validateNetworkGrid(){
		boolean flag = homePage.validateNetworkGrid();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void validateMonitoredDevices() {
		boolean flag = homePage.validateMonitoredDevices();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
