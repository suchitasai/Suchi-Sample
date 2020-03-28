package cts.practise.seleuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {
	
	public void loginToApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailm\\eclipse-workspace\\Suchi-Sample\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("texUser")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("bLogin")).click();
		driver.quit();

	}

}
