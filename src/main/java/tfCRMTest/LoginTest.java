package tfCRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
	
		
		LaunchBrowser();
		loginTest();
		teardown();
		
	}
	
	public static void LaunchBrowser() {
		
		// setting the properties to chrome driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saiva\\eclipse-workspace\\NewMaven\\Drivers\\chromedriver.exe");
		// Creating web driver object
		
		 driver = new ChromeDriver();
		 
		 //Maximizing window
		 driver.manage().window().maximize();
		 
	}
	public static void loginTest() {
		 
		 // go to the link
		 
		 driver.get("http://techfios.com/test/billing/?ng=admin/");
		  
		 //identifying the username box and passing username
		 
		 driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		 
		 //identifying the password box and passing password
		 driver.findElement(By.id("password")).sendKeys("abc123");
		 
		 //identifying the login button and click it
		  driver.findElement(By.name("login")).click();
	}
	
	public static void teardown() {;
		  
		  
		  // closing the browser
		  driver.close();
	
		  
		}


	


	
		
	}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	


