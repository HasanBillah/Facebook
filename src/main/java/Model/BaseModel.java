package Model;

import org.openqa.selenium.WebDriver;

public class BaseModel {
	
	WebDriver driver;
	
	public BaseModel(WebDriver base) {
		
		driver = base;
	}

}
