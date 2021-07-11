package test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        driver.findElement(By.linkText("English(UK)")).click();
        
        WebElement UserName = driver.findElement(By.xpath("//input[@name='email']"));
        UserName.sendKeys("abc@xyz.com");
        
        WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
        Password.sendKeys("abc@xyz");
        
        WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
    	
    	LoginButton.click();

    	 WebElement CreateButton = driver.findElement(By.xpath("//button[@name='open-registration-from-button']"));
     	
     	LoginButton.click();
	}

}
