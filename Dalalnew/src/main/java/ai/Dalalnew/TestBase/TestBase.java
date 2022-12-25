package ai.Dalalnew.TestBase;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public String browser;
	public static Logger logger;
	//@Test
	@BeforeClass
	public void start()
	{
		 logger=Logger.getLogger("Dalalnew framwork execution started");
		 PropertyConfigurator.configure("Loj.Properties");
		 logger.info("Framwork execution is started");
	}
	@AfterClass
	public void end()
	{
		logger.info("Framwork execution is ended");
	}
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser)
	{
		
		 if(browser.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 else if(browser.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		 }
		 else if(browser.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		 }
		 else
		 {
			 logger.info("Please provide Valid browsername");
		 }
		
		 driver.get("https://apps.dalalstreet.ai/login");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
	 }
	
	
	

}
