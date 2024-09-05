package FillingFormInSingleStatement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FillFormInSingleLine {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Actions actions = new Actions(driver);
		Action seriesOfAction = actions.moveToElement(driver.findElement(By.id("user-name")))
				.click()
				.sendKeys("standard_user", Keys.TAB)
				.sendKeys("secret_sauce", Keys.ENTER).build();
		
		seriesOfAction.perform();	
		
		driver.quit();
				
		
		

	}

}
