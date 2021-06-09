package P2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Facebook_reg_PF 
{

	WebDriver driver;
	
	public void openurl()
	{ 
		driver = new ChromeDriver();
		PageFactory.initElements(driver, Feb_reg.class);    
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		System.out.println("hello");
	}
	public void createaccount()
	{
		Feb_reg.createacc.click();			
	}
	public void register_newuser()
	{
		Feb_reg.fname.sendKeys("abcd");
		Feb_reg.lname.sendKeys("xyza");
		//mobile number
		//pwd....
				
		new Select(Feb_reg.day).selectByVisibleText("10");
		
		new Select(Feb_reg.mnth).selectByIndex(5);
		
		new Select(Feb_reg.yr).selectByValue("1996");
	
		Feb_reg.gender.click();
		System.out.println("Executed Successfully!!!");
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	public static void main(String[] args) throws Exception
	{
		Facebook_reg_PF fb=new Facebook_reg_PF();
		fb.openurl();
		fb.createaccount();
		fb.register_newuser();	
		fb.closeBrowser();
	}

}
