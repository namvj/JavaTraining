package P2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Feb_reg 
{
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']") public static WebElement createacc;
	@FindBy(name="firstname") public static WebElement fname;
	@FindBy(name="lastname") public static WebElement lname;
	@FindBy(id="day") public static WebElement day;
	@FindBy(id="month") public static  WebElement mnth;
	@FindBy(id="year") public static WebElement yr;
	@FindBy(xpath="//label[@class='_58mt']") public static WebElement gender;
}
