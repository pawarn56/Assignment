package page_Object;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flight01 
{
WebDriver driver;
	
	public Flight01(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@id='name']")
	WebElement Fullname;
	
	@FindBy(xpath="//input[@id='orgName']")
	WebElement orgname;
	
	@FindBy(xpath="//input[@id='singUpEmail']")
	WebElement Email;
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[2])")
	WebElement dropdown;
	
	
	
	public void signup() 
	{

		Fullname.sendKeys("Nilesh Ananta Pawar");
		orgname.sendKeys("Mindtree Ltd");
		Email.sendKeys("nilpawar56@gmail.com");
		
	}
	
	public void checkbox()
	{
		checkbox.click();		
	}
	public void submitbtn() 
	{
		submit.click();
	}
	
	
	public void dropdown()
	{
		Actions act= new Actions(driver);
		act.moveToElement(dropdown).click().build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
    
		

}

	
		// TODO Auto-generated method stub
		
	}
