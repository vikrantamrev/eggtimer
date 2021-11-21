package testrunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitTest {

	public static WebDriver driver;
	public InitTest() {
		if(driver==null)
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Dependency\\geckodriver.exe");
			driver=new FirefoxDriver();						
	}

	public void openUrl() {
		driver.manage().window().maximize();
		driver.get("https://e.ggtimer.com");
		System.out.println("Web application is launched.");
	}

	public void tearDown() {		
		driver.close();
		System.out.println("All instance of webdriver closed.");
	}

	public void eggAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("Clicked on OK Alert.");
	}
}
