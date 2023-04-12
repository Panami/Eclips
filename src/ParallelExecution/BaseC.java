package ParallelExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;



public class BaseC {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) {
	Reporter.log("Open Browser",true);	
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
		driver.close();
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Login",true);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
	
}
