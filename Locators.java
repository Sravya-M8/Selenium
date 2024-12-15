package selIntroduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//driver.findElement(By.className("Email Address"));  --> Error will come with this line
		//Reason: The issue is because of the way find by Class name works.
        //in your code class name is class="Email Address"
		//If the class name has space you'll get the above error.
		// You can simply get rid of the issue by using Id, CSS, Xpath, regular expression or any other element finder method.
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
		driver.findElement(By.className("submit")).click();
		//driver.findElement(By.cssSelector(".Email.Address"));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sravya");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sravya@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7702497748");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Reset Login']")).click();
		driver.findElement(By.cssSelector("div .go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Sravya");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		//button[normalize-space()='Reset Login']
		
		//System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//div[@class='forgot-pwd-btn-conainer']
		//Thread.sleep(1000);
		
		

	}

}
