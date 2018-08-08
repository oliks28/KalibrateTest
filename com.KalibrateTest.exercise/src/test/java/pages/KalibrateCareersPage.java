package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class KalibrateCareersPage 
{
	
  WebDriver driver;
	

  @FindBy(how = How.XPATH, using = "//*[@id='hs_cos_wrapper_widget_4093774224']/p[4]/a/strong")
  public static WebElement contactUsLink;
  
  
  public ContactUsPage clickContactUs()
  {
	  
	  contactUsLink.click();
	  
	  return new ContactUsPage();
  }
	
}
