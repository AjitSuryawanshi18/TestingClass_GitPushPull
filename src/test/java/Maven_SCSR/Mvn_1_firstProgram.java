package Maven_SCSR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mvn_1_firstProgram {

	WebDriver driver;

	@BeforeTest
	public void LaunchBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);


	}

	@Test
	public void f() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//select[@name='fromPort']"));

		Select select = new Select(element);
		Thread.sleep(2000);
		List<WebElement> all_Options = select.getOptions();
		System.out.println(all_Options.size());

		for (WebElement option : all_Options) {
			System.out.println("Options List : "+option.getText() );
		}
	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}
