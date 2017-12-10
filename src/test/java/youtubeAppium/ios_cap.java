package youtubeAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class ios_cap {
	static IOSDriver<IOSElement> driver;
	public static IOSDriver<IOSElement> ios_caps() throws MalformedURLException{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.SAFARI);
		
//		cap.setCapability(MobileCapabilityType.APP, "/Users/Gosha/Desktop/UICatalog.app");
		driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
	}


