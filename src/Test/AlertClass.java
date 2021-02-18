package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/jaijaintecnotre/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.name("custid")).sendKeys("123434");
		driver.findElement(By.name("submit")).submit();
		
		Alert obj = driver.switchTo().alert();
		System.out.println(obj.getText());
		obj.accept();
		

	}

}
