package com.valkovskyi.experimenting.selenium4;

import com.valkovskyi.experimenting.core.DriverWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium4Test extends SeleniumBaseTest {
    @Test
    public void testingChromeAndSeleniumBasic() {
        DriverWrapper.getDriver().navigate().to("https://google.com");
        DriverWrapper.getDriver().quit();
        Assert.assertEquals(true, true);
    }
}
