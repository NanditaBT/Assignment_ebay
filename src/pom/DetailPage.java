package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasePage;

public class DetailPage  extends BasePage{
	
	public DetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath= "//span[@id='mm-saleDscPrc']")
	private WebElement price_for_book;
	
	@FindBy(xpath="//span[contains(text(),'Add to watch list')]")
	private WebElement AddToWatchList;
	

	public String getBookPrice()
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(price_for_book));
		return price_for_book.getText();
	}

	public void click_add_to_watch_list()
	{
		AddToWatchList.click(); 
	}
	
	}


