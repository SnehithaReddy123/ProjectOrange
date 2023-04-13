package orangeHRM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BaseClass2 {
	public WebDriver driver;
	String baseUrl;
	public void testLoginPageTitle(WebDriver driver) {
	// Navigate to the OrangeHRM login page
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    // Verify the page title
    String expectedTitle = "OrangeHRM";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
}
	public void testInvalidLogin(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		   // Navigate to the OrangeHRM login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		    // Enter invalid login credentials
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("InvalidUsername");;
		    
		    WebElement password = driver.findElement(By.name("password"));
		    password.sendKeys("InvalidPassword");

		    // Click the login button
		    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		    loginButton.click();
	}
	public void testValidLogin(WebDriver driver) throws InterruptedException {
	    // Navigate to the OrangeHRM login page
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	    // Enter valid login credentials
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    
	    WebElement password = driver.findElement(By.name("password"));
	    password.sendKeys("admin123");

	    // Click the login button
	    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    loginButton.click();
	}
	public void verifyDashboardPage(WebDriver driver) {
	    // Verify the dashboard page is displayed
	    String expectedDashboardUrl =  "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    String actualDashboardUrl = driver.getCurrentUrl();
	    Assert.assertEquals(actualDashboardUrl, expectedDashboardUrl);
	}
}