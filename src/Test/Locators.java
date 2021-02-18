package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/jaijaintecnotre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement lnkLogin = driver.findElement(By.xpath("//a[@class='login']"));
		
		lnkLogin.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='user_login']"));
		
		username.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@name='user_pwd']"));
		
		password.click();
		
		WebElement rembrme = driver.findElement(By.xpath("//"));
		
		rembrme.click();
		
	}

}
