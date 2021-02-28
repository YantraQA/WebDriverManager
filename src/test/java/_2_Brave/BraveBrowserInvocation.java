package _2_Brave;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BraveBrowserInvocation 
{
	
	static WebDriver driver;
	String braveBrowserPath = "C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe";
	
	@Before
	public void setUp()
	{
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setBinary(braveBrowserPath);
		
		driver = new ChromeDriver(options);
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
