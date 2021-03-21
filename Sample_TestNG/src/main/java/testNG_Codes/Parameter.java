package testNG_Codes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Test
	@Parameters("Name")
	public void getValues(String name)
	{
		System.out.println("Hai. How are you "+name + "?");
	}
}
