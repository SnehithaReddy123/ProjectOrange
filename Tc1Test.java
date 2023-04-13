package orangeHRM1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import orangeHRM1.BaseClass2;
public class Tc1Test extends BaseClass2 {
 
		public WebDriver driver;
		 String baseUrl;
@BeforeClass
			public void setUp()  {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\seshu\\OneDrive\\Documents\\jar files\\chromedriver_win32\\chromedriver.exe");
				 
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*"); 
				 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver(options);
			 baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php";
					
}
@Test(priority = 1)
public void testLoginPageTitle() {
	BaseClass2 login3 = new BaseClass2();
	 
		login3.testLoginPageTitle(driver);
}
@Test(priority = 3)
public void testValidLogin() {
	BaseClass2 login3 = new BaseClass2();
	 try {
	login3.testValidLogin(driver);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
}
@Test(priority=4)
public void verifyDashboardPage() {
	BaseClass2 login3 = new BaseClass2();
	login3.verifyDashboardPage(driver);
    }
@Test(priority = 2)
public void testInvalidLogin() {
    
	BaseClass2 login3 = new BaseClass2();
	 try {
	login3.testInvalidLogin(driver);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@AfterClass
public void Clo() {
	
			driver.quit();
		}
	

  



 }

  
