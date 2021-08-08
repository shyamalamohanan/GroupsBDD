package steps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImplementation extends ProjectBase{

	@Before
	public void StartApp() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		js = (JavascriptExecutor) driver;	

		driver.get("https://login.salesforce.com/");

	}


	@After
	public void closeApplication() {
		driver.close();
	}
}

