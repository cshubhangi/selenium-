package BBDStuff;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class website2 {
	public class Website {
		WebDriver driver;
	@BeforeTest
		public void setup() {
	        System.setProperty("webdriver.chrome.driver", "G:\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
	     }
	@Test
		public void launch()  {
	//driver.get("https://in.search.yahoo.com/");
	}

	@Test
		public void Title()  {
		driver.get("https://in.search.yahoo.com/");
		System.out.println(driver.findElement(By.cssSelector(".title.d-i.fz-s.fw-xl.s-label")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"Trending searches");
		WebElement td=driver.findElement (By.xpath("//div[@class='compList lh-l fz-s pl-10 pr-10']"));
		System.out.println(td.findElements(By.tagName("a")).size());

	}


	@AfterTest
	public void tearDown() {
		
		//driver.close();
		driver.quit();

	
	}
	
	}	
	
}