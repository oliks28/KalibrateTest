package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Helper.TestBase;

public class KalibrateHomePage 
{
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id='hs_menu_wrapper_module_14640756389669909']/ul/li[4]/a")
	public static WebElement companyLink;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='hs_menu_wrapper_module_14640756389669909']/ul/li[4]/ul/li[5]/a")
	public static WebElement careersLink;
	
	
	@FindBy(how = How.XPATH, using= "//*[@id='hs-eu-confirmation-button']")
	public static WebElement acceptCookies;
	
	
	public void clickAcceptCookies()
	{
		
		acceptCookies.click();
	}
	
	public void clickCareers()
	{
	
		Actions ac = new Actions(TestBase.driver);
		ac.moveToElement(companyLink).build().perform();
		ac.moveToElement(careersLink).click().build().perform();
		
		
	}
}
