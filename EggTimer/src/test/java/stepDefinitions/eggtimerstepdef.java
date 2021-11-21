package stepDefinitions;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectrepository.ObjectRepository;
import testrunner.InitTest; 


public class eggtimerstepdef extends InitTest {	
	
	String timer="";
	String validTime;
	
	@Given("^user opens the web application$")
	public void user_opens_the_web_application() {		
		openUrl();
	}
	
	@When("user provides valid time {string}")
	public void user_provides_valid_time(String validTime) {		
		driver.findElement(By.id(ObjectRepository.startTime)).sendKeys(this.validTime=validTime);
		System.out.println("Entered valid time.");
	}
	
	@When("^user clicks on start button$")
	public void user_clicks_on_start_button() throws Exception {
		driver.findElement(By.xpath(ObjectRepository.validTime)).click();
		System.out.println("Clicked on start button.");
		Thread.sleep(2000);
	}
	
	//This method waits for the timer from 25 seconds to 0 second.
	//This method also verifies that we wait till the time provided by the user.
	@Then("^countdown timer starts$")
	public void countdown_timer_starts() {			
		while(!timer.equalsIgnoreCase("0 second"))			
		timer = driver.findElement(By.xpath(ObjectRepository.countDownTimer)).getText();	
		System.out.println("Count down completed."+timer);				
	}
	
	//Method to keep the time field blank
	@When("user keeps the time field blank")
	public void user_keeps_the_time_field_blank() {
		driver.findElement(By.id(ObjectRepository.startTime)).clear();
		System.out.println("Kept the time field blank.");
	}

	//Method to verify tooltip message.
	@When("verify tooltip message")
	public void verify_tooltip_message() {
		String tooltipMsg = driver.findElement(By.xpath(ObjectRepository.toolTip)).getAttribute("data-tip");
		if(tooltipMsg.equals("Please enter a valid time. Try \"15 minutes\" or \"9:00pm\""))
		System.out.println("Valid tooltip message shown to the user.");
	}

	//Method to enter string value in the time field.
	@Then("user provides string value in time field")
	public void user_provides_string_value_in_time_field() {
		driver.findElement(By.id(ObjectRepository.startTime)).sendKeys(ObjectRepository.stringValue);
		System.out.println("Entered string in time field.");
	}
	
	//Alert popup shown to the user.
	@Then("user is prompted with alert")
	public void user_is_prompted_with_alert() {
	    eggAlert();
	}
	
	//Close the browser.
	@Then("close the browser")
	public void close_the_browser() {
		tearDown();
	}
}
