package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BasePage;

public class EbayHomePage  extends BasePage{
	
	public EbayHomePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath="(//h3[@class='s-item__title'])[1]")
	private WebElement firstSearch_result;
	
	@FindBy(xpath="//p[@class='page-notice__cell']")
	private WebElement ErrorText;
	
	@FindBy(xpath="//*[@class='gh-sb gh-sprRetina']")
	private WebElement Categories;
	
	@FindBy(id="gh-ac")
	private WebElement input_searchbox;
		
	@FindBy(xpath="//*[@type='submit']")
	private WebElement Search;
	
	public void clickSearch() {
		Search.click();
	}

	public void SelectCategories(String visibleText)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Select sc= new Select(Categories);
		sc.selectByVisibleText(visibleText);		
	}

	public String getErrorText()
	{
		return ErrorText.getText();
	}
	
	public void inputSearchText(String value)
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(input_searchbox));
		input_searchbox.sendKeys(value);
	}
	
	public void clickFirstLink()
	{
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(firstSearch_result));
		firstSearch_result.click();
	}
	
}
