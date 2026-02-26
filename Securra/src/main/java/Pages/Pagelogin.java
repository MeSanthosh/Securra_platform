package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pagelogin {
	
	
	WebDriver driver;
	
	//constructor
	public Pagelogin (WebDriver driver)
	{
		this.driver=driver;
	}

	
	//locators
	private By username=By.xpath("//input[@placeholder='Phone number']");
	private By contuine=By.xpath("//button[@type='submit']");
	private By password=By.xpath("//input[@type='password']");
	private By login=By.xpath("//button[@type='submit']");
	private By flags=By.className("react-international-phone-country-selector-button__button-content");
			
	//actions
	public void flag(String country)
	{
		driver.findElement(flags).sendKeys(country);
	}
	public void enterusername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void clickcontinue()
	{
		driver.findElement(contuine).click();
	}
	
	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void submit()
	{
		driver.findElement(login).click();
	}
	
	//business logic
	public void login(String user,String pass, String country)
	{
		flag(country);
		enterusername(user);
		clickcontinue();
		enterpassword(pass);
		submit();
		
		
	}
	
	
}
