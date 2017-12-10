package IOSAppium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class UICatalog extends ios_cap {
static IOSDriver<IOSElement> driver;
public static void main(String[] args) throws MalformedURLException {
driver=ios_caps();
//driver.findElementByAccessibilityId("Alert Views").click();
//driver.findElementByAccessibilityId("Text Entry").click();
//driver.findElement(By.className("XCUIElementTypeTextField")).sendKeys("hello");
//driver.findElement(By.name("OK")).click();
//driver.navigate().back();
//driver.findElementByAccessibilityId("Steppers").click();
//driver.findElementByAccessibilityId("Increment").click();
//driver.findElementByAccessibilityId("Increment").click();
//System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(0).getText());
//driver.navigate().back();
driver.findElementByAccessibilityId("Picker View").click();
driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
//driver.findElementsByClassName("XCUIElementTypePickerWheel").get(0).sendKeys("75");
driver.findElementByName("Blue color component value").sendKeys("50");
}
}
