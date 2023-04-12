package ParallelExecution;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRunTimePolymorphism {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
	}
	public static WebDriver driver;
	public static void main(String[] arg) {
		System.out.println("Enter the browser name");
		Scanner sc=new Scanner(System.in);
		String browser = sc.nextLine();
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get("https://demo.actitime.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	
}
