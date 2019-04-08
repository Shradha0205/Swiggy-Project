package Swiggy_Project.Swiggy_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Swiggy_PageObjectModule {

	static WebDriver driver = null;

	By location = By.id("location");
	By search_location = By.xpath("//div[@class='_1oLDb']//div[1]");
	By search_restaurant_button = By.xpath("//span[contains(text(),'Search')]");
	By edit_restanrant = By.xpath("//input[@placeholder='Search for restaurants or dishes']");
	By enter_restanrant = By.xpath("//input[@placeholder='Search for restaurants or dishes']");
	By restaurant_name = By.xpath("//div[contains(text(),'Green G Juice Bar')]");
	
	
	By item1 = By.xpath("//body/div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='uSag_']/div[@id='menu-content']/div[@class='_1okhE']/div[@class='_1J_la']/div[@id='h1500331816']/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By item2 = By.xpath(" /html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[@class='_1ds9T _2Thnf']");
	By item3 = By.xpath("//body/div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='uSag_']/div[@id='menu-content']/div[@class='_1okhE']/div[@class='_1J_la']/div[@id='h-1574778395']/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By item4 = By.xpath("//body/div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='uSag_']/div[@id='menu-content']/div[@class='_1okhE']/div[@class='_1J_la']/div[@id='h-1574778395']/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By item5 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
	By item6 = By.xpath("//body/div[@id='root']/div[@class='_3arMG']/div[@class='nDVxx']/div[@class='uSag_']/div[@id='menu-content']/div[@class='_1okhE']/div[@class='_1J_la']/div[@id='h-1574778395']/div/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By checkout = By.xpath("//div[@class='_1gPB7']");
	By signup = By.xpath("//div[contains(text(),'SIGN UP')]");
	By mobile = By.id("mobile");
	By name = By.id("name");
	By email = By.id("email");
	By password = By.id("password");
	By referal_code = By.xpath("//div[@class='_3GOZo']");
	By button_continue = By.linkText("CONTINUE");
	By verify_email = By.xpath("//label[contains(@class,'_1Cvlf _2tL9P A7Y41')]");
	
	



	public Swiggy_PageObjectModule(WebDriver driver){
		this.driver = driver;
	}

	public boolean search_location() {
		ClickElement(search_location);
		return true;
	}

	public boolean search_restaurant() {
		ClickElement(search_restaurant_button);
		return true;
	}

	public boolean location(String text) {		
		EditText(location, text);
		return true;
	}
	
	public boolean restaurant_name() {
		ClickElement(restaurant_name);
		return true;
	}
	
	public boolean item1() {
		ClickElement(item1);
		return true;
	}
	
	public boolean item2() {
		ClickElement(item2);
		return true;
	}
	
	public boolean item3() {
		ClickElement(item3);
		return true;
	}
	
	public boolean item4() {
		ClickElement(item4);
		return true;
	}
	
	public boolean item5() {
		ClickElement(item5);
		return true;
	}
	
	public boolean item6() {
		ClickElement(item6);
		return true;
	}

	public boolean checkout() {
		ClickElement(checkout);
		return true;
	}
	
	public boolean signup() {
		ClickElement(signup);
		return true;
	}
	
	public boolean mobile() {
		EditText(mobile, "0000000000");
		return true;
	}
	
	
	public boolean name() {
		EditText(name, "abc abc");
		return true;
	}
	
	public boolean email() {
		EditText(email, "abc@def.com");
		return true;
	}
	
	public boolean password() {
		EditText(password, "abcdef");
		return true;
	}
	
	public boolean referal_code() {
		ClickElement(referal_code);
		return true;
	}
	
	public boolean button_continue() {
		driver.findElement(button_continue).click();
		return true;
	}
	
	public String verify_email() {
		return driver.findElement(By.xpath("//label[contains(@class,'_1Cvlf _2tL9P A7Y41')]")).getText();

	}
	
	public boolean edit_restanrant(String text) {		
		EditText(edit_restanrant, text);
		return true;
	}
	
	public boolean enter_restanrant() {		
		driver.findElement(enter_restanrant).sendKeys(Keys.RETURN);
		return true;
	}
	
	













	
	//--------------------------

	public void ImplicitWait(By value) {

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(value));
	}

	public boolean ClickElement(By value) {

		ImplicitWait(value);
		driver.findElement(value).click();
		return true;
	}

	public boolean EditText(By value, String text) {

		ImplicitWait(value);
		driver.findElement(value).sendKeys(text);
		return true;
	}

}
