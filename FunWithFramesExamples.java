package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunWithFramesExamples {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");

driver.switchTo().frame(0);

WebElement button1=driver.findElement(By.id("Click"));

button1.click();

String text=driver.findElement(By.id("Click")).getText();
System.out.println(text);


driver.switchTo().defaultContent();
driver.switchTo().frame(1);
driver.switchTo().frame("frame2");

WebElement button2=driver.findElement(By.id("Click1"));
button2.click();

driver.switchTo().defaultContent();

List<WebElement> frames=driver.findElements(By.tagName("iframe"));
int size=frames.size();
System.out.println(size);






	}

}
