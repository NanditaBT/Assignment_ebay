package base;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;;

public class Utility {
		
public static Properties prop;
	
	public static String getPropValue(String key,String file) 
	{
		String value=null;
		prop = new Properties();
		
		try
		
		{
		InputStream s1= new FileInputStream(file);
		prop.load(s1);
		value=prop.getProperty(key);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
}
