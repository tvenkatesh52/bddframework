package stepdef;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;

public class LoginStepDefinition {
	private WebDriver driver;
	LoginPage lpg;
	private WebDriverWait wait;
	@Given("^I want to open chrome browser$")
	public void i_want_to_open_chrome_browser() throws Throwable {
		//launch the browser
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		//add implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		lpg=new LoginPage(driver);

	}

	@Given("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
		
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email,String pwd) {
		lpg.setEmail(email);
		lpg.setPassword(pwd);
	}

	@When("click on login button")
	public void click_on_login_button() {
		lpg.clickLoginBtn();
		
	}
   
	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
	
		 if(driver.getPageSource().contains("Login was unsuccessful")) {
			 driver.close();
			 Assertions.assertTrue(driver.getTitle().contains("Your store. Login"));
			 //Assert.assertTrue(false);
			 
		 }else {
			 Assertions.assertEquals(title, driver.getTitle());
		 }
	}

	@When("user clicks on logout link")
	public void user_clicks_on_logout_link() {
		lpg.clickLogOutLink();
	}
		

	@Then("close the browser")
	public void close_the_browser() {
		if(driver!=null) {
			driver.quit();
		}
	}


}
