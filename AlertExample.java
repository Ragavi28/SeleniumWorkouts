package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");

		
		WebElement AlertBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		AlertBox.click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		WebElement ConfirmBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		ConfirmBox.click();
		
		Alert ConfirmAlert=driver.switchTo().alert();
		ConfirmAlert.dismiss();
		
		
		
		WebElement PromptBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		PromptBox.click();
		
		Alert Prompt =driver.switchTo().alert();
		 Prompt.sendKeys("ragavi");
		 
		 Prompt.accept();
		
		
		
	}

}
