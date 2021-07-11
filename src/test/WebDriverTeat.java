package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.simplilearn.com/");
        
driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
        WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        
        LoginLink.click();
        
        WebElement UserName = driver.findElement(By.name("user_login"));
        
        UserName.sendKeys("abc@xyz.com");
        
        WebElement Password = driver.findElement(By.id("password"));
        
        Password.sendKeys("abc@xyz");
        
         WebElement Rememberme = driver.findElement(By.className("rememberMe"));
        
        Rememberme.click();
        
        
        
        
        WebElement Login = driver.findElement(By.name("btn_login"));
        
        Login.click();
      
        WebElement Error = driver.findElement(By.id("msg_box"));
        String ActMsg = Error.getText();
        
        String ClassName = Error.getAttribute("class");
        String TagName = Error.getTagName();
        
        System.out.println("Class Name is" + ClassName);
        System.out.println("Tag Name is" + TagName);
        
        String ExpMsg = "The email or pasword you have entered is invalid";
        
        if(ActMsg.equals(ExpMsg)) {
        System.out.println("Test pass");
        }else {
        System.out.println("Test Failed");
        }
        
        List<WebElement> InPutTag = driver.findElements(By.tagName("input"));
        System.out.println("Total Input Tags are " + InPutTag.size());
        
        List<WebElement> ListofLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links available on the page: " + ListofLinks.size());
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("The number of links are " + links.size());   

	
		 
        for(int index=0; index<links.size() ; index++) {
       	 
       	 System.out.println("Hyperlink Text " + links.get(index) .getText());

        }
        
        driver.close();
	}

}
