package testcase;

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
		System.out.println("add button clicked");
		 Thread.sleep(2000);
		String Actualerror= usermgmt.geterrormsg();
		String Expectederror="Team name should be minimum 3 characters";
		Assert.assertEquals(Actualerror, Expectederror);
		System.out.println("error message verified");
		
	}
	
	
	
	

}
