package BBDStuff;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class wesite3 {
		WebDriver driver;
	@BeforeTest
		public void setup() {
	        System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
	     }
	@Test
		public void launch()  {
	driver.get("https://qatechhub.com/");
	}

	@Test
		public void windowset()  {
	     driver.manage().window().maximize();
	}
	@Test
	public void Title()  {
		System.out.println("Page title is : " + driver.getTitle());
	}
	@Test
	public void Navigation()  {
		driver.navigate().to("https://www.facebook.com/");
	}

	@AfterTest
		public void tearDown() {
			
			//driver.close();
			driver.quit();
		}
	}



