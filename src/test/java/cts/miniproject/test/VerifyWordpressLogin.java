package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import cts.miniproject.pages.WordPressLoginPage;

public class VerifyWordpressLogin {
	@Test
	public void verifyValidLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailm\\eclipse-workspace\\Suchi-Sample\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();

		WordPressLoginPage login=new WordPressLoginPage(driver);

		//login.typeUserName();
		//login.typePassword();
		//login.clickOnLoginButton();
		login.typeUserNameAndPassword("admin", "demo123");
		login.clickOnLoginButton();
		
		String url=driver.getCurrentUrl();
		

		Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);


	}
}
