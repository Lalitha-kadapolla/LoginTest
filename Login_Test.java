package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Calendar cal= Calendar.getInstance();
		Date time=cal.getTime();
		String timestamp=time.toString().replace(":", "-").replace(" ", "-");

		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://www.getcalley.com/");
		File ts1= ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ts1,new File("./Windows/1920×1080/Screenshot"+timestamp+".png"));
		Thread.sleep(2000);
		driver1.quit();
		
		WebDriver driver2 = new FirefoxDriver();	
		driver2.get("https://www.getcalley.com/calley-lifetime-offer/");
		driver2.manage().window().setSize(new Dimension(1366, 768));
		File ts2= ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ts2,new File("./Windows/1366×768/Screenshot"+timestamp+".png"));
		Thread.sleep(2000);
		driver2.quit();
		

		WebDriver driver3 = new EdgeDriver();
		driver3.get("https://www.getcalley.com/see-a-demo/");
		driver3.manage().window().setSize(new Dimension(1536, 864));
		File ts4= ((TakesScreenshot)driver3).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ts4,new File("./Windows/1536×864/Screenshot"+timestamp+".png"));
		Thread.sleep(2000);
		driver3.quit();
	}

}
