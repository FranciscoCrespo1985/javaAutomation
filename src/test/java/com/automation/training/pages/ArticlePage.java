package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage{

	public ArticlePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="firstHeading")
	private WebElement pageTitle;
	
	@FindBy(linkText="privacyLink")
	private WebElement privacyLink;
	
	public String getPageTitle() {
		return pageTitle.getText();
	}

}
