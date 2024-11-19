package Selenium_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class class2Test {
	String driverPath = "C:\\Users\\shiva\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void navigate() throws InterruptedException {
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();

}
	@Test(priority=0)
	void firstname() {
		WebElement fn=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Shivani");
		
	}
	@Test(priority=1)
	void lastname() {
		WebElement ln=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("Agrawal");
		
	}
	@Test(priority=2)
	void Address() {
		WebElement add=driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		add.sendKeys("Vijay Nagar, Indore");
		}
	@Test (priority=3)
	void email() {
		WebElement em=driver.findElement(By.xpath("//input[@type='email']"));
		em.sendKeys("shivaniagrawal605@gmail.com");
	}
	@Test(priority=4,enabled=false)
	void phone() {
		WebElement ph=driver.findElement(By.xpath("//input[@type='tel']"));
		ph.sendKeys("9685888691");
	}
	@Test(priority=5)
	void gender() {
		WebElement ge=driver.findElement(By.xpath("//label[normalize-space()='FeMale']"));
		if(ge.isDisplayed()&&ge.isEnabled()) {
			ge.click();
			} 
	}
	@Test(priority=6)
	void hobbies() {
		WebElement hob=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		if(hob.isDisplayed()&&hob.isEnabled()) {
			hob.click();
		}
	}
	@Test(priority=7)
	void lang() throws InterruptedException {
		WebElement lan=driver.findElement(By.xpath("//div[@id='msdd']"));
		lan.click();
		WebElement eng=driver.findElement(By.xpath("//a[normalize-space()='English']"));
		eng.click();
		WebElement hin=driver.findElement(By.xpath("//a[normalize-space()='Hindi']"));
		hin.click();
		Thread.sleep(1000);
		WebElement lang=driver.findElement(By.xpath("//label[normalize-space()='Languages']"));
		lang.click();
	}
	@Test(priority=8)
	void skills() throws InterruptedException {
		WebElement ski=driver.findElement(By.xpath("//select[@id='Skills']"));
		ski.click();
		WebElement skill=driver.findElement(By.xpath("//option[@value=\"Art Design\"]"));
		skill.click();
		Thread.sleep(1000);
		WebElement skills=driver.findElement(By.xpath("//label[normalize-space()='Skills']"));
		skills.click();
	}
	@Test(priority=9)
	
	void country() throws InterruptedException {
	WebElement coun=driver.findElement(By.xpath("//span[@role='combobox']"));
	coun.click();
	Thread.sleep(1000);
	WebElement countr=driver.findElement(By.xpath("//input[@role='textbox']"));
	countr.sendKeys("India");
	Thread.sleep(1000);	
	WebElement country=driver.findElement(By.xpath("//select[@id='countries']"));
	Actions a = new Actions(driver);
	a.doubleClick(country).perform();
	}
	@Test(priority=10)
	void year() throws InterruptedException {
	Thread.sleep(2000);
	WebElement yea=driver.findElement(By.xpath("//select[@id='yearbox']"));
	yea.click();
	WebElement year=driver.findElement(By.xpath("//option[@value=\"1998\"]"));
	year.click();
	WebElement DOB=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
	DOB.click();
	}
	@Test(priority=11)
	void month() {
		WebElement mont=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		mont.click();
		WebElement month=driver.findElement(By.xpath("//option[@value=\"December\"]"));
		month.click();
		WebElement dob=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		dob.click();
	}
	@Test(priority=12)
	void day() {
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		day.click();
		WebElement dayy=driver.findElement(By.xpath("//option[@value=\"11\"]"));
		dayy.click();
		WebElement doB=driver.findElement(By.xpath("//label[normalize-space()='Date Of Birth']"));
		doB.click();
	}
	@Test(priority=13)
	void password() {
		WebElement pass=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("Shivi@11");
	}
	@Test(priority=14)
	void cnfrmpass() {
		WebElement cnfpass=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		cnfpass.sendKeys("Shivi@11");
		}
	
	@Test(priority=15)
	void choose_file() {
		WebElement cf=driver.findElement(By.xpath("//input[@id='imagesrc']"));
		cf.sendKeys("C:\\Users\\shiva\\Downloads\\WhatsApp Image 2024-11-12 at 8.52.22 PM.jpeg");
		}
	
	
//	@AfterTest
//	void quit() {
//		driver.quit();
//	}
	
	
}
