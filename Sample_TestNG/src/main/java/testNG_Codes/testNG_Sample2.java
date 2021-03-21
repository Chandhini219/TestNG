package testNG_Codes;

import org.testng.annotations.Test;

public class testNG_Sample2 {
	@Test(priority = 0)
	public void userLogin()
	{
		System.out.println("Login Successfully.");
	}

	@Test(priority = 1)
	public void sendMessage()
	{
		System.out.println("Message Sent.");
	}
	
	@Test(priority=2)
	public void userLogout()
	{
		System.out.println("Logout Successfully.");
	}
}
