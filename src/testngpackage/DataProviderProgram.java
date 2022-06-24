package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderProgram {
	
	
	@Test(dataProvider="getLogin")
	public void swagLabsLogin(String Username,String Password) throws InterruptedException
	{
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(Username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-button")).click();
		
		if(Username=="locked_out_user")
		{
		String expected="Sauce Labs Backpack";
		String actual=driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
		//String actual=driver.findElement(By.cssSelector(".error-message-container.error")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		}
	}
	@DataProvider
	public Object[][]getLogin()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
		return data;
		//String expected = "Discover your next dream destination";
		//String actual = driver.findElement(By.xpath("//div[@class='Text-module__root--variant-body_1___2uON5']"))
			//	.getText();
		// Thread.sleep(2000);
		//System.out.println(actual);
		
		
	}

}
