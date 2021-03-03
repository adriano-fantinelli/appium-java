import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class OpenTheApp {

    @Test
    public void openAppOnAndroid() throws MalformedURLException, InterruptedException {

        String url = "http://127.0.0.1:4723/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.APP, "C:\\git-rep\\appium-java\\react-native-app\\android\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
//        caps.setCapability(MobileCapabilityType.ORIENTATION, "LANDSCAPE");
        AppiumDriver driver = new AppiumDriver(new URL(url), caps);
        Thread.sleep(2000);
        driver.quit();
    }

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
//        driver.quit();
//    }

    @Test
    public void openApreInstalledAppOnAndroid() throws MalformedURLException {

        WebDriverManager.chromedriver().browserVersion("69").setup();

        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.deskclock");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
        AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL(url), caps);
        driver.quit();
    }

//        @Test
//    public void openAppOnAndroid() throws MalformedURLException {
//
//        String url = "http://127.0.0.1:4723/wd/hub";
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//        caps.setCapability(MobileCapabilityType.APP, "C:\\git-rep\\appium-java\\react-native-app\\android\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
//        AppiumDriver<AndroidElement> driver = new AppiumDriver<AndroidElement>(new URL(url), caps);
//
//        AndroidElement loginButton =  driver.findElementById("Login");
//
//        loginButton.click();
//
//        driver.quit();
//    }
}
