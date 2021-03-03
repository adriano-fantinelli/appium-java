import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommandsAppium {
    @Test
    public void Commands() throws MalformedURLException {

        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.APP, "C:\\git-rep\\appium-java\\react-native-app\\android\\app\\build\\outputs\\apk\\debug\\app-debug.apk");
        AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL(url), caps);
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

//        CLICK
//        driver.findElementByXPath("//*[@text='Signup']").click();

//        SENDKEYS
//        driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys("test@qacart.com");
//        driver.findElementsByClassName("android.widget.EditText").get(1).sendKeys("test123!");


          MobileElement emailTextField = driver.findElementsByClassName("android.widget.EditText").get(0);

//        ROTATE
//        driver.rotate(ScreenOrientation.LANDSCAPE);
//        driver.rotate(ScreenOrientation.PORTRAIT);

//        GET SIZE
//          System.out.println(emailTextField.getSize().height);
//          System.out.println(emailTextField.getSize().width);
//          System.out.println(emailTextField.getSize());

//        GET LOCATION
//        System.out.println(emailTextField.getLocation().x);
//        System.out.println(emailTextField.getLocation().y);
//        System.out.println(emailTextField.getLocation());

//        IS DISPLAYED
//        boolean isDisplayed = emailTextField.isDisplayed();
//        System.out.println(isDisplayed);

//        GET ATTRIBUTE
//        String packageName = emailTextField.getAttribute("package");
//        System.out.println(packageName);


//        GET TEXT
//        emailTextField.sendKeys("test@qacart.com");
//        String emailValue = emailTextField.getText();
//        System.out.println(emailValue);

//        CLEAR
//        emailTextField.sendKeys("test@qacart.com");
//        emailTextField.clear();

    }

    @Test
    public void CreateAlarm() throws MalformedURLException {

        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.deskclock");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.deskclock.DeskClock");
        AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(new URL(url), caps);

        driver.findElementByXPath("//*[@text='ALARM']").click();
        driver.findElementByAccessibilityId("Add alarm").click();

        MobileElement hour4 = driver.findElementByAccessibilityId("4");
        MobileElement hour11 = driver.findElementByAccessibilityId("11");

        Actions action = new Actions(driver);

//        action.clickAndHold(hour4).moveToElement(hour11).build().perform();
        action.dragAndDrop(hour4, hour11).build().perform();

//        driver.quit();
    }
}
