package YourStoreAutomation;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.RegistrationPage;
import PageLinks.PageLinks;

public class Registration {
	

	WebDriver driver;
	RegistrationPage page;
	WebDriverWait wait;
	
	@Before
	public void setUp() {
		//set the property for page 
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://siit.epizy.com/?i=1");
		page = new RegistrationPage(driver);
		PageFactory.initElements(driver, page);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
				
	}
	
	@After
	public void closeApp() {
		driver.close();
	}
	
	

	@Test
	//@DisplayName("access Login option from MyAccount Menu")
	public void test1() {
		// navigate to YourStore page and check the current url with the url from PageLink enum
		
		page.clickMyaccount();
		page.RegisterOption();
		Assert.assertEquals("the current page should be Register Menu", PageLinks.registerPage.getLink(), driver.getCurrentUrl());
		
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		// navigate to login page add an email and pwd -> press Login btn and check the message alert from the page 
		page.clickMyaccount();
		page.RegisterOption();
		page.txtFirstName("Zaharia");
		page.txtLastName("Alexandru");
		page.email("zaharia.alexandrucatalin@yahoo.com");
		page.phone("0721908767");
		page.pwd("123456");
		page.confirmPwd("123456");
		Thread.sleep(3000);
		page.subscribe("Yes");
		page.privacyPolicy();
		page.continueBtn();
		
	}
	
	
	@Test
	public void test3( ) {
		// navigate to login page -> press forgotten pwd, add an email and check the message alert
		page.clickMyaccount();
		page.RegisterOption();
		page.txtFirstName("Zaharia");
		page.txtLastName("Alexandru");
		page.email("zaharia.alexandruca.talin@yahoo.com");
		page.phone("0721908767");
		page.pwd("123456");
		page.confirmPwd("123456");
		page.subscribe("No");
		page.privacyPolicy();
		page.continueBtn();
		
	}
	

}
