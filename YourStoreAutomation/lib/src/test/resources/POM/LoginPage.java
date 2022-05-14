package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
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
	private WebElement loginBtw;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'form-group']//a[contains(text(), 'Forgotten Password')]")
	private WebElement forgottenPwd;
	
	@FindBy(how = How.NAME, using = "email")
	private WebElement txtforggottenEmail;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'pull-right']")
	private WebElement confirmBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class = 'pull-left']//a[contains(text(), 'Back')]")
	private WebElement backBtn;
	
	
	
	

}
