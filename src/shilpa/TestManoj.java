package shilpa;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;




public class TestManoj {
	
	public static void main(String[] args) throws Exception {
		System.out.println("hello manoj");
		
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");

		capabilities.setCapability("deviceName", "Emulator");
        capabilities.setCapability("automatioName", "UiAutomator2");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("platformName", "Andriod");
		capabilities.setCapability("app", "C:\\Users\\Admin\\Downloads\\Contact Manager_v10102015.08_apkpure.com.apk");
		capabilities.setCapability("app-package", "com.example.android.contactmanager-1");
		capabilities.setCapability("app-activity", ".ContactManager");


		WebDriver driver;
		driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		System.out.println("mmmsmms");
		//WebDriver =new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("lst-ib")).sendKeys("salman khan");
		driver.findElement(By.name("btnK")).click();
		
		TakesScreenshot srcshot=(TakesScreenshot)(driver);
		File srcFile=srcshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("E://manoj.jpg"));
	}

}
