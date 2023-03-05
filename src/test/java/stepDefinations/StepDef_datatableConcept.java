package stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.BaseClass;


public class StepDef_datatableConcept extends BaseClass {
	
	BaseClass BC;
	WebDriver driver;
	LoginPage Log; 
	HomePage Home;
	
	@Given ("User launches Browser")
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
	
	@When("User add Email and password")
	public void dataTable(DataTable table) {
		List<String> data = table.asList();
		Log.EnterMail(data.get(0));
		Log.EnterPSW(data.get(1));
	}
	
}
