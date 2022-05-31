package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//a[@class = 'dropdown-toggle']//span[contains(text(), 'My Account')]")
	private WebElement myAccountOption;

	@FindBy(how = How.XPATH, using = "//ul[@class = 'dropdown-menu dropdown-menu-right']//a[contains(text(), 'Register')]")
	private WebElement registerOption;
	
	@FindBy(how = How.NAME, using = "firstname")
	private WebElement txtFirstName;
	
	@FindBy(how = How.NAME, using = "lastname")
	private WebElement txtLastName;
	
	@FindBy(how = How.NAME, using = "email")
	private WebElement txtEmail;
	
	@FindBy(how = How.NAME, using = "telephone")
	private WebElement txtTelephone;
	
	@FindBy(how = How.NAME, using = "lastname")
	private WebElement lastName;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "confirm")
	private WebElement txtConfirmPwd;
	
	@FindBy(how = How.XPATH, using = "//label[@class = 'radio-inline']//input[@value = '1']")
	private WebElement subscribeBtnYes;
	
	@FindBy(how = How.XPATH, using = "//label[@class = 'radio-inline']//input[@value = '0']")
	private WebElement subscribeBtnNo;
	
	
	@FindBy(how = How.NAME, using = "agree")
	private WebElement privacyPolicyCheck;
	
	@FindBy(how = How.XPATH, using = "//input[@class = 'btn btn-primary']")
	private WebElement continueBtn;
	
	
	public void clickMyaccount() {
		myAccountOption.click();
	}
	
	public void RegisterOption() {
		registerOption.click();
	}
	
	public void txtFirstName(String name) {
		txtFirstName.clear();
		txtFirstName.sendKeys(name);
	}
	
	
	public void txtLastName(String lastname) {
		txtLastName.clear();
		txtLastName.sendKeys(lastname);
	}
	
	public void email(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void phone(String phone) {
		txtTelephone.clear();
		txtTelephone.sendKeys(phone);
	}
	
	public void pwd(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void confirmPwd(String pwd) {
		txtConfirmPwd.clear();
		txtConfirmPwd.sendKeys(pwd);
	}
	
	public void subscribe(String value) {
		
		switch(value.toLowerCase()) {
			
			case "yes":
				subscribeBtnYes.click();
				break;
			
			case "no":
				subscribeBtnNo.click();
				break;
				
			default:
				subscribeBtnNo.click();
				break;	
		}
	}
	
	public void privacyPolicy() {
		privacyPolicyCheck.click();
	}
	
	public void continueBtn() {
		continueBtn.click();
	}
	
	


}
