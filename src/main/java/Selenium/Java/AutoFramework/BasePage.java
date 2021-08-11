package Selenium.Java.AutoFramework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utils.ExcelHelper;

public class BasePage {
	
	WebDriver driver;
	private static Logger Log = LogManager.getLogger(ExcelHelper.class);
	
	@FindBy (how = How.ID, using="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy (how = How.ID, using = "nav-search-submit-button")
	WebElement searchButton;
	
	public BasePage(WebDriver driver) {
	    this.driver = driver;
    }
	
	public String search (String searchData) throws InterruptedException {
		Thread.sleep(5000);
		searchBox.sendKeys(searchData);
		searchButton.click();
		Log.info("Testing for page title");
		
		return driver.getTitle();
		
	}

}
