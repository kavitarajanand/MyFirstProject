package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class1 {
	static WebDriver driver;
	//Launch browser
public  void LaunchBrowser()
{
	driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver.manage().window().maximize();
	}
public void patientLogin( String username,String password){
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000");
		driver.findElement(By.xpath(".//*[@id='testimonials']/div/div/div/div[2]/a")).click();
	
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(username);
	
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String  msg = driver.findElement(By.xpath("//h3[@class='page-header']")).getText();
		 if(
				 msg.equals("ria1"))
		 {
			 System.out.println("username is displayed in homepage");
			 
				 
		 }
			 else
			 {
				 System.out.println("username is not displayed in homepage");
		 }
		}
	public void closeBrowser()
	{
		if(!driver.toString().contains("null"));
		{
			driver.close();
		}
		}
	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.LaunchBrowser();
		obj.patientLogin("ria1","Ria12345");
		//obj.patientLogin("ria1", "ria12345");
		obj.closeBrowser();
		
	}

}
