package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver hdriver;

	@FindBy(xpath = "//h6[text()='TELLSTAR']")
	private WebElement Title;
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement Logout;

	public HomePage(WebDriver driver) {
		this.hdriver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickLogout() {
		Logout.click();
	}

	public void getHomepageURL() {
		System.out.println(hdriver.getCurrentUrl());
	}

	public void getOperatorTitle() {
		System.out.println(Title.getText());
	}

}
