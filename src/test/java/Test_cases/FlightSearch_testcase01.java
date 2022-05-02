package Test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.Test;

import page_Object.Flight01;

public class FlightSearch_testcase01 
{
	public WebDriver driver;
	
	Flight01 f1= new Flight01(driver);
	
	@BeforeClass
	public void Initialization()
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");	
	}
	
	@Test(priority=1)
	public void signup_Test() 
	{
		f1.signup();
		f1.checkbox();
		f1.submitbtn();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String actual=driver.switchTo().alert().getText();
		if(actual.equalsIgnoreCase("A welcome email has been sent. Please check your email."))
		{
			Assert.assertTrue(true);
			driver.switchTo().alert().accept();	
			System.out.println("Signup succeful");
		}
		
	}
	
	@Test(priority=0)
	public void Test01()
	
	{
		f1.dropdown();
	}
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	
}
