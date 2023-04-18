package StepDefinition2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 {
 WebDriver driver;
	@Given("user is  on homepage")
	public void user_is_on_homepage() {

		System.setProperty("webdriner.edge.driver", "C:\\Users\\deals\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe")	;
		WebDriver driver = new FirefoxDriver();
		
		this.driver=driver;
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("user navigates to Login Page")
	public void user_navigates_to_login_page() {
		
	    driver.findElement(By.linkText("Sign in")).click();
	}

	@And("user enters username and Password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.id("login1")).sendKeys("jh");
	    driver.findElement(By.id("password")).sendKeys("kjhg");
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User login with username {string} and password {string}")
	public void user_login_with_username_and_password(String un, String pw) {
		 driver.findElement(By.id("login1")).sendKeys(un);
		    driver.findElement(By.id("password")).sendKeys(pw);
	}


}
