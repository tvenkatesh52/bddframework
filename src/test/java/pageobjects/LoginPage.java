package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailEditbox;

	@FindBy(name="Password") 
	private WebElement passwordEditbox;

	@FindBy(css="button.button-1.login-button")
	private WebElement loginBtn;

	@FindBy(xpath="//a[contains(.,'Logout')]")
	private WebElement logoutLink;

	public void setEmail(String email) {
		emailEditbox.clear();
		emailEditbox.sendKeys(email);
	}

	public void setPassword(String pwd) {
		passwordEditbox.clear();
		passwordEditbox.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

	public void clickLogOutLink() {
		logoutLink.click();
	}

	public boolean isElementPresent(WebDriver driver, By by) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			driver.findElement(by);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	}

 

