package com.seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by morae on 25/03/2017.
 */
public class BasicTestWD extends DriverFactory {

    private void googleExampleThatSearchesFor(final String searchString) throws Exception {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("http://www.google.com");
        WebElement searchField = driver.findElement(By.name("q"));

        searchField.clear();
        searchField.sendKeys(searchString);

        System.out.println("Page title is: " + driver.getTitle());
        searchField.submit();

        new WebDriverWait(driver, 10).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driverObject) {
                return driverObject.getTitle().toLowerCase()
                        .startsWith(searchString.toLowerCase());
            }
        });
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void googleCheeseExample() throws Exception {
        googleExampleThatSearchesFor("Cheese!");
    }

    @Test
    public void googleMilkExample() throws Exception {
        googleExampleThatSearchesFor("Milk!");
    }

    @Test
    public void googleTestNGExample() throws Exception {
        googleExampleThatSearchesFor("TestNG!");
    }

    @Test
    public void googleJUnitExample() throws Exception {
        googleExampleThatSearchesFor("JUnit!");
    }

    @Test
    public void googleJohnExample() throws Exception {
        googleExampleThatSearchesFor("John!");
    }

    @Test(enabled = false)
    public void googlePetrucciExample() throws Exception {
        googleExampleThatSearchesFor("Petrucci!");
    }

    @Test(enabled = false)
    public void googleJavaExample() throws Exception {
        googleExampleThatSearchesFor("Java!");
    }

    @Test(enabled = false)
    public void googleSeleniumExample() throws Exception {
        googleExampleThatSearchesFor("Selenium!");
    }

    @Test(enabled = false)
    public void googleGitExample() throws Exception {
        googleExampleThatSearchesFor("Git!");
    }

    @Test(enabled = false)
    public void googleMavenExample() throws Exception {
        googleExampleThatSearchesFor("Maven!");
    }

}