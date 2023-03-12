package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel {
	
	public HomeModel(WebDriver model) {
		super(model);
	}
	
	public WebElement getUsername() throws InterruptedException {
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		return username;
	}
	
	public WebElement getPassword() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		return password;
	}
	
	public WebElement getLoginBtn() {
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		return login;
	}

}
