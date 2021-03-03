import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class FindElementsAppium {
    @Test
    public void AndroidSelectors() throws MalformedURLException {

        WebDriverManager.chromedriver().browserVersion("69").setup();

        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.deskclock");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
        AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL(url), caps);
//
//        driver.findElementById("com.google.android.deskclock:id/fab").click();
//        driver.findElementByClassName("android.widget.ImageButton").click();
//        driver.findElementByAccessibilityId("Cities").click();
//        driver.findElementByXPath("//*[@text='ALARM']").click();
//        driver.findElement(MobileBy.AndroidUIAutomator("text(\"ALARM\")")).click();

//        XPATH
//        //className[@attribute = 'value']
//        android.widget.TextView[@text='ALARM']
//        *

//       UI Automator
//       attribute("value")
//       text("Alarm")

        List<MobileElement> icons =  driver.findElementsByClassName("android.widget.TextView");
        icons.get(2).click();

//        driver.findElementsByClassName("android.widget.TextView").get(2).click();

    }
}
