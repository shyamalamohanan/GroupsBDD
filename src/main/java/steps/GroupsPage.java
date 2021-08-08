package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GroupsPage extends ProjectBase {

	@Given("click on More tab")
	public void click_on_more_tab() {
		WebElement eleMoreDropDown = driver.findElement(By.xpath("//span[@class='slds-p-right_small'][text()='More']"));
		eleMoreDropDown.click();
	}

	@Given("Click on Groups")
	public void click_on_groups() {
		WebElement eleGroups = driver.findElement(By.xpath("//a[@role='menuitem']//span[text()='Groups']"));
		js.executeScript("arguments[0].click();", eleGroups);
	}

	@Given("Click on New")
	public void click_on_new() {
		WebElement eleNew = driver.findElement(By.xpath("//a[@role='button'][@title='New']"));
		eleNew.click();
	}

	@Given("Enter Name {string}")
	public void enter_name(String Name) {
		WebElement eleName = driver.findElement(By.xpath("//input[@type='text'][@aria-required='true']"));
		wait.until(ExpectedConditions.visibilityOf(eleName));
		eleName.sendKeys(Name);
	}

	@When("Click on Save")
	public void click_on_save() {
		WebElement eleSave = driver.findElement(By.xpath("//button//span[text()='Save & Next']"));
		eleSave.click();
	}

	@Then("Verify the displayed message")
	public void verify_the_displayed_message() {
		String expectedMsg = "These required fields must be completed: Access Type";
		WebElement eleErrorMsg = driver.findElement(By.xpath("//ul[@class='errorsList']//li"));
		String actualMsg = eleErrorMsg.getText();	
		Assert.assertEquals(actualMsg, expectedMsg, "The error message is not displayed as expected! Please Verify!!");
	}
}
