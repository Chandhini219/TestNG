package testNG_Codes;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertion_Examples {
	
	String name="coimbatore";
	boolean value=true;
	
	
	@Test
	public void Example()
	{
		//String
		Assert.assertEquals(name,"coimbatore");
		//Assert.assertEquals(name, "Coimbatore");
		
		//Boolean
		Assert.assertTrue(value,"It is true");
		//Assert.assertFalse(value, "It is false");
	}

}
