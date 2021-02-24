import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenTheApp {

    @Test
    public void openAppOnAndroid(){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 28");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        caps.setCapability(MobileCapabilityType.APP, "C:\\git-rep\\appium-java\\react-native-app\\android\\app\\build\\outputs\\apk\\debug\\app-debug.apk");

    }
}
