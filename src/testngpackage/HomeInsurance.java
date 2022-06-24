package testngpackage;

import org.testng.annotations.Test;

public class HomeInsurance {
	
	@Test(priority=1)
	public void webLogin()
	{
		System.out.println("Home insurance weblogin");
	}
	@Test
	public void webLogout()
	{
		System.out.println("Home insurance weblogout");
	}
	@Test
	public void mobileLogin()
	{
		System.out.println("Home insurance mobilelogin");
	}
	@Test(priority=-4)
	public void mobileLogout()
	{
		System.out.println("Home insurance mobilelogout");
	}

}
