package anu;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kulu 
{



		WebDriver driver = null;
		@Before
		public void setUp() throws Exception {
			//driver.findElement(By.cssSelector("#hdr-search-box")).sendKeys("politics",Keys.ENTER);
			
			
			
			
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.navigate().to("http://www.cnn.com");
			driver.manage().window().maximize();
		}
		
		@Test
		public void test() throws InterruptedException
		{
			driver.findElement(By.cssSelector("#hdr-search-box")).sendKeys("politics",Keys.ENTER);
			
			System.out.println(driver.getCurrentUrl());
			driver.manage().window().maximize();
		}

		@After
		public void tearDown() throws Exception {
			driver.quit();
		}

		

	}



