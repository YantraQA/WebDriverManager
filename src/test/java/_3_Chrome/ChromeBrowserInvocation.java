package _3_Chrome;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserInvocation 
{
	
	static WebDriver driver;
	
	@Before
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
	}
	
	@Test
	public void _0_Test() throws InterruptedException
	{
		System.out.println("Current Invoked Appication Landing Page Title Is : " + driver.getTitle());
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}

}
