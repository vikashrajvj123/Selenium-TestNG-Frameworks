package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
    @Test
	public void openGoogle(){
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikashrs\\Downloads\\chromedriver.exe");
  	   WebDriver driver = new ChromeDriver();
  	 driver.get("https://www.google.com/");
  	 driver.quit();
	}
    @Test
    public void openBing() {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikashrs\\Downloads\\chromedriver.exe");
   	   WebDriver driver = new ChromeDriver();
   	   driver.get("https://bing.com");
   	   driver.quit();
	}
}
