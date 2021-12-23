package com.observerTesting.testCases;

import org.testng.annotations.Test;

import com.observerTesting.pageObjects.LoginPage;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() {
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		/*if(driver.getTitle().equals("The Observer | Login")) 
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}*/
	}

}

