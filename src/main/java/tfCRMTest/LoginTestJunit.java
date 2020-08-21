package tfCRMTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {
	
	WebDriver driver; 
	@Test
	
	public  void launchBrowser() {
		
		
		// setting the properties for chrome driver
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiva\\eclipse-workspace\\MavenProject\\Drivers\\chromedriver.exe");
		
			//Creating web driver object
			WebDriver Driver = new ChromeDriver();
			
			//maximizing window
			Driver.manage().window().maximize();
			
			
			// go to the link	
			driver.get ("http://techfios.com/test/billing/?ng=admin/");
			
			//identifying the username box and passing username
			driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
			
			//identifying the password box and passing passsword
			driver.findElement(By.id("password")).sendKeys("abc123");
			
			//identifying the login button and click it
			driver.findElement(By.name("login")).click();
			
			driver.close();
			
		}

}
