package testngpackage;

import org.testng.annotations.Test;

public class VehicleInsurance {
	
	@Test(priority=1)
	public void webLogin()
	{
		System.out.println("vehicle insurance weblogin");
	}
	@Test
	public void webLogout()
	{
		System.out.println("vehicle insurance weblogout");
	}
	@Test
	public void mobileLogin()
	{
		System.out.println("vehicle insurance mobilelogin");
	}
	@Test(priority=-4)
	public void mobileLogout()
	{
		System.out.println("vehicle insurance mobilelogout");
	}
}
