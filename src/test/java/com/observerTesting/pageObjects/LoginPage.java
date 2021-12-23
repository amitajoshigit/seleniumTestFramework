package com.observerTesting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	//driver.find_element(By.XPATH, "//*[@class='btn btn-primary btn-block btn btn-secondary']").click()
	@FindBy(xpath="//*[@class='btn btn-primary btn-block btn btn-secondary']")
	@CacheLookup
	WebElement btnLogin;

	public void setUserName(String username)
	{
		txtUserName.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txtUserName.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
}
