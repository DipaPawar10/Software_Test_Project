package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class CrossBrowserTestingDemo {
	WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser) {
		
		switch(browser.toLowerCase())
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
			break;	
			
		case "msedge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\edgedriver_win64\\msedgedriver.exe");
			driver= new EdgeDriver();
			break;
		
		default:
			driver=null;
			break;
		}
	}
	
	@Test
	public void verifyTitle() {
		driver.get("https://www.google.co.in/");
		String expectedTitle = "Google";
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}
	
	@AfterMethod
	public void Quit() {
		driver.quit();
	}

}
