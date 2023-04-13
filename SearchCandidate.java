package orangeHRM1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import orangeHRM1.BaseClass;

public class SearchCandidate extends BaseClass{
	WebDriver driver;
  @Test(priority=2)
  public void searchCandidate() {
	 
	  BaseClass login1 = new BaseClass();
	  try {
		login1.searchCandidate(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
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
		  BaseClass login1 = new BaseClass();
		  login1.loginPage(driver);
  }
  @Test(priority=3)
  public void searchCandidate1() {
	  BaseClass login1 = new BaseClass();
	  try {
		login1.searchCandidate1(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test(priority=4)
  public void changeStatus() {
	  BaseClass login1 = new BaseClass();
	  try {
		login1.changeStatus(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  @Test(priority=5)
  public void changeStatus1() {
	  BaseClass login1 = new BaseClass();
	  try {
		login1.changeStatus1(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
  }
  @Test(priority=6)
  public void editCandidateDetails() {
	  BaseClass login1 = new BaseClass();
	  try {
		login1.editCandidateDetails(driver);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
  }
  @Test(priority=7)
  public void editCandidateDetails1() {
	  BaseClass login1 = new BaseClass();
	  try {
		login1.editCandidateDetails1(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
  }
  @Test(priority=8)
  public void editCandidateDetails2() {
	  BaseClass login1 = new BaseClass();
	  try {
		login1.editCandidateDetails2(driver);
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}     
  }
  @Test(priority=9)
  public void deleteCandidate() {
	  BaseClass login1 = new BaseClass();
	  try {
		login1.deleteCandidate(driver);
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
