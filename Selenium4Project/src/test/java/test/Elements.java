package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Elements {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\Selenium4Project\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, null);
	driver.manage().timeouts().setScriptTimeout(2, null);
	driver.manage().timeouts().pageLoadTimeout(10, null);

	driver.get("https://www.google.com/");
	
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("ABCD");
	
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	List<WebElement> options = (List<WebElement>) driver.findElement(By.name("Optionwithcheck[]"));
	
	for(WebElement element : options) {
		System.out.println(element.getText());	
	}
	
	driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Christina");
	driver.navigate().to("https://testautomationpractice.blogspot.com/");
	WebElement loginButton = driver.findElement(By.id("FSsubmit"));
	
	driver.findElement(RelativeLocator.withTagName("input").above(loginButton)).sendKeys("ABCD");
	
	driver.close();
	driver.quit();
	}

}