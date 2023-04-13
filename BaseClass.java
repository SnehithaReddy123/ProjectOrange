package orangeHRM1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
 String Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
public WebDriver driver;
 public  void loginPage(WebDriver driver) {
	this.driver = driver;
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
     loginButton.click();
 }

public void recruitmentPage(WebDriver driver) {
	// TODO Auto-generated method stub
	this.driver=driver;
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
}
public void excelSheet(WebDriver driver) throws IOException {
	this.driver=driver;
	try {
		FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	
     XSSFWorkbook workbook = new XSSFWorkbook(f);
	
     XSSFSheet s = workbook.getSheetAt(0);
  // Add candidate
     WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstName']"));
     firstNameField.sendKeys(s.getRow(1).getCell(0).getStringCellValue());
    
     WebElement middleNameField = driver.findElement(By.xpath("//input[@name='middleName']"));
     middleNameField.sendKeys(s.getRow(1).getCell(1).getStringCellValue());
     WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastName']"));
     lastNameField.sendKeys(s.getRow(1).getCell(2).getStringCellValue());
     WebElement emailField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
     emailField.sendKeys(s.getRow(1).getCell(3).getStringCellValue());
     
     WebElement saveButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
     saveButton.click();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void addInvalidCandidate(WebDriver driver) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
    Thread.sleep(5000);
   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	 
	// Read test data from Excel sheet
    
    	FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	
    XSSFWorkbook workbook= new XSSFWorkbook(f);
	
    XSSFSheet s = workbook.getSheetAt(0);
    Thread.sleep(3000);
 // Add candidate
    WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstName']"));
    firstNameField.sendKeys(s.getRow(2).getCell(0).getStringCellValue());
   Thread.sleep(2000);
    WebElement middleNameField = driver.findElement(By.xpath("//input[@name='middleName']"));
    middleNameField.sendKeys(s.getRow(2).getCell(1).getStringCellValue());
    WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastName']"));
    lastNameField.sendKeys(s.getRow(2).getCell(2).getStringCellValue());
    WebElement emailField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
    emailField.sendKeys(s.getRow(2).getCell(3).getStringCellValue());
    
    WebElement saveButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
    saveButton.click();
    
}

public void addInvalid(WebDriver driver) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
    Thread.sleep(5000);
   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	// Read test data from Excel sheet
	     FileInputStream f = new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	     XSSFWorkbook workbook = new XSSFWorkbook(f);
	     XSSFSheet s = workbook.getSheetAt(0);
	     Thread.sleep(3000);
	  // Add candidate
	     WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstName']"));
	     firstNameField.sendKeys(s.getRow(3).getCell(0).getStringCellValue());
	     Thread.sleep(2000);
	     WebElement middleNameField = driver.findElement(By.xpath("//input[@name='middleName']"));
	     middleNameField.sendKeys(s.getRow(3).getCell(1).getStringCellValue());
	     WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastName']"));
	     lastNameField.sendKeys(s.getRow(3).getCell(2).getStringCellValue());
	     WebElement emailField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
	     emailField.sendKeys(s.getRow(3).getCell(3).getStringCellValue());
	     
	     WebElement saveButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
	     saveButton.click();
}

public void searchCandidate(WebDriver driver) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
	FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");

		
	    XSSFWorkbook workbook= new XSSFWorkbook(f);
		
	    XSSFSheet s = workbook.getSheetAt(0);
	    Thread.sleep(3000);

		driver.findElement(By.xpath(s.getRow(5).getCell(0).getStringCellValue())).sendKeys(s.getRow(4).getCell(0).getStringCellValue());
	driver.findElement(By.xpath(s.getRow(6).getCell(0).getStringCellValue())).click();
}
public void searchCandidate1(WebDriver driver) throws InterruptedException, IOException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
	FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");

		
	    XSSFWorkbook workbook= new XSSFWorkbook(f);
		
	    XSSFSheet s = workbook.getSheetAt(0);
	    Thread.sleep(3000);

		driver.findElement(By.xpath(s.getRow(5).getCell(0).getStringCellValue())).sendKeys(s.getRow(7).getCell(0).getStringCellValue());
	driver.findElement(By.xpath(s.getRow(6).getCell(0).getStringCellValue())).click();
}
public void changeStatus(WebDriver driver) throws InterruptedException, IOException {
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
	FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");

		
	    XSSFWorkbook workbook= new XSSFWorkbook(f);
		
	    XSSFSheet s = workbook.getSheetAt(0);
	    Thread.sleep(3000);

		driver.findElement(By.xpath(s.getRow(5).getCell(1).getStringCellValue())).sendKeys(s.getRow(6).getCell(1).getStringCellValue());
	driver.findElement(By.xpath(s.getRow(6).getCell(0).getStringCellValue())).click();
}
public void changeStatus1(WebDriver driver) throws InterruptedException, IOException {
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
	FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");

		
	    XSSFWorkbook workbook= new XSSFWorkbook(f);
		
	   XSSFSheet s = workbook.getSheetAt(0);
	    Thread.sleep(3000);

		driver.findElement(By.xpath(s.getRow(5).getCell(1).getStringCellValue())).sendKeys(s.getRow(7).getCell(1).getStringCellValue());
	driver.findElement(By.xpath(s.getRow(6).getCell(0).getStringCellValue())).click();
}
public void editCandidateDetails(WebDriver driver) throws InterruptedException, IOException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
XSSFWorkbook workbook= new XSSFWorkbook(f);
	 XSSFSheet s = workbook.getSheetAt(0);
    Thread.sleep(3000);
	driver.findElement(By.xpath(s.getRow(13).getCell(0).getStringCellValue())).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(s.getRow(8).getCell(0).getStringCellValue())).click();

	driver.findElement(By.xpath(s.getRow(10).getCell(0).getStringCellValue())).sendKeys(s.getRow(11).getCell(0).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue())).click();
}
public void editCandidateDetails1(WebDriver driver) throws InterruptedException, IOException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
XSSFWorkbook workbook= new XSSFWorkbook(f);
	XSSFSheet s = workbook.getSheetAt(0);
    Thread.sleep(3000);
	driver.findElement(By.xpath(s.getRow(13).getCell(0).getStringCellValue())).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(s.getRow(8).getCell(0).getStringCellValue())).click();

	driver.findElement(By.xpath(s.getRow(10).getCell(0).getStringCellValue())).sendKeys(s.getRow(14).getCell(0).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.xpath(s.getRow(15).getCell(0).getStringCellValue())).sendKeys(s.getRow(3).getCell(0).getStringCellValue());
	driver.findElement(By.xpath(s.getRow(16).getCell(0).getStringCellValue())).sendKeys(s.getRow(3).getCell(1).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue())).click();
}
public void editCandidateDetails2(WebDriver driver) throws InterruptedException, IOException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
 XSSFWorkbook workbook= new XSSFWorkbook(f);
	 XSSFSheet s = workbook.getSheetAt(0);
    Thread.sleep(3000);
    driver.findElement(By.xpath(s.getRow(13).getCell(0).getStringCellValue())).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(s.getRow(8).getCell(0).getStringCellValue())).click();

	driver.findElement(By.xpath(s.getRow(10).getCell(0).getStringCellValue())).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath(s.getRow(10).getCell(0).getStringCellValue())).sendKeys(s.getRow(14).getCell(0).getStringCellValue());
	driver.findElement(By.xpath(s.getRow(15).getCell(0).getStringCellValue())).clear();
	driver.findElement(By.xpath(s.getRow(15).getCell(0).getStringCellValue())).sendKeys(s.getRow(14).getCell(0).getStringCellValue());
	driver.findElement(By.xpath(s.getRow(16).getCell(0).getStringCellValue())).clear();
	driver.findElement(By.xpath(s.getRow(16).getCell(0).getStringCellValue())).sendKeys(s.getRow(14).getCell(0).getStringCellValue());
	Thread.sleep(2000);
	driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue())).click();
}
public void deleteCandidate(WebDriver driver) throws InterruptedException, IOException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
	Thread.sleep(2000);
FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
XSSFWorkbook workbook= new XSSFWorkbook(f);
	XSSFSheet s = workbook.getSheetAt(0);
    Thread.sleep(3000);
    driver.findElement(By.xpath(s.getRow(18).getCell(0).getStringCellValue())).click();
	Thread.sleep(2000);	
	driver.findElement(By.xpath(s.getRow(21).getCell(0).getStringCellValue())).click();
	driver.findElement(By.xpath(s.getRow(22).getCell(0).getStringCellValue())).click();
}

}