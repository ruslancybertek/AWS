package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Google {
WebDriver driver;
	@Test
	public void testGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Kia"+Keys.ENTER);
		String expected="Kia";
		String actual=driver.getTitle();
		System.out.println("actual is: "+actual);
		Assert.assertTrue(actual.contains(expected));
	}
	@AfterMethod
	public void after() {
		driver.close();
	}
}
