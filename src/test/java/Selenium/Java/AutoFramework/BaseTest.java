package Selenium.Java.AutoFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Utils.ConfigUtil;
import Utils.WebDriverUtil;



public class BaseTest {
	
	protected WebDriver driver;
	protected static String url;
	protected static String browser;
	
	@BeforeSuite
	public void basetup() {
		ConfigUtil configUtil = new ConfigUtil("/Users/sheetikajain/eclipse-workspace/AutoFramework/Resources/config.properties");
		url = configUtil.getProperty("Url");
		browser = configUtil.getProperty("browser");
	}
	
	@BeforeTest
	
	public void presetup() {
	
		driver = WebDriverUtil.getDriver(browser);
		driver.get(url);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@AfterTest
	
	public void teardown() {
		driver.close();
	}

}
