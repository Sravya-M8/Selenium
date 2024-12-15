package selIntroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyBobst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://s1.mybobst.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("signInName")).sendKeys("pim.mathi.sravya@bobst.com");
		Thread.sleep(1000);
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("i0118")).sendKeys("Sravya@@@148");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='idSIButton9']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
