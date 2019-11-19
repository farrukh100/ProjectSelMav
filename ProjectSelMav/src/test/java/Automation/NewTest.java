package Automation;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	private static WebDriver driver= null;
	private static Logger logger= null;
	
  @Test
  public void f() {
	  
	  
	  //String service = "..\\ProjectSelMav\\drivers\\chromedriver\\chromedriver.exe";
	  String service = ".\\drivers\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", service);
		driver = new ChromeDriver();
		
      logger=Logger.getLogger("DPCRM");
		
		//PropertyConfigurator.configure("..\\ProjectSelMav\\Log4j.properties.txt");
		PropertyConfigurator.configure(".\\Log4j.properties.txt");
		logger.info("Browser Opened");
	  
		driver.get("http://www.wikipedia.org");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get(Constant.URL);
		driver.manage().window().maximize(); 
	  
  }
}
