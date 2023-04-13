package orangeHRM1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import orangeHRM1.BaseClass;
public class Candidate extends BaseClass {
	 WebDriver driver;
	    //String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
  @Test(priority=1)
  public void loginPage() {
	
	// Login to the application
	  driver.get(Url);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  BaseClass login = new BaseClass();
	  login.loginPage(driver);
  }
	  @Test(priority=2)
	  public void recruitmentPage() {
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  BaseClass login = new BaseClass();
      login.recruitmentPage(driver);
	  }
	  @Test(priority=3)
	  public void excelSheet()  {
     // Read test data from Excel sheet
		  BaseClass login = new BaseClass();
	      try {
			login.excelSheet(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
  @Test(priority=4)
  public void addInvalidCandidate(){
	  BaseClass login =new BaseClass();
     try {
		login.addInvalidCandidate(driver);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 

  }
  @Test(priority=5)
  public void addInvalid() {
	  BaseClass login =new BaseClass();
	     try {
			
				login.addInvalid(driver);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\seshu\\OneDrive\\Documents\\jar files\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*"); 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(options);
	   }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
