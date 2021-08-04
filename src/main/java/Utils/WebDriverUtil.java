package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtil {
	
public static WebDriver getDriver(String browserName) {
	
		WebDriver driver;
		
	switch(browserName) {
		
		case "chrome":
			 System.setProperty("webdriver.chrome.driver","//Users//sheetikajain//Desktop//javapath//chromedriver");
			 driver=new ChromeDriver();
			 break;
		default:
			 System.setProperty("webdriver.chrome.driver","//Users//sheetikajain//Desktop//javapath//chromedriver");
			 driver=new ChromeDriver();
		
		}
		return driver;
		
	}

}
