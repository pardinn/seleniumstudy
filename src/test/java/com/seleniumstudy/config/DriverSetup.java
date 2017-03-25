package com.seleniumstudy.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by morae on 25/03/2017.
 */
public interface DriverSetup {

    WebDriver getWebDriverObject(DesiredCapabilities capabilities);

    DesiredCapabilities getDesiredCapabilities();
}
