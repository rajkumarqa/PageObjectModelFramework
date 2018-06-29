package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	 private WebDriver driver;
	
	By signin =By.cssSelector("a[href*='sign_in']"); 
	By title= By.cssSelector(".text-center>h2");
	By contacttab =By.cssSelector("a[href*='contact']");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;     
	}

 public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	
 public WebElement getTitle()
 
 {
	 return driver.findElement(title);  
	 
 }
 
 public WebElement getContactab()
 
 {
	 return driver.findElement(contacttab);  
	 
 }
 
}


