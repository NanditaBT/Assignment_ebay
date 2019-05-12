package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class LoginPage  extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="userid")
	private WebElement EnterEmailAddress;
	
	@FindBy(id="pass")
	private WebElement EnterPassword;
	
	@FindBy(id="sgnBt")
	private WebElement SignIn;
	

	public void Login(String username,String password)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(EnterEmailAddress));
		EnterEmailAddress.sendKeys(username);
		EnterPassword.sendKeys(password);
		SignIn.click();
		
	}

	
	}


