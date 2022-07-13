package test;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxyDemo {

	public static void main(String[] args) {
	
	Proxy proxy = new Proxy();
	proxy.setAutodetect(false);
	proxy.setHttpProxy("localhost:");
	proxy.setSslProxy("localhost:");
	
	ChromeOptions options = new ChromeOptions();
	options.setCapability("proxy", proxy);
	Object WebDriverManager;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Christina.Cruz\\eclipse-workspace\\Selenium4Project\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.google.com/");
	driver.quit();
	}
}
