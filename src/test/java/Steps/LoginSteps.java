package Steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	HomePage hp;
	
	
	@Given("I open facebook homepage")
	public void i_open_facebook_homepage(){
		
		System.setProperty("webdriver.chrome.driver", "/users/hasanb./downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 hp = new HomePage(driver);
	}

	@When("I enter username {string}")
	public void i_enter_username(String user) throws InterruptedException {
		
		hp.typeUsername(user);
	   
	}

	@When("I enter password {string}")
	public void i_enter_password(String pass) {
		hp.typePassword(pass);
	    
	}

	@Then("I verify user account on the screen")
	public void i_verify_user_account_on_the_screen() {
		
		hp.clickLogin();
	   
	}

}
