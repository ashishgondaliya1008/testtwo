package testtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	 
	
	@Test
	  public void testone() throws InterruptedException {
	   
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	  
		  driver.navigate().to("https://web.whatsapp.com/");   
		  System.out.println("testone");

		 
		  Thread.sleep(10000);
		  System.out.println("testone2");
		  
		  Thread.sleep(100000);
		  driver.navigate().refresh();   

		 WebElement ab= driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		 ab.sendKeys("ashish");

		  
	  }

}
