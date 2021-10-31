package com.valkovskyi.experimenting.google.pages;

import com.valkovskyi.experimenting.core.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This is a google search home page class representation
 */
public class GoogleHomeSearchPage extends BaseGooglePage {

    private WebElement googleSearchField = DriverWrapper.getDriver().findElement(By.className("gLFyf"));
    private WebElement googleSearchButton = DriverWrapper.getDriver().findElement(By.name("btnK"));

    /**
     * method send %text% to the google search field
     *
     * @param text - string variable representing the text we will input into the search field
     * @return GoogleHomeSearchPage .this
     */
    public GoogleHomeSearchPage setTextToSearchField(String text) {
        log.info("inserting test to google search button " + text);
        /**
         * sending keys
         */
        googleSearchField.sendKeys(text);
        //TODO fix the thread.sleep
        int waitTime = 500;
        log.info("waiting for the page to load for " + waitTime);
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public GoogleSearchResultPage clickGoogleSearchButton() {
        log.info("clicking on google search button");
        googleSearchButton.click();
        return new GoogleSearchResultPage();
    }
}
