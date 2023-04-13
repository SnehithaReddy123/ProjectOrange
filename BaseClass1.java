package orangeHRM1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass1 {
	String Url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	 public  void loginPage1(WebDriver driver) {
		this.driver = driver;
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	     driver.findElement(By.name("password")).sendKeys("admin123");
	     WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	     loginButton.click();
	 }
	public void addVacancyDetails(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
	FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(f);
		XSSFSheet s = workbook.getSheetAt(0);
	    Thread.sleep(3000);	
	    driver.findElement(By.xpath(s.getRow(24).getCell(0).getStringCellValue())).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath(s.getRow(25).getCell(0).getStringCellValue())).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(s.getRow(31).getCell(0).getStringCellValue())).sendKeys(s.getRow(27).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath(s.getRow(28).getCell(0).getStringCellValue())).sendKeys(s.getRow(28).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath(s.getRow(29).getCell(0).getStringCellValue())).sendKeys(s.getRow(30).getCell(0).getStringCellValue());
		driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue())).click();
	}
	public void addVacancyDetails1(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
		Thread.sleep(2000);
	FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(f);
		XSSFSheet s = workbook.getSheetAt(0);
	    Thread.sleep(3000);	
	    driver.findElement(By.xpath(s.getRow(24).getCell(0).getStringCellValue())).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath(s.getRow(25).getCell(0).getStringCellValue())).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(s.getRow(31).getCell(0).getStringCellValue())).sendKeys(s.getRow(32).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath(s.getRow(28).getCell(0).getStringCellValue())).sendKeys(s.getRow(28).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		driver.findElement(By.xpath(s.getRow(29).getCell(0).getStringCellValue())).sendKeys(s.getRow(30).getCell(0).getStringCellValue());
		driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue())).click();	
	}
	 public void addVacancyDetails2(WebDriver driver) throws InterruptedException, IOException {
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
			Thread.sleep(2000);
		FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(f);
			XSSFSheet s = workbook.getSheetAt(0);
		    Thread.sleep(3000);	
		    driver.findElement(By.xpath(s.getRow(24).getCell(0).getStringCellValue())).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath(s.getRow(25).getCell(0).getStringCellValue())).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(s.getRow(31).getCell(0).getStringCellValue())).sendKeys(s.getRow(33).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath(s.getRow(28).getCell(0).getStringCellValue())).sendKeys(s.getRow(28).getCell(0).getStringCellValue());
			Thread.sleep(1000);
			driver.findElement(By.xpath(s.getRow(29).getCell(0).getStringCellValue())).sendKeys(s.getRow(30).getCell(0).getStringCellValue());
			driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue())).click();		 
	 }
	 public void searchVacancyDetails1(WebDriver driver) throws InterruptedException, IOException {
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
			Thread.sleep(2000);
		FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(f);
			XSSFSheet s = workbook.getSheetAt(0);
		    Thread.sleep(3000);	
		    driver.findElement(By.xpath(s.getRow(24).getCell(0).getStringCellValue())).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(s.getRow(34).getCell(0).getStringCellValue())).sendKeys(s.getRow(34).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath(s.getRow(35).getCell(0).getStringCellValue())).sendKeys(s.getRow(36).getCell(0).getStringCellValue());
			Thread.sleep(2000);
			driver.findElement(By.xpath(s.getRow(12).getCell(0).getStringCellValue())).click();
			
}
	 public void checkBox(WebDriver driver) throws InterruptedException, IOException {
		 Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")).click();
			Thread.sleep(2000);
		FileInputStream f= new FileInputStream("C:\\Users\\seshu\\Desktop\\Book123.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(f);
			XSSFSheet s = workbook.getSheetAt(0);
		    Thread.sleep(3000);	
		    driver.findElement(By.xpath(s.getRow(24).getCell(0).getStringCellValue())).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(s.getRow(38).getCell(0).getStringCellValue())).click();
}
}