package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	
	
   @BeforeSuite
	public void lunchBrowser() {
	   startTime=System.currentTimeMillis();
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikashrs\\Downloads\\chromedriver.exe");
	   driver = new ChromeDriver();
   }
   
	@Test
	public void openGoogle() {
	
		driver.get("https://www.google.com/");
    	
	}
	
	@Test
    public void openBing() {
		
		driver.get("https://bing.com");
		
		
		
	}
	
    @Test
    public void openYahoo() {
    	
		driver.get("https://yahoo.com");
		
        
		

}
    @AfterSuite
    public void closeBrowser() {
//    	driver.quit();
    	endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time take"+totalTime);

    	
    }

}
