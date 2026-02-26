package testcase;

import org.testng.annotations.Test;

import BaseTest.Browserhandling;
import Pages.Pagelogin;

public class TestLogin extends Browserhandling

{
	@Test
	public static void verfiyusername() throws InterruptedException
	{
		
		Pagelogin pagelogin=new Pagelogin(driver);
		//pagelogin.flag("In");
		
		pagelogin.enterusername("8299910005");
		System.out.println("username entered");
		pagelogin.clickcontinue();
		System.out.println("continue button clicked");
		Thread.sleep(2000);
		pagelogin.enterpassword("Test@123");
		System.out.println("password entered");
	
		pagelogin.submit();
		System.out.println("submit button clicked");
	}
	
	

}
