package Baseclasspom;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	
	public static WebDriver driver;

	public static void Lanuch(String browser,String url) {
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Chrome is lanuched");
			driver.get(url);
			

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Edge is lanuched");
			driver.get(url);
			
		}
		
		}
	
	public static void click(String attval)  {

			driver.findElement(By.xpath(attval)).click();
		
	}
	public static void Entertext(String attval,String data)  {

			driver.findElement(By.xpath(attval)).sendKeys(data);;
	
		
		}

		public static void dropdown(String div ,String li ) throws InterruptedException  {
			driver.findElement(By.xpath(div)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(li)).click();
				}
		
		
public static void screenshot(String name) throws IOException {
			
			TakesScreenshot s =(TakesScreenshot) driver;
			
			File ScreenshotAs = s.getScreenshotAs(OutputType.FILE);
			File f = new File("C:\\Users\\balus\\eclipse-workspace\\InternTask\\"+name+".png");
			FileUtils.copyFile(ScreenshotAs, f);
			}

	
		
}
