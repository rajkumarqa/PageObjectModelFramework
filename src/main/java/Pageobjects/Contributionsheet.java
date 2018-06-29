package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contributionsheet {

	WebDriver driver;
	// LVdcweb2 login
	By username = By.xpath("//*[@id='txtUserName']");
	By password = By.xpath("//input[@id='txtPassword']");
	By login = By.xpath("//input[@id='btnLogin']");
	// PIN
	By pin = By.xpath("//input[@id='txtUserPin']");
	By Pinlogin = By.xpath("//input[@id='btnLogin']");

	// Lvdcweb2 LVfinanceEmployer link

	By financelink = By.xpath("//span[contains(text(),'LVFinanceemployer')]");
	
	//Employerdropdown
	By empdropdown = By.xpath("//select[@id='ddlEmployer']");
	
	//Logout
	By logoff = By.xpath("//button[@class='btn btn-default butImgLogout']");
	
	//Add contribution sources
	By contributionsources = By.xpath("//*[@name='btnContributionSources']");
	By Allcheckbox = By.xpath("//input[@name='chkAllContributionSources']");
	By applycontribution = By.xpath("//*[@id=\"btnApplyContributionSources\"]");
	
	

	//label error
	By labelerror = By.xpath("//*[contains(text(),'Your last session was terminated incorrectly or is currently active.')]");
	By labelerrorclick = By.xpath("//a[@id='lnkLogin']");
	
	//Add Line
	
	//*[@id="btnAddLine"]
	
	//linkscount in loginpage
	
	By linkscount = By.tagName("a");
	
	public Contributionsheet(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement getUsername()

	{
		return driver.findElement(username);

	}

	public WebElement getPassword()

	{

		return driver.findElement(password);
	}

	public WebElement getLogin()

	{
		return driver.findElement(login);

	}

	public WebElement getPin()

	{
		return driver.findElement(pin);

	}

	public WebElement getPinlogin()

	{
		return driver.findElement(Pinlogin);

	}

	public WebElement financeLink()

	{
		return driver.findElement(financelink);

	}
	
	public WebElement getemployer()

	{
		return driver.findElement(empdropdown);

	}

	public WebElement getlogoff()

	{
		return driver.findElement(logoff); 

	}
	
	public WebElement getContributionSources()

	{
		return driver.findElement(contributionsources);

	}
	
	public WebElement getAllcheckbox()

	{
		return driver.findElement(Allcheckbox);

	}
	
	public WebElement getLabelerror()

	{
		return driver.findElement(labelerror);

	}
	
	
	public WebElement getLabelerrorclick()

	{
		return driver.findElement(labelerrorclick);

	}
	
	public WebElement getApplycontributionsources()

	{
		return driver.findElement(applycontribution);

	}
	public List<WebElement> getLinkscount()
	
	

	{
		return driver.findElements(linkscount);
	}
}



















