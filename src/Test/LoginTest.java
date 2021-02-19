package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//new message


public class LoginTest {
	WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		
		LoginTest obj = new LoginTest();
		obj.setup();
		obj.login();
		obj.quit();
	}
		
		public void setup() {
		System.setProperty("webdriver.chrome.driver","/home/jaijaintecnotre/Downloads/chromedriver");
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		}
		
		public void login() {
		
		WebElement linklogin = driver.findElement(By.linkText("Log in"));
		
		linklogin.click();
		
		WebElement editUsername = driver.findElement(By.name("user_login"));
		editUsername.sendKeys("abc.xyz.com");
		

		WebElement editPwd = driver.findElement(By.name("user_pwd"));
		editPwd.sendKeys("12345");
		
		WebElement chkBox = driver.findElement(By.className("rememberMe"));
		
		chkBox.click();
		
		WebElement btnPwd = driver.findElement(By.name("btn_login"));
		btnPwd.click();
		}
		
		public void quit() {
		
		driver.quit();
		}
	
	
	}


