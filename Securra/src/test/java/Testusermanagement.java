

import org.openqa.selenium.WebDriver.Window;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.Browserhandling;
import Pages.Pagelogin;
import Pages.Usermanagement;

public class Testusermanagement extends Browserhandling {
	
	@Test (priority=0)
	public static void verfiyusername() throws InterruptedException
	{
		
		Pagelogin pagelogin=new Pagelogin(driver);
		//pagelogin.flag("In");
		Thread.sleep(2000);
		pagelogin.enterusername("8299910009");
		System.out.println("username entered");
		pagelogin.clickcontinue();
		System.out.println("continue button clicked");
		Thread.sleep(2000);
		pagelogin.enterpassword("Test@123");
		System.out.println("password entered");
	
		pagelogin.submit();
		System.out.println("submit button clicked");
	}

	
	@Test (priority=1)
	public void verfiyusermanagement() throws InterruptedException
	{
		
		
		
		Usermanagement usermgmt=new Usermanagement(driver);
		Thread.sleep(2000);
		System.out.println("user menu button clicked");
		Thread.sleep(2000);
		usermgmt.openteammgmt();
		Thread.sleep(2000);
		System.out.println("add button clicked");
		usermgmt.adduser();
		Thread.sleep(2000);
		System.out.println("add button clicked");
		 
		
		
		
	}
	@Test (priority=2)
	public void verifylengtherrormsg()
	{
		Usermanagement usermgmt=new Usermanagement(driver);
		String actualmsg=usermgmt.geterrormsg();
		String expectedmsg="Team name should be minimum 3 characters";
		Assert.assertEquals(actualmsg, expectedmsg);
		System.out.println("error message verified");
		
	}
//	@Test (priority=3)
//	public void verifyemptyerrormsg()
//	{
//		Usermanagement usermgmt=new Usermanagement(driver);
//		driver.navigate().refresh();
//		 usermgmt.adduserrerrors();
//	
//		String exceptedmsg="Required Field cannot be left blank";
//		Assert.assertEquals(actualmsg, exceptedmsg);
//		System.out.println("mandatory error message has been verified");
	

//	}

	
	
	

}
