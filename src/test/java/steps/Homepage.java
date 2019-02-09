package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage {

    WebDriver driver;
    @Given("^Open homepage in Firefox Browser$")
    public void openHomepageInFirefoxBrowser() {
        DriverFactory browser= new DriverFactory();
        browser.firefoxbrowser();
        driver= new FirefoxDriver();
        driver.get("http://www.google.com");

    }

    @When("^Homepage is opened close the browser$")
    public void homepageIsOpenedCloseTheBrowser() {
        driver.close();
    }


    @When("^open gmail$")
    public void openGmail() {

        driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div[2]/div/div/div[1]/div[1]/a"));
        //driver.findElement(By.className("gb_P"));


    }


    @Then("^close the browser$")
    public void closeTheBrowser() {
        driver.close();
    }

    @When("^user enters text in search field and navigates to expected url$")
    public void userEntersTextInSearchFieldAndNavigatesToExpectedUrl() {
        driver.findElement(By.name("q")).sendKeys("gmail");
        driver.findElement(By.name("btnK")).click();
    }
}
