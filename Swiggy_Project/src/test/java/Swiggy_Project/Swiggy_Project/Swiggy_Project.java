package Swiggy_Project.Swiggy_Project;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy_Project {

	public WebDriver driver = null;
	public String ProjectPath = System.getProperty("user.dir");
	
	@BeforeTest
	public void OpenBrowser(){
		
		// Firefox driver
		System.setProperty("webdriver.gecko.driver", ProjectPath+"/Driver/Gecodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		// Chrome Driver
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Driver/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void main () throws InterruptedException, IOException {

		driver = new ChromeDriver();
		SwiggyTestCase(driver);
		
		driver = new FirefoxDriver();
		SwiggyTestCase(driver);
		
	}

	public void SwiggyTestCase(WebDriver driver) throws InterruptedException, IOException {
		
		Swiggy_PageObjectModule test = new Swiggy_PageObjectModule(driver);
		
		//Launching Swiggy.com

		driver.get("https://www.swiggy.com");
		driver.manage().window().maximize();

		// Searching for Indiranagar , Bengaluru

		Assert.assertTrue(test.location("Indiranagar , Bengaluru"), "Location textbox not found");

		Assert.assertTrue(test.search_location(), "Unable to search location");

		Assert.assertTrue(test.search_restaurant(), "Unable to search button for restaurant");
		
		// Searching for Restaurant
		
		Assert.assertTrue(test.edit_restanrant("Green G Juice Bar"), "Unable to find edit box for entering Green G Juice Bar");
		Thread.sleep(2000);
		Assert.assertTrue(test.enter_restanrant(), "Unable to for enter Green G Juice Bar");

		Assert.assertTrue(test.restaurant_name(), "Restaurant could not find");
		
		// Adding items to cart

		Assert.assertTrue(test.item1(), "Unable to add item 1 to cart");
		Thread.sleep(2000);
		Assert.assertTrue(test.item2(), "Unable to add item 2 to cart");
		Thread.sleep(2000);
		Assert.assertTrue(test.item3(), "Unable to add item 3 to cart");
		Thread.sleep(2000);
		Assert.assertTrue(test.item4(), "Unable to add item 4 to cart");
		Thread.sleep(2000);
		Assert.assertTrue(test.item5(), "Unable to add item 5 to cart");
		Thread.sleep(2000);
		Assert.assertTrue(test.item6(), "Unable to add item 6 to cart");
		Thread.sleep(2000);


		// Checking Out
		
		Assert.assertTrue(test.checkout(), "Unable to find checkout button");
		
		// Step 7
		
		// Signing up as new user

		Assert.assertTrue(test.signup(), "Unable to find signup button");
		Thread.sleep(2000);
		Assert.assertTrue(test.mobile(), "Unable to find text box for mobile");
		Assert.assertTrue(test.name(), "Unable to find text box for name");
		Assert.assertTrue(test.email(), "Unable to find text box for email");
		Assert.assertTrue(test.password(), "Unable to find text box for password");
		Assert.assertTrue(test.referal_code(), "Unable to click on referal_code");
		Thread.sleep(2000);
		Assert.assertTrue(test.button_continue(), "Unable to fine continur button");
		Thread.sleep(2000);
		String verifyText = test.verify_email();
		boolean flag = verifyText.equalsIgnoreCase("Invalid email address");
		Verify.verify(flag,"Error message - Invalid email address is not present on the page");
		Thread.sleep(2000);
		
		// Taking Screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(ProjectPath+"\\test-output\\ScreenShots\\Swiggy.jpg"));
		
	}


	@AfterTest
	public void TearDown(){

		driver.close();
	}


}
