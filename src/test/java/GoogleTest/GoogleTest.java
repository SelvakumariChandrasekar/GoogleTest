package GoogleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class GoogleTest {

	@Test
	public void GooglePage() throws IOException{
		
		 WebDriver wd = new FirefoxDriver();
		    wd.get("https://www.google.co.in");
		    WebElement input =wd.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]"));
		    input.sendKeys("abc");
		    File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("F:\\Eclipse\\GoogleTest\\Screenshot\\google1.jpg"));
		    			}

	}
	

