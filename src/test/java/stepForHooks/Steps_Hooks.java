package stepForHooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class Steps_Hooks {

	WebDriver driver = null;
	
	@Before(order = 1)
	public void browserSetup() {
		
		System.out.println("I am inside browser setup");
		System.setProperty("webdriver.chrome.driver", "C:/Users/patel/Webdriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Before(order = 0)
	public void setup2() {
		System.out.println("  I am inside setup2 \n");
	}
	
	@After(order = 1)
	public void teardown() {
		System.out.println("I am inside teardown");
		driver.quit();
	}
	
	@After(order = 2)
	public void teardown2() {
		System.out.println("        I am inside teardown2    \n");
		
		
	}
	
	@BeforeStep
	public void beforeSteps() {
		System.out.println("----I am inside beforesteps-----");
	}
	
	@AfterStep
	public void AfterSteps() {
		System.out.println("----I am inside Aftersteps-----");
	}
	
	
	@Given("user on login page")
	public void user_on_login_page() {
		System.out.println("User is on loginpage");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");	
		System.out.println("Username and password entered");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("Login is successful with valid username and password");

	}

	@Then("user is navigated to the homepage of website")
	public void user_is_navigated_to_the_homepage_of_website() {
	    System.out.println("After login homepage will display");

	}
}
