package academy;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import Pageobjects.Contributionsheet;
import resources.base;

public class FinanceEmployer extends base {

	public Contributionsheet cs;

	@BeforeTest
	public void initialize() throws IOException

	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	
	@Test(priority = 0)
	
	public void linksCount()
	
	{
		cs = new Contributionsheet(driver);
		List<WebElement> elementlinks =cs.getLinkscount();
		int Count =elementlinks.size();
		System.out.println(Count);
		
		for (int i=0;i<Count;i++)
		{
			String linkstext=elementlinks.get(i).getText();
			/*if (linkstext.equalsIgnoreCase("Create Web Account"))
			{
				driver.findElement(By.xpath("//a[@id='aCreateAccount']")).click();;
				
			}*/
			System.out.println(linkstext);
		}
		
	}
	
	@Test(priority = 1)
	public void validatelvdcweb2Login()

	{

		cs = new Contributionsheet(driver);
		cs.getUsername().sendKeys("lvfinpaps");
		cs.getPassword().sendKeys("Cgi!2345");
		cs.getLogin().click();
	   if (cs.getLabelerror().isDisplayed())
		{
			cs.getLabelerrorclick().click();
			cs.getUsername().sendKeys("lvfinpaps");
			cs.getPassword().sendKeys("Cgi!2345");
			cs.getLogin().click();
			cs.getPin().sendKeys("1234");
			cs.getPinlogin().click();
		}
	   
	   else {
		   cs.getPin().sendKeys("1234");
			cs.getPinlogin().click();  
	   }
		
		//Assert.assertEquals(lp.getTitle().getText(), "Your last session was terminated incorrectly or is currently active.");
	

	}
	@Test(priority = 2)
	public void ValidateFinancelink()
	
	{
		cs.financeLink().click();
	}

	@Test(priority = 3)
	public void selectEmployerdropdown() throws InterruptedException

	{

		Select select = new Select(cs.getemployer());
		select.selectByVisibleText("International Solar Industries Ltd - 85002");
		driver.manage().timeouts().pageLoadTimeout(6, TimeUnit.SECONDS);
		Thread.sleep(5000);
		cs.getContributionSources().click();

		// cs.getlogoff().click();

	}
	

	@Test(priority = 4)
	public void applyContributionsources() throws InterruptedException {

		cs = new Contributionsheet(driver);
		Thread.sleep(3000);
		cs.getAllcheckbox().click();
		cs.getApplycontributionsources().click();

	}
	
	@Test(priority = 5)
	
	public void addContributionsources() throws InterruptedException {
		
		
	}

	/*
	 * public static void clickOn(WebDriver driver, WebElement locator, int timeout)
	 * throws InterruptedException
	 * 
	 * { new WebDriverWait( driver, timeout
	 * ).ignoring(NoSuchElementException.class).until(ExpectedConditions.
	 * elementToBeClickable(locator));
	 * 
	 * locator.click(); }
	 * 
	 * 
	 * 
	 * /*@AfterTest public void closeBrowser()
	 * 
	 * {
	 * 
	 * driver.quit(); }
	 */

}
