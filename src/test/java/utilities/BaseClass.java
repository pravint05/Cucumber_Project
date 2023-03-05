package utilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	public WebDriver LaunchBrowser() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}
