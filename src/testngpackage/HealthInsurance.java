package testngpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HealthInsurance {

	@BeforeSuite()
	public void beforeSuiteMethod()
	{
		System.out.println("Run beforesuiteMethod");
	}
	@BeforeTest
	public void dbReset()
	{
		System.out.println("Run before test");
	}
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("Run beforeclassMethod");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Run beforemethod");
	}
	@Test
	public void webLogin()
	{
		System.out.println("Health insurance weblogin");
	}
	@Test
	public void webLogout()
	{
		System.out.println("Health insurance weblogout");
	}
	@Test(groups= {"Sanity"})
	public void mobileLogin()
	{
		System.out.println("Health insurance mobilelogin");
	}
	@Test
	public void mobileLogout()
	{
		System.out.println("Health insurance mobilelogout");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Run aftermethod");
	}
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("Run afterClassMethod");
	}
	
	@AfterTest
	public void reportGeneration()
	{
		System.out.println("Run after test");
	}
	@AfterSuite
	public void afterSuiteMethod()
	{
		System.out.println("Run afterSuiteMethod");
	}
}

