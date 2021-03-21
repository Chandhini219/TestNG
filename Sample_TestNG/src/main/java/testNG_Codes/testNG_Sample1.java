package testNG_Codes;

import org.testng.annotations.Test;

public class testNG_Sample1 {
	

	@Test
	public void userLogin()
	{
		System.out.println("Login Successfully.");
	}

	@Test
	public void sendMessage()
	{
		System.out.println("Message Sent.");
	}
	
	@Test
	public void userLogout()
	{
		System.out.println("Logout Successfully.");
	}

}
