package YourStoreAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.BasePageObject;

public class BaseSetups extends BasePageObject {
	
	public BaseSetups(WebDriver driver) {
		super(driver);
		
	}

	
	public WebDriver setUp( ) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();	
	return driver;	

	}
}
