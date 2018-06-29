package resources;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver driver;
	public static Properties prop;

	
	     //generic method to initialize different browser
	
	public WebDriver initializeDriver() throws IOException
	{
		//properties class is used to get data from external file
		
		prop=new Properties();
	    FileInputStream fis=new FileInputStream("C:\\Users\\rajkumar\\E2EProj\\src\\main\\java\\resources\\data.Properties");	
	    prop.load(fis); //loading into the object of properties class
	    
	    prop.getProperty("browser"); // getting the required data/properties form external resource file
	    
	    String browsername =prop.getProperty("browser"); //assigning the value of that property in string variable
	    
	    
	    
	    
	    if (browsername.equals("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
	    	driver=new ChromeDriver();
	    }

	    else if (browsername.equals("firefox"))
	    
	    {
	    	System.setProperty("Webdriver.firefox.driver","C:\\Selenium Software\\geckodriver.exe");
	    	 driver=new FirefoxDriver();
	    }
	    
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //waits x seconds to load wethis applies for every test case i.e. do not fail test case untill x seconds
	   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	   
	   return driver;
	}
	
	
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("D:\\Selenium Test\\screenshots_test failure\\"+result+"screenshot.png") );
		
	}
	 
}
