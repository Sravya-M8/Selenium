package selIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//invoking browser
		//Steps to invoke chrome driver
		//Selenium  manager
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Documents\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		//driver.get("https://s1.mybobst.com");
		//System.out.println(driver.getTitle());
		//driver.quit();
		driver.close();
		

	}

}
