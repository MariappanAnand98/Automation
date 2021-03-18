import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Launch {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Project2\\Driver2\\geckodriver.exe");
		
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://www.ajio.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://meesho.com/");
		
		driver.navigate().back();
		
		driver.close();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
