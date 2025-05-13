package inheritance;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Leads extends Login {

	public static void main(String[] args) {
		Leads l=new Leads();
	//	l.deleteleads();
	//	l.createLeads();
	  //l.searchleads();
		l.leadsList();

	}
	public void leadsList() {
		login();
	//	driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
	}
	public void createLeads() {
		
		leadsList();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("mahan");
		driver.findElement(By.name("firstname")).sendKeys("nitinkumar");
		driver.findElement(By.name("company")).sendKeys(" restureant production");
		driver.findElement(By.id("city")).sendKeys("holland");
		driver.findElement(By.id("state")).sendKeys("up");
		driver.findElement(By.id("code")).sendKeys("23194");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.name("description")).sendKeys("belive my faith");
		driver.findElement(By.xpath("(//input[@accesskey='S'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
		
	}
	public void deleteleads() {
		leadsList();
		driver.findElement(By.id("125")).click();
		driver.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
		Alert al= driver.switchTo().alert();
		al.accept();
	}
	public void searchleads() {
		leadsList();
		
		WebElement webSelect= driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));
		Select sel= new Select(webSelect);
		sel.selectByVisibleText("Last Name");
		driver.findElement(By.name("search_text")).sendKeys("yadav");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

}

