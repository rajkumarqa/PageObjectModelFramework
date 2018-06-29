package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pageobjects.LandingPage;
import resources.base;


public class ValidateTitle extends base {

	public static Logger log=LogManager.getLogger(base.class.getName());
	

@BeforeTest
	 public void initialize() throws IOException {
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void titlevalidation() throws IOException

	{
		LandingPage lp = new LandingPage(driver);
		
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES123");
	
	}

	@AfterTest
    public void closeBrowser()

	{
		driver.close();
		driver=null;

	}
}
