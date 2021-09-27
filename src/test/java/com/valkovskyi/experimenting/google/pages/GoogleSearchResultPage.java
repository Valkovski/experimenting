package com.valkovskyi.experimenting.google.pages;

import com.valkovskyi.experimenting.core.DriverWrapper;

public class GoogleSearchResultPage extends BaseGooglePage {
    public String getTitle() {
        return DriverWrapper.getDriver().getTitle();
    }
}
