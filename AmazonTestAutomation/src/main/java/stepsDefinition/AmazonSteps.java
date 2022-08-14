package stepsDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObtejctModel.AmazonPage;
import utilities.Driver;

public class AmazonSteps {
    WebDriver driver;
    AmazonPage amazonPage = new AmazonPage();

    @Given("^Go to Amazon Website$")
    public void go_to_Amazon_Website() throws Throwable {
        driver=Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.de/");

    }

    @Given("^Are we on Home Page$")
    public void are_we_on_Home_Page() throws Throwable {
        amazonPage.setAreWeHomepage();
        amazonPage.setAcceptCurrents();
    }

    @Given("^Search for a phone in search box$")
    public void search_for_a_phone_in_search_box() throws Throwable {
        amazonPage.setTextBox();

    }

    @Given("^Are we on Product Page$")
    public void are_we_on_Product_Page() throws Throwable {
        amazonPage.setAreWeonProductPage();

    }

    @Given("^Click a Product$")
    public void click_a_Product() throws Throwable {
        amazonPage.setProductSelections();

    }

    @Given("^Are we on Products Detail Page$")
    public void are_we_on_Products_Detail_Page() throws Throwable {
        amazonPage.setAreWeonProductDetailsPage();

    }

    @Given("^Add product to Cart$")
    public void add_product_to_Cart() throws Throwable {
        amazonPage.setAddProductToCart();
    }

    @Given("^Check product count on cart image on Home Page$")
    public void check_product_count_on_cart_image_on_Home_Page() throws Throwable {
        amazonPage.setCheckProductCountGoods();
    }

    @When("^Go to Cart Page$")
    public void go_to_Cart_Page() throws Throwable {
        amazonPage.goToCartPage();

    }

    @Then("^Check if the product was added to cart successfully$")
    public void check_if_the_product_was_added_to_cart_successfully() throws Throwable {
        amazonPage.setSuccessfullyMessage();
    }

}
