package pomClasses;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com//signup");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date dt=new Date();
		
		String time = dt.toString();
		String rep = time.replace(":", "_");
		
		
		File dest=new File("E:\\Selenium Doc\\"+rep+".jpg");
		
		FileHandler.copy(source, dest);
		
	}
	


}
