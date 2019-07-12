package Selenium.Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef
{

	WebDriver driver;
	@Given("^User must be in Home Page$")
	public void user_must_be_in_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver=UtilityClass.startBrowser("Chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		System.out.println("User is in Home Page!!");
	}

	@When("^User should using Search Box$")
	public void user_should_using_Search_Box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("//*[@id='myInput']")).click();
		driver.findElement(By.xpath("//*[@id='myInput']")).sendKeys("head");
		driver.findElement(By.xpath("//input[@type='submit'and @value='FIND DETAILS'")).click();	
		WebDriverWait wait= new WebDriverWait(driver,10);
		Assert.assertEquals(driver.getTitle(), "Headphone");
}
	@Then("^Searched Product Should be Displayed$")
	public void searched_Product_Should_be_Displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals(driver.getTitle(), "Search");
		System.out.println("user is in search page");
		driver.close();
		
	}

}
