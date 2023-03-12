package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.HomeModel;

public class HomePage extends HomeModel{
	
	public HomePage(WebDriver page) {
		
		super(page);
	}
	
	public void typeUsername(String user) throws InterruptedException {

		WebElement username = getUsername();
		username.sendKeys(user);

	}

	public void typePassword(String pass) {

		WebElement password = getPassword();
		password.sendKeys(pass);

	}
	
	public void clickLogin() {

		WebElement login = getLoginBtn() ;
		login.click();

	}
	
	

}
