package Selenium.Java.AutoFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasePage {
	
	WebDriver driver;
	
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
		
		return driver.getTitle();
		
	}

}
