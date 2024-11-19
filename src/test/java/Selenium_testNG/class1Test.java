package Selenium_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1Test {
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	
	@BeforeTest
	void navigate() throws InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	@Test (priority=0)
	void username() {
		WebElement un=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		un.sendKeys("Admin");
		
	}
	@Test (priority=2)
	void password() {
		WebElement vn=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		vn.sendKeys("admin123");
		
	}
	@Test (priority=3,enabled=false)
	void login_button() {
		WebElement ln=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		ln.click();
		
	}
	@AfterTest
	void quit() {
		driver.quit();
	}

}
