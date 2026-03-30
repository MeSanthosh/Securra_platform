package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Usermanagement {
	
	WebDriver driver;
	//constructor
	public Usermanagement(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	
	private By menu=By.xpath("//span[normalize-space()='Team Management']");
	private By adduserbtn=By.xpath("//button[normalize-space()='Add team']");
	private By teamname=By.xpath("//input[@name='team_name']");
	private By teamdesc=By.xpath("//textarea[@name='description']");
	private By createteambtn=By.xpath("//button[@type='submit' and text()='Create Team']");
	private By nameerror=By.xpath("//p[text()='Team name should be minimum 3 characters']");
	private By emptyerror=By.xpath("//p[text()='Required Field cannot be left blank']");
	
	//action
	public void openteammgmt()
	{
		driver.findElement(menu).click();
	}
	public void adduser() 
	{
		driver.findElement(adduserbtn).click();
	
		 driver.findElement(teamname).sendKeys("T");
		 //driver.findElement(teamdesc).sendKeys("This is a testing team");
		 
		
		driver.findElement(createteambtn).click();
	}
	public String geterrormsg()
	{
		return driver.findElement(nameerror).getText();
				
		
	}
	public void adduserrerrors()
	{
		//driver.findElement(adduserbtn).click();
		
		// driver.findElement(teamname).sendKeys("");
		 //driver.findElement(teamdesc).sendKeys("This is a testing team");
		 
		
		driver.findElement(createteambtn).click();
		 String error= driver.findElement(emptyerror).getText();
		
	}
	
	//bussiness logic
	
	public void usermanagementpage()
	{
		Usermanagement usermgmt=new Usermanagement(driver);
		usermgmt.openteammgmt();
		usermgmt.adduser();
		usermgmt.geterrormsg();
		
		
	}

}

