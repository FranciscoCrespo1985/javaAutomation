package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WikiHomePage extends BasePage {

	public WikiHomePage(WebDriver driver) {
		super(driver);
		driver.get("http://wikipedia.org");
	}
	
	
	public void navigate(String url) 
	{		
		this.getDriver().navigate().to(url);
	}
	
	@FindBy(id="searchInput")
	private WebElement searchInput;
	
	@FindBy(xpath="//*[@id='search-form']/fieldset/button")
	private WebElement searchButton;
	
	public ArticlePage buscar(String busqueda) 
	{
		searchInput.sendKeys(busqueda);
		getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
		return new ArticlePage(getDriver());		
	}
}
