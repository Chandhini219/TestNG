package testNG_Codes;

import org.testng.annotations.Test;

public class SkipTest_Case {
	@Test(priority = 0)
	public void userLogin()
	{
		System.out.println("Login Successfully.");
	}

	@Test(priority = 1,enabled = false)
	public void sendMessage()
	{
		System.out.println("Message Sent.");
	}
	
	@Test(priority = 1,enabled = false)
	public void userLogout()
	{
		System.out.println("Logout Successfully.");
	}

}
