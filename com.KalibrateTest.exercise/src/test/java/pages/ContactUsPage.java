package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUsPage
{
	
	WebDriver driver;
	

	  @FindBy(how = How.XPATH, using = "//*[@type='submit']")
	  public static WebElement submitButton;
	  
	  
	  @FindBy(how = How.CSS, using = ".hs-error-msgs.inputs-list>li>label")
	  public static WebElement errorMessage;
	  
	  
	  public void clickSubmit()
	  {
		  
		  submitButton.click();
	  }

}
