package com.valkovskyi.experimenting.google.pages;

import com.valkovskyi.experimenting.core.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleHomeSearchPage extends BaseGooglePage{

    private WebElement googleSearchField = DriverWrapper.getDriver().findElement(By.className("gLFyf gsfi"));
    private WebElement googleSearchButton = DriverWrapper.getDriver().findElement(By.className("gNO89b"));

    public GoogleHomeSearchPage setTextToSearchField(String text) {
        googleSearchField.sendKeys(text);
        return this;
    }

    public GoogleSearchResultPage clickGoogleSearchButton() {
        googleSearchButton.click();
        return new GoogleSearchResultPage();
    }
}
