package selIntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(opt);
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(opt);
		
	}

}
