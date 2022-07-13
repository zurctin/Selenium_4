package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\Selenium4Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		//findelements
//		driver.get("https://www.google.com/");
//		WebElement searchBox = driver.findElement(By.name("q"));
//		searchBox.sendKeys("selenium" + Keys.ENTER);
//		driver.findElement(By.name("btnK")).click();
		
		//findelements
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> elements = (List<WebElement>) driver.findElement(By.tagName("select"));
		
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		
		//find element within element
		driver.get("https://www.google.com/");
		WebElement input = driver.findElement(By.tagName("input"));
		input.findElement(By.name("q")).sendKeys("ABCD" + Keys.ENTER);
		
		//getactive element
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		String title = driver.switchTo().activeElement().getAttribute("Search");
		System.out.println(title);
		
		//get tagname, text, css
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		String tagName = searchBox.getTagName();
		String text = searchBox.getText();
		String cssValue = searchBox.getCssValue("font");
		
		System.out.println(tagName+" | "+text+" | "+cssValue);
		
		//check element is enabled, is selected
		driver.get("https://testautomationpractice.blogspot.com/");
		
	}
}
