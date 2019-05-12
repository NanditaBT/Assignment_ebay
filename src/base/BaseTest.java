package base;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{
 public WebDriver driver;
 
 @BeforeMethod
 public void precondition()
 {
 System.setProperty(CHROME_KEY, CHROME_VALUE);
 driver= new ChromeDriver();
 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	driver.get(Utility.getPropValue("url", System.getProperty("user.dir")+"./config.properties"));
	driver.manage().window().maximize();
 }
 
 
 @AfterMethod
 public void postcondition()
 {
	 driver.quit();
 }
}
