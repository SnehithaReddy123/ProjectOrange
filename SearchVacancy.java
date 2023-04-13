package orangeHRM1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import orangeHRM1.BaseClass1;
public class SearchVacancy extends BaseClass1{
	WebDriver driver;
  @Test(priority=1)
  public void loginPage1() {
	// Login to the application
	  driver.get(Url);
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  BaseClass1 login2 = new BaseClass1();
	  login2.loginPage1(driver);
  }
  @Test(priority=2)
  public void addVacancyDetails() {
	  BaseClass1 login2 = new BaseClass1();
	  try {
		login2.addVacancyDetails(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test(priority=3)
  public void addVacancyDetails1() {
	  BaseClass1 login2 = new BaseClass1();
	  try {
		login2.addVacancyDetails1(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test(priority=4)
  public void addVacancyDetails2() {
	  BaseClass1 login2 = new BaseClass1();
	  try {
		login2.addVacancyDetails2(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test(priority=5)
  public void searchVacancyDetails1() {
	  BaseClass1 login2 = new BaseClass1();
	  try {
		login2.searchVacancyDetails1(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  }
  @Test(priority=6)
  public void checkBox() {
	  BaseClass1 login2 = new BaseClass1();
	  try {
		login2.checkBox(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
  }
  @BeforeClass
  public void beforeClass() {
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
