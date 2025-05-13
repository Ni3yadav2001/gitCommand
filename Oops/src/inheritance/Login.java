package inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public ChromeDriver driver;
	public static void main(String[] args) {
		
	}
	public void login() {
		driver= new	ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("nitin");
	  //  driver.findElement(By.id("submitButton")).click();

	}

}
