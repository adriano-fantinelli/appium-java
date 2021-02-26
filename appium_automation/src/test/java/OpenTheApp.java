import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenTheApp {

//    @Test
//    public void openAppOnAndroid() throws MalformedURLException {
//
//        String url = "http://127.0.0.1:4723/wd/hub";
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//        caps.setCapability(MobileCapabilityType.APP, "C:\\git-rep\\appium-java\\react-native-app\\android\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
////        caps.setCapability(MobileCapabilityType.ORIENTATION, "LANDSCAPE");
//        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
//
//    }

//    @Test
//    public void openWebAppOnAndroid() throws MalformedURLException {
//
//        WebDriverManager.chromedriver().browserVersion("69").setup();
//
//        String url = "http://127.0.0.1:4723/wd/hub";
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
//        caps.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, WebDriverManager.chromedriver().getBinaryPath());
//        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
//
//        driver.get("https://google.com");
//    }

    @Test
    public void openApreInstalledAppOnAndroid() throws MalformedURLException {

        WebDriverManager.chromedriver().browserVersion("69").setup();

        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.deskclock");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
        AppiumDriver driver = new AppiumDriver(new URL(url), caps);

//        driver.findElementById("com.google.android.deskclock:id/fab").click();
//        driver.findElementByClassName("android.widget.ImageButton").click();
//        driver.findElementByAccessibilityId("Cities").click();
        driver.findElementByXPath("//*[@text='ALARM']").click();

//        XPATH
//        //className[@attribute = 'value']
//        android.widget.TextView[@text='ALARM']
//        *
    }
}
