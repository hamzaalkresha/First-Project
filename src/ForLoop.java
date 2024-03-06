package ForLoop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForLoop {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void MyBeforeTest() {

		driver.manage().window().maximize();

	}

	@Test
	public void MyTest() throws InterruptedException {

		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));
		
		WebElement password = driver.findElement(By.id("password"));
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginbutton.click();
		Thread.sleep(1000);
		List<WebElement> AddToCartbutton = driver.findElements(By.className("btn"));
		
		for(int i=0 ; i<AddToCartbutton.size();i++) {
			
			AddToCartbutton.get(i).click();
			
			
			
			
		}

		
	}

}
