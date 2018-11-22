package src;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfterBrowser {
	ChromeDriver dr;
	
	@Before
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
		dr= new ChromeDriver();
		dr.get("\"https://www.macys.com/\"");
		Thread.sleep(2000);
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		dr.quit();
		
		
	}
	
}
	


