package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.BaseClass;

public class LoginStepDef extends BaseClass {
	
	BaseClass BC;
	WebDriver driver;
	LoginPage Log; 
	HomePage Home;
	
	@Given ("User launch Browser")
	public void OpenBrowser()
	{
		 BC = new BaseClass();
		 this.driver=BC.LaunchBrowser();
		this.Log= new LoginPage(driver);
		this.Home=new HomePage(driver); 
	}

	@And ("^User opens URL \\\"(.*)\\\"$")  //or use this ("^User opens URL \"([^\"]+)\"$")
	public void OpenPortal(String Url)
	{
		driver.get(Url); 
	}
	
	@When("^User add Email \\\"(.*)\\\" and password \\\"(.*)\\\"$") //use ^in start and $ in last
	public void AddCredentials(String mAil, String Pass)
	{  
		 Log.EnterMail(mAil);
		 Log.EnterPSW(Pass);
	}
	
	@And ("Login page title get captured")
	public void LoginPageTitleCaptured()
	{
		Log.getTitleOfLoginPage();
	}
	
	@And ("user click on login button")
	public void ClickLoginBTN()
	{
		Log.ClickBTN();
	}
	
	@Then ("Home page URL captured")
	public void HomePageURLCaptured()
	{
		Home.getHomepageURL();
	}
	
	@And ("Operator Name captured")
	public void OperatorNameTitleCaptured()
	{
		Home.getOperatorTitle();
	}
	
	@And ("user click on logout")
	public void ClickLogoutBTN()
	{
		Home.clickLogout();
	}
	
}
