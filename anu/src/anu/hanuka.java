package anu;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class hanuka
{




		WebDriver driver = null;
		@Before
		public void setUp() throws Exception
		{
		    driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.navigate().to("http://www.cnn.com");
		    driver.manage().window().maximize();
		}

		@After
		public void tearDown() throws Exception
		{
			driver.close();
		}

		@Test
		public void test() throws InterruptedException 
		{
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(4000);
		}

	}




