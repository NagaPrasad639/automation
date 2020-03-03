package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	
	public WebDriver driver;
	 @BeforeClass
	public void open()
	{
	
	driver=new ChromeDriver();
	driver.get("http://www.sunnxt.com");
	driver.manage().window().maximize();
	}
	
	//@AfterClass
	public void closebrowser() {
	driver.quit();
	}
	
	//lOGIN PAGE
  @Test
	public void login() throws InterruptedException
	
	 
	{
	driver.findElement(By.id("show_sign")).click();
	driver.findElement(By.xpath("//*[@class='signinicon dropdown-menu dropdown-menu-right logg']")).click();

	Thread.sleep(3000);
	driver.findElement(By.id("email-up")).sendKeys("9502093303");
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("123456");
	
	driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-red']")).click();
	//driver.findElement(By.xpath("(//*[@class='log_btn'])[1]")).click();
	//driver.findElement(By.linkText("submit")).click();
	Thread.sleep(5000);
	
	}
	
	// Change language to malayalam
	
	@Test(priority=1)
	public void language() throws Throwable 
	{

	 driver.findElement(By.xpath("(//*[@class='btn-group bootstrap-select'])[1]")).click();
	 
	 Thread.sleep(5000);
	 //driver.findElement(By.xpath("(//*[@class='glyphicon glyphicon-ok check-mark'])[3]")).click();
	 driver.findElement(By.linkText("Malayalam")).click();
	 Thread.sleep(7000);
	 
	 // Scroll down
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Element = driver.findElement(By.cssSelector("a[href='/about/']"));
		
		

    	 js.executeScript("arguments[0].scrollIntoView();", Element);
    	 
    	 
    	 //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/footer/div[1]/ul/li[9]/a")).click();
    	 driver.findElement(By.cssSelector("a[href='/about/']")).click();
    	 		
    	 Thread.sleep(15000);
    	 driver.navigate().back();
    	 Thread.sleep(15000);
    	 
    	// String sunnxt=driver.getTitle();
    	// System.out.println(""+sunnxt);
		
	}
	  // CONTENT PLAY BACK ON MALAYAM LANGUAGE
	@Test(priority=2)
	public void contentplay() throws Throwable{
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Element = driver.findElement(By.xpath("((//div[@class='home_movie_list'])[5]//div[@class='hm_movie_img'])[8]"));
		
		

    	 js.executeScript("arguments[0].scrollIntoView();", Element);
    	 
		driver.findElement(By.xpath("((//div[@class='home_movie_list'])[5]//div[@class='hm_movie_img'])[8]")).click();
		Thread.sleep(15000);
		driver.findElement(By.id("vidPlayBtn")).click();
		Thread.sleep(20000);
		
		//content play back similar content
		driver.findElement(By.xpath("((//div[@class='home_movie_list'])[5]//div[@class='hm_movie_img'])[9]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("vidPlayBtn")).click();

	
		
	}
}

	
	


