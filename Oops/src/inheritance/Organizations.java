package inheritance;

import org.openqa.selenium.By;

public class Organizations extends Login {

	public static void main(String[] args) {
		Organizations org=new Organizations();
		org.createOrg();
	}
	public void orgList() {
		login();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	}
    public void createOrg() {
    	orgList();
    	driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	
    }
}
