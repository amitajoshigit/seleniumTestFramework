package com.observer.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.observer.qa.base.TestBase;

public class ObserverHomePage extends TestBase {
	
	@FindBy(xpath="(//div[@class='react-grid-layout layout']//h3[@class='card-title row'])[1]/..")
	WebElement networkGrid;
	
	@FindBy(xpath="")
	WebElement QUATERLYGrid;
	
	//initialize page objects
	public ObserverHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateNetworkGrid()
	{
		return networkGrid.isDisplayed();
	}
	

}
