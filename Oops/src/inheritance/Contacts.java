package inheritance;

import org.openqa.selenium.By;

public class Contacts extends Login {

	public static void main(String[] args) {
		Contacts con=new Contacts();
		con.contactList();
	}
	public void contactList() {
		login();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	}

}
