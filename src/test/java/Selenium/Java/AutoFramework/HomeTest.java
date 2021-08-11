package Selenium.Java.AutoFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.ExcelHelper;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomeTest extends BaseTest{
	HomePage hm;
	
	@DataProvider(name = "searchData")
	public Object[][] testData() {
		return ExcelHelper.getExcelData("HomeTestData.xlsx", "Sheet1");
		
	}
	
	/*@Test 
	public void setup() throws InterruptedException {
		hm = PageFactory.initElements(driver, HomePage.class);
		String actualTitle = hm.search("Computer");
		Assert.assertEquals(actualTitle, "Amazon.com : Computer");
	}*/
	
	@Test (dataProvider = "searchData")
	public void searchTest(String searchKeyword, String expectedTitle) throws InterruptedException {
		hm = PageFactory.initElements(driver, HomePage.class);
		String actualTitle = hm.search(searchKeyword);
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}


