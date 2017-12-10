package IOSAppium;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class SafariBrowser {
private IOSDriver<IOSElement> driver;
private WebDriverWait wait;
	@Before
	public void setUp() throws Exception {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.youtube.com");
		assertTrue(driver.getTitle().equals("Home - YouTube"));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("koya_child_409")));
//		driver.findElement(By.xpath("//a[@href='/feed/trending']")).click();
//		Thread.sleep(3000);
//		assertTrue(driver.getTitle().equals("Trending - YouTube"));
//		driver.findElements(By.xpath("//div[@class='cn']")).get(2).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
//		driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
		driver.findElement(By.xpath("//button[@title='Search YouTube']")).click();
		driver.findElement(By.name("q")).sendKeys("selenified"+Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/watch?v=SOHGF_lbTB4']")).click();
		
	}

}
