package com.valkovskyi.experimenting.selenium4;

import com.valkovskyi.experimenting.google.pages.GoogleHomeSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium4Test extends SeleniumBaseTest {
    @Test
    public void testingChromeAndSeleniumBasic() {
        log.info("start test");
        Assert.assertEquals(true, true);
    }

    @Test
    public void testBasingSearchOnGoogleMainPage() {
        log.info("start of test");
        String title =
                new GoogleHomeSearchPage()
                        .setTextToSearchField("Vietnam")
                        .clickGoogleSearchButton()
                        .getTitle();
        Assert.assertTrue(title.contains("Vietnam"));
        log.info("finish");
    }
}
