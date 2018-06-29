package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	 WebDriver driver;
	
	By email =By.cssSelector("input[id='user_email']");
	By password =By.cssSelector("input[type='password']");
	By loginbutton=By.cssSelector("input[value='Log In']");
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}


public WebElement getEmail()
	{
		return driver.findElement(email);
	}
 
 public WebElement getPassword()
	{
		return driver.findElement(password);
	}

 public WebElement clicklogin()
	{
		return driver.findElement(loginbutton);
	}
 
	
}
