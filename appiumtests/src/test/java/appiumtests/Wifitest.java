package appiumtests;

import java.net.MalformedURLException;

import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Wifitest {

	static AndroidDriver<MobileElement> driver;
	@Test
	public void wifitesting() throws MalformedURLException {
		
		DesiredCapabilities cap =new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Nexus S API 28_mydevice2");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		
		//Clink on the check box for Accepting browser terms
		driver.findElementById("com.android.chrome:id/send_report_checkbox").click();
		driver.findElementById("com.android.chrome:id/send_report_checkbox").click();
		
		//Accept & Continue on the chrome browser
		driver.findElementById("com.android.chrome:id/terms_accept").click();
		
		//Click 'No thanks' for 'Sign in to chrome option'		
		driver.findElementById("com.android.chrome:id/negative_button").click();
		
		//Click on the search bar
		driver.findElementById("com.android.chrome:id/search_box_text").click();
		
		
		//To go to the portal
		driver.findElementById("com.android.chrome:id/url_bar").sendKeys("https://portal-lite-demo.cms.nomadrail.com/");
		
		//Click the right arrow button to go to the URL link
		driver.findElementById("com.android.chrome:id/header_icon").click();
		
				
		//Click on the internet symbol
		((RemoteWebElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View")).click();
		
		
		
		//Check for the expanded section with option to 'Connect Now' link
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[3]");
		
		//Click on Connect now link
		driver.findElementByLinkText("Connect now").click();
		
		//Click on the check box for accepting the terms
		((RemoteWebElement) driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View")).click();
		
		//Click on Submit button
		driver.findElementByLinkText("SUBMIT").click();
		
		//Click on Continue with -authentication option
		driver.findElementByLinkText("CONTINUE WITH AUTHENTICATION").click();
		
		//check for any server error
		driver.getPageSource().contains("Server Error");
		
		
		driver.quit();
				
		
	}
	
}
