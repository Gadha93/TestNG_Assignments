package testngpackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DataProviderParameter {
		
		@Parameters({"Uname","pwd"})
		@Test
		public void pgm(String Username,String Password)
		{
			System.out.println(Username);
			System.out.println(Password);
			
		}
}
