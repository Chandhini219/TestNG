package testNG_Codes;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = {"A"})
	public void apple1()
	{
	System.out.println("Apple1 executed");	
	}
	@Test(groups = {"A"})
	public void apple2()
	{
		System.out.println("Apple2 executed");
	}
	@Test(groups = {"B"}) 
	public void vivo1()
	{
		System.out.println("vivo1 executed");
	}
	@Test(groups = {"B"})
	public void vivo2()
	{
		System.out.println("vivo2 executed");
	}
	@Test(groups = {"C"})
	public void moto1()
	{
		System.out.println("moto1 executed");
	}
	@Test(groups = {"C"})
	public void moto2()
	{
		System.out.println("moto2 executed");
	}
}
	
