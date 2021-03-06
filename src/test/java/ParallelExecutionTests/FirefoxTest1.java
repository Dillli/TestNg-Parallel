package ParallelExecutionTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest1 {
	public static WebDriver driver;

	@Test
	public void firefoxTest1() throws MalformedURLException {
		WebDriverManager.iedriver().setup();
		System.setProperty("C:\\Selenium\\geckodriver.exe", "true");

		driver = new InternetExplorerDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://github.com/");

		String title = driver.getTitle();
		System.out.println("The FirefoxTest_1 Github Title is ::: " + title);

		driver.quit();
	}
}
