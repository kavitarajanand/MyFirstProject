package demo;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstProgram {
	
	
	WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {
		
		By login=By.xpath("//a[text() = 'Signin']");
	
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://way2automation.com/way2auto_jquery/frames-and-windows.php");
		driver.findElement(login).click();

	//	List<WebElement> box =driver.findElements(By.xpath("//ul[@id='toggleNav']/li[3]/a/following-sibling::ul/li "));
	//	System.out.println("the total number of Widgets in the page are ::" + box.size());
		
	/*	//driver.findElement(By.xpath("//a[text() = 'Signin']")).click();
		driver.findElement(By.xpath("//div[@id = 'login']//input[@name = 'username']")).sendKeys("monnappa05");
		
		driver.findElement(By.xpath("//div[@id = 'login']//input[@name = 'password']")).clear();
		driver.findElement(By.xpath("//div[@id = 'login']//input[@name = 'password']")).sendKeys("Preeth34#@");
				
		driver.findElement(By.xpath("//div[@id = 'login']//input[@class = 'button']")).click();
		
		driver.findElement(By.cssSelector("#toggleNav>li:nth-of-type(3)>a")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/ul/li[5]/a")).click();
		driver.switchTo().frame(0);
    	WebElement slider = driver.findElement(By.xpath(".//*[@id='slider-range-max']/span"));
	    assertTrue(slider.isDisplayed());
	    
	    Dimension dim = slider.getSize();
	    int x = dim.getWidth();
	    System.out.println("Width     " + x);
	    Actions action = new Actions(driver);
	   // action.moveToElement(slider).moveByOffset(x-10, 0).build().perform();
		action.dragAndDropBy(slider,100, 0).build().perform();
        
	    driver.switchTo().defaultContent();
		
		
		*/
		
	}
	

	/*
	private static void assertTrue(boolean displayed) {
		// TODO Auto-generated method stub
		
	}
*/


	
		
			/*	FirefoxDriver driver=new FirefoxDriver();
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver.get("http://www.way2automation.com/demo.html");
				driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/a")).click();
			    driver.findElement(By.xpath(".//*[@id='toggleNav']/li[3]/ul/li[5]/a")).click();
			    driver.findElement(By.name("//input[@name='name']")).sendKeys("seleniumuser");
			    driver.findElement(By.name("//input[@name='phone']")).sendKeys("9992345645");
			    driver.findElement(By.name("//input[@name='email']")).sendKeys("selenium@gmail.com");
			    WebElement e= driver.findElement(By.name("country"));
			    Select sel =new Select(e);
			    sel.selectByVisibleText("India");
			    driver.findElement(By.name("//input[@name='city']")).sendKeys("banglore");
			    driver.findElement(By.name("//input[@name='username']")).sendKeys("selenium1234");
			    driver.findElement(By.name("//input[@name='password']")).sendKeys("selenium");
			    driver.findElement(By.name("//input[@class='button']")).click();*/
			    
			    
                // driver.get("http://way2automation.com/way2auto_jquery/slider.php");				
				
			//	driver.switchTo().frame(0);
		    //	WebElement slider = driver.findElement(By.xpath(".//*[@id='slider-range-max']/span"));
			 //   assertTrue(slider.isDisplayed());
			    
		/*	 Dimension dim = slider.getSize();
			    int x = dim.getWidth();
			    System.out.println("Width     " + x);
			    Actions action = new Actions(driver);
			   // action.moveToElement(slider).moveByOffset(x-10, 0).build().perform();
				action.dragAndDropBy(slider,100, 0).build().perform();
		        
			    driver.switchTo().defaultContent();*/
				
				
			
	}


