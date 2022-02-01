import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class TestCase {
    AndroidDriver driver;
    @FindBy(id = "com.google.android.calculator:id/digit_5")
    MobileElement btn5;
    @FindBy(id="com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id="com.google.android.calculator:id/digit_7")
    MobileElement btn7;
    @FindBy(id="com.google.android.calculator:id/result_preview")
    MobileElement btnPreview;

    public TestCase(AndroidDriver driver) throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String openApp() throws InterruptedException, IOException {
        btn5.click();
        btnPlus.click();
        btn7.click();
        return btnPreview.getText();
    }

}
