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

import POM.LoginPage;
import PageLinks.PageLinks;

public class Login {
	
	WebDriver driver;
	LoginPage page;
	WebDriverWait wait;
	
	@Before
	public void setUp() {
		//set the property for page 
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://siit.epizy.com/?i=1");
		page = new LoginPage(driver);
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
		page.clickLoginOption();
		Assert.assertEquals("the current page should be Login Menu", PageLinks.loginPage.getLink(), driver.getCurrentUrl());
		
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		// navigate to login page add an email and pwd -> press Login btn and check the message alert from the page 
		page.clickMyaccount();
		page.clickLoginOption();
		Assert.assertEquals("the current page should be Login Menu", PageLinks.loginPage.getLink(), driver.getCurrentUrl());
		page.txtEmail("zaharia.alexandru.catalin@gmail.com");
		page.txtPwd("alex");
		page.loginBtn();
		Assert.assertEquals(PageLinks.WrongLogin.getLink(), page.messageWrongLogin());	
	}
	
	
	@Test
	public void test3( ) {
		// navigate to login page -> press forgotten pwd, add an email and check the message alert
		page.clickMyaccount();
		page.clickLoginOption();
		Assert.assertEquals("the current page should be Login Menu", PageLinks.loginPage.getLink(), driver.getCurrentUrl());
		page.forgottenPwd();
		Assert.assertEquals("the current page should be Login Menu", PageLinks.forgottenPwdPage.getLink(), driver.getCurrentUrl());
		page.txtForgottenEmail("zaharia.alexandrucatalin@gmail.com");
		page.confirmBtn();
		//Assert.assertEquals(PageLinks.wrongForgottenEmail, page.messageWrongForgotten());
		
	}
	
	@Test
	public void test4() {
		// navigate to login page , create a Happy flow with a good email and pwd 
		System.out.println("Happy flow");
		page.clickMyaccount();
		page.clickLoginOption();
		Assert.assertEquals("the current page should be Login Menu", PageLinks.loginPage.getLink(), driver.getCurrentUrl());
		page.txtEmail("zaharia.alexandru.catalin@gmail.com");
		page.txtPwd("alex");
		page.loginBtn();
		
	}

}
