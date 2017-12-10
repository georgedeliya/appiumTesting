package IOSAppium;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class youtube extends ios_cap {
	static IOSDriver<IOSElement> driver;
public static void main(String[] args) throws MalformedURLException {
	driver=ios_caps();
	driver.findElementByAccessibilityId("Alert Views").click();
	driver.findElementByAccessibilityId("Text Entry").click();
}
}
