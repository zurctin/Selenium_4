package test;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\Selenium4Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, null);
		driver.manage().timeouts().setScriptTimeout(2, null);
		driver.manage().timeouts().pageLoadTimeout(10, null);

		driver.get("https://www.google.com/");
		driver.navigate().to("https://automationstepbystep.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.navigate().forward();
		//Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().window(originalWindow);
	
		driver.navigate().to("https://www.selenium.dev/documentation/");
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Alert")).click();
		driver.switchTo().defaultContent();
		
		driver.manage().window().getSize().getWidth();
		driver.manage().window().getSize().getHeight();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());
		
		driver.manage().window().setSize(new Dimension(800,600));

		driver.manage().window().getPosition().getX();
		driver.manage().window().getPosition().getY();
		
		//Point position = driver.manage().window().getPosition();
		//System.out.println(position.getX());
		//System.out.println(position.getY());
		
		//driver.manage().window().setPosition(new Point(500,100));
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		
		//Thread.sleep(2000);		
		driver.close();
		driver.quit();
	}
}
