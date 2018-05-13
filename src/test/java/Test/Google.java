package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void testGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Kia"+Keys.ENTER);
		String expected="Kia";
		String actual=driver.getTitle();
		Assert.assertTrue(actual.contains(expected));
	}
}
