package selIntroduction;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verification {
	public static void main(String[] args) {		
		WebDriver driver = new ChromeDriver();		
		System.setProperty("webdriver.chromedriver", "/home/calmarti/chromedriver/chromedriver");		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));				
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");	
		//type username		
		driver.findElement(By.id("password")).sendKeys("learning");				
		//type password 		
		driver.findElement(By.cssSelector("input[value='user'] ~ span[class='checkmark']")).click();		
		//check user checkbox		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-dialog.modal-confirm")));    
		//wait for the modal 		
		driver.findElement(By.id("okayBtn")).click();																	
		//click on 'confirm'		//wait.until(ExpectedConditions.alertIsPresent());  
		//this "alert" is not a real alert so this doesn't work     		//driver.switchTo().alert().accept();		
		WebElement selectElem = driver.findElement(By.cssSelector("select[data-style='btn-info']"));        
		//find Select elem      		
		Select select = new Select(selectElem);																		
		select.selectByValue("consult");																	
		//select 'consultant' option			
		driver.findElement(By.cssSelector("input#terms")).click();											
		//check 'agree to terms'		
		driver.findElement(By.cssSelector("input#signInBtn")).click();										
		//click on 'Sign in'				
		wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));		
		List<WebElement> buttons = driver.findElements(By.cssSelector("app-card button.btn.btn-info"));				
		for (int i= 0; i < buttons.size(); i++) {			
			buttons.get(i).click();				//add 1 unit of each product to cart 		
			}		
		driver.manage().window().maximize();     	
			driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();  //click on 'checkout'		driver.findElement(By.cssSelector("button.btn.btn-success")).click();      //click on second 'checkout'	}
		}
	}
