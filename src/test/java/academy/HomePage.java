package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.LandingPage;
import Pageobjects.LoginPage;
import resources.base;


public class HomePage extends base {


	
	public static Logger log=LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	
	{
		driver.get(prop.getProperty("url"));
		log.info("Url is exected successfully");
		LandingPage lp=new LandingPage(driver);
		lp.getlogin().click();
		log.info("Login button is clicked successfully");
		LoginPage l=new LoginPage(driver);
		l.getEmail().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		l.clicklogin().click();
		log.info("login successful");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[2][2];
		
		data[0][0]="Test1@gmail.com";
		data[0][1]="Test1";
		
		data[1][0]="Test2@gmail.com";
		data[1][1]="Test2";
		
		return data;
		
	}
	
	@AfterTest
	public void closeBrowser()
	
	{
		driver.close();
		driver=null;
		
	}

}
