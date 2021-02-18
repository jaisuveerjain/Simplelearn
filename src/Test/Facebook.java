package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","/home/jaijaintecnotre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		//WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		//username.sendKeys("abc.xyz.com");
		
	
		
		//WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		//password.sendKeys("123456");
		
		//WebElement button = driver.findElement(By.xpath("//*[@name=\"login\"]"));
		
		//button.click();
		
		//CSS Select syntax : "css = tag#id"
		
		WebElement signup = driver.findElement(By.linkText("Create New Account"));
		signup.click();
		
		WebElement username = driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
		username.sendKeys("Jai");
		
		WebElement lastnaem = driver.findElement(By.xpath("//*[@name=\"lastname\"]"));
		lastnaem.sendKeys("Jain");
		
		WebElement email  = driver.findElement(By.xpath("//*[@name=\"reg_email__\"]"));
		email.sendKeys("xyz@aaa.com");
		

		WebElement new_pwd  = driver.findElement(By.xpath("//*[@name=\"reg_passwd__\"]"));
		new_pwd.sendKeys("newpassword");
		
		WebElement Month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
		
		Select ddmonth = new Select(Month);          
		ddmonth.selectByIndex(10);
		
		WebElement Day = driver.findElement(By.xpath("//*[@name='birthday_day']"));
				
				Select date = new Select(Day);          
				date.selectByIndex(10);
				
				WebElement Year = driver.findElement(By.xpath("//*[@name='birthday_year']"));
				
				Select yr = new Select(Year);          
				yr.selectByIndex(10);
				
				WebElement Gender = driver.findElement(By.xpath("//*[text()='Male']"));
				
				         
				Gender.click();
		
	
		
		WebElement submit  = driver.findElement(By.xpath("//*[@name=\"websubmit\"]"));
		submit.click();
		
		
		
		

	}

}
