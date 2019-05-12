package test_scripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import base.Utility;
import pom.DetailPage;
import pom.EbayHomePage;
import pom.LoginPage;
;
public class TestCase_01 extends BaseTest{
	
	@Test
	public void TestCase_01()
	{
		EbayHomePage page= new EbayHomePage(driver);
		page.SelectCategories("Books");
		page.clickSearch();
		String errortext = page.getErrorText();
		
		Assert.assertEquals(errortext,Utility.getPropValue("info_text", System.getProperty("user.dir")+"./config.properties"));
		page.inputSearchText(Utility.getPropValue("texttosearch", System.getProperty("user.dir")+"./config.properties"));
		page.clickSearch();
		page.clickFirstLink();
		DetailPage dp = new DetailPage(driver);
		String price_for_book = dp.getBookPrice();
		System.out.println(price_for_book);
		dp.click_add_to_watch_list();
		
		LoginPage login_page = new LoginPage(driver);
		login_page.Login(Utility.getPropValue("userid", System.getProperty("user.dir")+"./config.properties"), Utility.getPropValue("password", System.getProperty("user.dir")+"./config.properties"));	
	}

}
