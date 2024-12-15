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

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[normalize-space()='User']")).click();
		//Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement testDropdown=driver.findElement(By.cssSelector("select.form-control"));
		//select[class='form-control']
		Select dropdown=new Select(testDropdown);
		dropdown.selectByValue("consult");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
	
	
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<products.size();i++)
		{
			products.get(i).click();

			
		}
	}

}
