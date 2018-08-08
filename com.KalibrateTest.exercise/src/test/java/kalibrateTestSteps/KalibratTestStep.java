package kalibrateTestSteps;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Helper.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.ContactUsPage;
import pages.KalibrateCareersPage;
import pages.KalibrateHomePage;

public class KalibratTestStep extends TestBase 
{
	
	@Before
	public void setup() throws IOException 
	{
		initialize();
	}
	
	@Given("^the user is on the kalibrate home page$")
	public void the_user_is_on_the_kalibrate_home_page() throws Throwable 
	{
		driver.get(CONFIG.getProperty("testsiteName"));
	}

	@When("^the user clicks on careers$")
	public void the_user_clicks_on_careers() throws Throwable 
	{
		
		KalibrateHomePage hp = PageFactory.initElements(driver,KalibrateHomePage.class);
		hp.clickAcceptCookies();
		hp.clickCareers();
	}

	@When("^the user clicks on contact us$")
	public void the_user_clicks_on_contact_us() throws Throwable 
	{
	   
	   KalibrateCareersPage kcp = PageFactory.initElements(driver,KalibrateCareersPage.class);
	   kcp.clickContactUs();
	   
	}

	@Then("^the mandatory fields display the correct messages$")
	public void the_mandatory_fields_display_the_correct_messages() throws Throwable
	{
	    
		ContactUsPage cp = PageFactory.initElements(driver,ContactUsPage.class);
		cp.clickSubmit();
		String expected = cp.errorMessage.getText();
		String actual="Please complete this required field.";
		Assert.assertEquals(expected, actual);
		
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
}
