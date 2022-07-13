package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\Selenium4Project\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, null);
	
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	//js alerts
	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
	Alert alert1 = driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	if(driver.getPageSource().contains("You successfully clicked an alert"))
		System.out.println("You successfully clicked an alert");
		System.out.println("*********************");
		
	//js confirm
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Alert alert2 = driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.dismiss();
	if(driver.getPageSource().contains("You clicked: Cancel"))
		System.out.println("You clicked: Cancel");
		System.out.println("*********************************");
	
	//js prompt
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Alert alert3 = driver.switchTo().alert();
	System.out.println(alert3.getText());
	alert3.sendKeys("Automation Step by Step");
	Thread.sleep(2000);
	alert3.accept();
	if(driver.getPageSource().contains("You entered: Automation Step by Step"))
		System.out.println("You entered: Automation Step by Step");
		System.out.println("*********************************");	

	driver.close();
	driver.quit();
	}
}
