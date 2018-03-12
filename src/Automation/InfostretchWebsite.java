package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class InfostretchWebsite {

	public static void main(String args[]) {

//		System.setProperty("webdriver.chrome.driver","/Users/deepal/Downloads/chromedriver");
//		 WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/deepal/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.infostretch.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.xpath("//img[@src='https://www.infostretch.com/wp-content/uploads/svg/infostretch_logo.svg']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@class='content  home_new-page']/div[2]/div/div/div[1]/div")).getText().length());
		System.out.println(driver.findElement(By.linkText("SERVICES")).isDisplayed());
		driver.close();
	}
		
	}

