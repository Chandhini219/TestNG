package testNG_Codes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suite_Example {
	
	WebDriver driver;
	long starttime;
	long closetime;
	
	@BeforeSuite
	public void launchBrouser()
	{
		starttime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	
	@Test
	public void googleLaunch()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void bingLaunch()
	{
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void yahooLaunch()
	{
		driver.get("https://in.yahoo.com/");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
		closetime=System.currentTimeMillis();
		long total_time=closetime-starttime;
		System.out.println("The total time is :"+total_time);
	}
	
}
