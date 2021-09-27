package com.valkovskyi.experimenting.google.pages;

import com.valkovskyi.experimenting.core.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

public class GoogleHomeSearchPage extends BaseGooglePage{

    private WebElement googleSearchField = DriverWrapper.getDriver().findElement(By.className("gLFyf"));
    private WebElement googleSearchButton = DriverWrapper.getDriver().findElement(By.name("btnK"));

    public GoogleHomeSearchPage setTextToSearchField(String text) {
        googleSearchField.sendKeys(text);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public GoogleSearchResultPage clickGoogleSearchButton() {
        googleSearchButton.click();
        return new GoogleSearchResultPage();
    }
}
