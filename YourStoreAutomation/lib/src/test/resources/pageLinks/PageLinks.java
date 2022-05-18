package PageLinks;

public enum PageLinks {
	
	
	yourStoreLink("http://siit.epizy.com/"),
	loginPage("http://siit.epizy.com/index.php?route=account/login"),
	forgottenPwdPage("http://siit.epizy.com/index.php?route=account/forgotten"),
	registerPage("http://siit.epizy.com/index.php?route=account/register"),
	WrongLogin("Warning: No match for E-Mail Address and/or Password."),
	wrongForgottenEmail(" Warning: The E-Mail Address was not found in our records, please try again!");
	
	
	
	private final String link;
	

	PageLinks(String link) {
		this.link = link;
	}
	
	
	public String getLink() {
		return this.link;
	}
	
	
	
	

}
