package com.observer.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.observer.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory - Object Repo
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//button[contains(.,'Sign in')]")
		WebElement signInBtn;
		
		@FindBy(xpath="//div[@class='brand'] //img[@class='img-fluid']")
		WebElement velocisLogo;
		
		//initialize page objects
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public String validateLoginPageTitle()
		{
			return driver.getTitle();
		}
		public boolean validateVelocisLogo()
		{
			return velocisLogo.isDisplayed();
		}
		
		public ObserverHomePage login(String uname, String pwd)
		{
			username.sendKeys(uname);
			password.sendKeys(pwd);
			signInBtn.click();
			return new ObserverHomePage();
		}

}
