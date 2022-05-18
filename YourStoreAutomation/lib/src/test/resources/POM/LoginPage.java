package POM;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//a[@class = 'dropdown-toggle']//span[contains(text(), 'My Account')]")
	private WebElement myAccountOption;

	@FindBy(how = How.XPATH, using = "//ul[@class = 'dropdown-menu dropdown-menu-right']//a[contains(text(), 'Login')]")
	private WebElement loginOption;

	@FindBy(how = How.NAME, using = "email")
	private WebElement txtEmail;

	@FindBy(how = How.NAME, using = "password")
	private WebElement txtPwd;
	
	@FindBy(how = How.XPATH, using = "//input[@class = 'btn btn-primary']")
	private WebElement loginBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'form-group']//a[contains(text(), 'Forgotten Password')]")
	private WebElement forgottenPwd;
	
	@FindBy(how = How.NAME, using = "email")
	private WebElement txtforggottenEmail;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'pull-right']")
	private WebElement confirmBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'pull-left']//a[contains(text(), 'Back')]")
	private WebElement backBtn;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(), ' Warning: No match for E-Mail Address and/or Password.')]")
	private WebElement messageWrongLogin;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(), ' Warning: The E-Mail Address was not found in our records, please try again!')]")
	private WebElement messageWrongForgotten;
	
	
	public void clickMyaccount() {
		myAccountOption.click();
	}
	
	public void clickLoginOption() {
		loginOption.click();
	}
	
	
	public void txtEmail(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void txtPwd(String pwd) {
		txtPwd.clear();
		txtPwd.sendKeys(pwd);
	}
	
	public void loginBtn() {
		loginBtn.click();
	}
	
	
	public void forgottenPwd() {
		forgottenPwd.click();
	}
	
	public void txtForgottenEmail(String email) {
		txtforggottenEmail.clear();
		txtforggottenEmail.sendKeys(email);
	}
	
	
	public void confirmBtn() {
		confirmBtn.click();
	}
	
	public void backBtn() {
		backBtn.click();
	}
	
	
	public String messageWrongLogin() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(messageWrongLogin));
		return messageWrongLogin.getText();	
	}
	
	
	public String messageWrongForgotten() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(messageWrongForgotten));
		return messageWrongForgotten.getText();	
	}
	
	
	
	

}
