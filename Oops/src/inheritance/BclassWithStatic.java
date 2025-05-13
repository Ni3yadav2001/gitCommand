package inheritance;

import org.openqa.selenium.By;

public class BclassWithStatic extends AclassWithStatic {

	public static void main(String[] args) {
		
		createLeads();
		
		
		

	}
	public static void leadsList() {
	    login();
		driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
	}
	public static void createLeads() {
		
		leadsList();
		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
	}

}
