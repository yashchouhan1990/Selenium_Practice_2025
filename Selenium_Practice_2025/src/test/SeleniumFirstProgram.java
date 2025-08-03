package test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumFirstProgram {

	public static void main(String args[]) throws InterruptedException
	{
	//	System.setProperty("webdriver.chrome.driver", "/Users/yashchouhan/Downloaded_Jars/chromedriver");
	//	WebDriver driver= new ChromeDriver();
/*				
		//Chrome Options
		ChromeOptions chromeoption=new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
	//  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "/Users/yashchouhan/Downloaded_Jars/chromedriver");
		WebDriver driver = new ChromeDriver(chromeoption);
		
   //   driver.get("https://www.google.com");
		     
*/
		//Firefox
		System.setProperty("webdriver.gecko.driver", "/Users/yashchouhan/Downloaded_Jars/geckodriver");
		WebDriver driver= new FirefoxDriver();

		
		driver.get("https://www.google.co.in/");
		
		//driver.wait(2000);
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		
	

		
		
		
		
	}
}
