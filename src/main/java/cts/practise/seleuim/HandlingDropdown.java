package cts.practise.seleuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\demo-seleuim\\src\\test\\resources\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Select drop=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		Thread.sleep(1000);
		WebElement selectItem1=drop.getFirstSelectedOption();
		System.out.println("BeforeSelected Item is" +selectItem1.getText());

		
		//selecting the value of dropdowm select by index method
		drop.selectByIndex(1);
		//selecting the value of dropdowm select by value method
		drop.selectByValue("29");
		
		Thread.sleep(1000);
		//driver.close();
		//selecting the value of dropdowm select by visibletext method
		drop.selectByVisibleText("Canada");
		
		WebElement selectItem=drop.getFirstSelectedOption();
		System.out.println("Selected Item is" +selectItem.getText());
		
		List<WebElement>listofDropdowm=drop.getOptions();
		int list=listofDropdowm.size();
		System.out.println(list);
		
		for(WebElement ele:listofDropdowm) {
			String items=ele.getText();
			System.out.println("Item names" +items);
		}

	}

}
