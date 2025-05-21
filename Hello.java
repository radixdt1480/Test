import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hello {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Automation\\Latest\\geckodriver-v0.34.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// implicit Wait
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement txtusername = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		txtusername.sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		String dashboadURL = driver.getCurrentUrl();

		System.out.print("Current Page URL : " + dashboadURL + "\n");

		String result = dashboadURL.contains("dashboard") ? "Passed" : "Failed";
		System.out.print(result + "\n");
	}
}