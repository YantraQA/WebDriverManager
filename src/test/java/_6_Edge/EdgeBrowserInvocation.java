package _6_Edge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserInvocation 
{
	
	static WebDriver driver;
	
	@Before
	public void setUp()
	{
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
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
