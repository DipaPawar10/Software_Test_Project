package CookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazone.in/");
		//capture all the cookies
		Set <Cookie> cookiesList = driver.manage().getCookies();
		
		//print size/number of cookies
		System.out.println("Before adding cookies:" + cookiesList.size());
		
//		for(Cookie ck:cookiesList) {
//			System.out.println(ck.getName() + ":" + ck.getValue());
//			}
		
		//get specific cookie accourding to name 
//		System.out.println(driver.manage().getCookieNamed("__cmpcc:1"));
		
		//Create Cookie
		Cookie cookieObje = new Cookie("TestCookie","www.amazone.in");
		
		//add cookie to browser
		driver.manage().addCookie(cookieObje);
		
		//capture all cookies
		cookiesList = driver.manage().getCookies();
		
		//print size/number of cookies
		System.out.println("\nAfter adding size:" + cookiesList.size());
		
		for(Cookie ck:cookiesList) {
			System.out.println(ck.getName() + ":" + ck.getValue());
			}
		//delete cookie
		//driver.manage().deleteCookie(cookieObje);
		
		//delete cookie by name
		//driver.manage().deleteCookieNamed("TestCookie");	
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		//capture all cookies
		cookiesList = driver.manage().getCookies();
				
		//print size/number of cookies
		System.out.println("\n \nAfter deleting size:" + cookiesList.size());
				
		for(Cookie ck:cookiesList) {
			System.out.println(ck.getName() + ":" + ck.getValue());
			}
		
		
		
		driver.quit();	
		}

}
