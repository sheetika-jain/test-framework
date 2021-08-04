package Selenium.Java.AutoFramework;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomeTest extends BaseTest{
	HomePage hm;
	
	@Test
	public void setup() throws InterruptedException {
		hm = PageFactory.initElements(driver, HomePage.class);
		String actualTitle = hm.search("Computer");
		Assert.assertEquals(actualTitle, "Amazon.com : Computer");
	}

}
