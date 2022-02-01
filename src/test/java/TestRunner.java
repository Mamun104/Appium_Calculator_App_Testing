import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TestRunner extends AppLaunch {
    TestCase testCase;
    @Test
    public void runTest() throws IOException, InterruptedException {
        testCase=new TestCase(driver);
        String result= testCase.openApp();
        Assert.assertEquals(result,"12");
    }
}
