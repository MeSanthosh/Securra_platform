package BaseTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserhandling {
	
	//WebDriverManager.chromedriver().setup();
	public static ChromeDriver driver;
	@BeforeMethod
	public static void browser()
	{
		System.out.println("browser handling");
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.get("https://blueprint.securra.com/login");
		System.out.println("browser opened");
		
	}
	@AfterMethod 
	public static void teardown()
	{
		
		driver.quit();
	}

}
