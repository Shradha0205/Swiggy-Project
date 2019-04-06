package Swiggy_Project.Swiggy_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy {
	
	public WebDriver driver = null;
	
	@BeforeTest
	public void OpenBrowser(){
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
		
		//driver = new ChromeDriver();
		
		String ProjectPath = System.getProperty("user.dir");
		
//		System.setProperty("webdriver.gecko.driver", ProjectPath+"/Driver/Gecodriver/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Driver/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void main() throws InterruptedException {
		
		
	driver.get("https://www.swiggy.com");
	driver.manage().window().maximize();
	
	 WebDriverWait wait = new WebDriverWait(driver,30);

	WebElement Location = driver.findElement(By.id("location"));
	Location.sendKeys("Indiranagar , Bengaluru");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='_1oLDb']//div[1]")).click();
	
	Thread.sleep(4000);
	
	//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/a[1]/span[2]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys("Bite Me");
	driver.findElement(By.xpath("//input[@placeholder='Search for restaurants or dishes']")).sendKeys(Keys.RETURN);
	
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Fresh Bites')]")));
	driver.findElement(By.xpath("//div[contains(text(),'Fresh Bites')]")).click();
	
	Thread.sleep(4000);
	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_33Hf_ _3L1X9']//div[@class='_1RPOp _1uN_a'][contains(text(),'ADD')]")));
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]")).click();
	
	//div[@class='_1J_la']//div[2]//div[2]//div[1]//div[3]//div[2]//div[2]
	driver.findElement(By.xpath("//div[@class='_1J_la']//div[2]//div[2]//div[1]//div[3]//div[2]//div[1]")).click();
	driver.findElement(By.xpath("//div[@class='_1J_la']//div[2]//div[1]//div[1]//div[3]//div[2]//div[2]")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1J_la']//div[2]//div[2]//div[1]//div[3]//div[2]//div[2]")));
	driver.findElement(By.xpath("//div[@class='_1J_la']//div[2]//div[2]//div[1]//div[3]//div[2]//div[2]")).click();
	driver.findElement(By.xpath("//div[@class='_1J_la']//div[2]//div[2]//div[1]//div[3]//div[2]//div[2]")).click();
	driver.findElement(By.xpath("//div[@id='menu-content']//div[3]//div[1]//div[1]//div[3]//div[2]//div[1]")).click();
	driver.findElement(By.xpath("//div[@id='menu-content']//div[3]//div[2]//div[1]//div[3]//div[2]//div[1]")).click();
	
	//---------------------------
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1gPB7']")));
	driver.findElement(By.xpath("//div[@class='_1gPB7']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='OsNTr y9pNN']")));
	driver.findElement(By.xpath("//div[@class='OsNTr y9pNN']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.id("mobile")).sendKeys("000000000");
	driver.findElement(By.id("name")).sendKeys("abc abc");
	driver.findElement(By.id("email")).sendKeys("abc@def.com");
	driver.findElement(By.id("password")).sendKeys("abcd");
	driver.findElement(By.xpath("//div[@class='_3GOZo']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("CONTINUE")).click();
	Thread.sleep(2000);
	
	

	}
	
	
	@AfterTest
	public void TearDown()
	{
		
//		driver.close();
	}

}
