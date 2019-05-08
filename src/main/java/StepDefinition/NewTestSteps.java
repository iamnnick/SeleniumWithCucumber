package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTestSteps {

	WebDriver driver;
	@Given("^Open the Chrome browser and launch the application$")
	public void open_the_Chrome_browser_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Tools\\chromedriver.exe");					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("http://www.demo.guru99.com/v4");							
	    //throw new PendingException();
	}

	@When("^Enter the Username User(\\d+)and Password password(\\d+)$")
	public void enter_the_Username_User_and_Password_password(String username, String password) throws Throwable {
		 driver.findElement(By.name("uid")).sendKeys(username);					
	       driver.findElement(By.name("password")).sendKeys(password);
	    //throw new PendingException();
	}

	@Then("^Reset the credential	 by clicking reset button$")
	public void reset_the_credential_by_clicking_reset_button() throws Throwable {
		driver.findElement(By.name("btnReset")).click();
	    //throw new PendingException();
	}
}
