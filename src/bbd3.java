import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class bbd3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhananjay Gavali\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

String url= "https://in.search.yahoo.com/";
driver.navigate().to(url);
		
System.out.println(driver.findElement(By.cssSelector(".title.d-i.fz-s.fw-xl.s-label")).getText());
Assert.assertEquals(driver.findElement(By.tagName("h4")).getText(),"Trending searches");
WebElement td=driver.findElement (By.xpath("//div[@class='compList lh-l fz-s pl-10 pr-10']"));
System.out.println(td.findElements(By.tagName("a")).size());

      for(int i=0;i<td.findElements(By.tagName("a")).size(); i++)
    {
	String linkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	td.findElements(By.tagName("a")).get(i).sendKeys(linkTab);
			
Thread.sleep(500);
     }
	
Set<String>w=driver.getWindowHandles();
Iterator<String> it= w.iterator();
		
		while(it.hasNext())
		{
		
			driver.switchTo().window(it.next());
		    System.out.println(driver.getTitle());

	   }
driver.navigate().to (url);
driver.findElement(By.xpath("(//a[normalize-space()='COVID-19 in India'])[1]")).click();
driver.quit();
		
		
		}
		
		

	
		
		
		
		
	}


