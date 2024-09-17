package Maven_SCSR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mvn_2_PageScroll {

    WebDriver driver;

	@BeforeTest
	public void LaunchBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);


	}

  @Test
  public void scrollBar1() throws InterruptedException {

	  JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;

	 WebElement element = driver.findElement(By.linkText("Chrome"));

	 javascriptExecutor.executeScript("arguments[0].scrollIntoView()",element);
	 Thread.sleep(2000);

	 javascriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 Thread.sleep(2000);

	 javascriptExecutor.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	 Thread.sleep(2000);

  }

  @AfterTest
  public void closeWindow() {
	  driver.quit();
  }

}
