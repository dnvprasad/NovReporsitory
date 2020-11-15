package genericLib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	@BeforeClass
	public void configBC()
	{
		System.out.println("Launch the Browser");
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("Close the Browser");
	}
	
	@BeforeMethod
	public void configBM()
	{
		System.out.println("Login Application");
	}
	
	@AfterMethod
	public void configAM()
	{
		System.out.println("Logout App");
	}

}
