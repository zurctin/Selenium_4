package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\Selenium4Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, null);
		driver.manage().timeouts().setScriptTimeout(2, null);
		driver.manage().timeouts().pageLoadTimeout(10, null);

		driver.get("https://www.google.com/");
		
		driver.close();
		
	}

}
