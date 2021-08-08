package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class HomePage extends ProjectBase {
	
	@Given("Click on App Launcher in the Left corner")
	public void click_on_app_launcher_in_the_left_corner() {
		WebElement eleToggleButton = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		eleToggleButton.click();
	}

	@Given("Click View All")
	public void click_view_all() {
		WebElement eleViewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		eleViewAll.click();
	}

	@Given("Click on Sales")
	public void click_on_sales() {
		WebElement eleSales = driver.findElement(By.xpath("//p[@class='slds-truncate'][text()='Sales']"));
		eleSales.click();
	}


}
