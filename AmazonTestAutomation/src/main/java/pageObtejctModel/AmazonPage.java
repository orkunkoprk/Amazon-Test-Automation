package pageObtejctModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage extends AbstractClass{
    WebDriver driver;
    public AmazonPage(){
        driver=Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
@FindBy(id = "sp-cc-accept")
    private WebElement acceptCurrents;
    public void setAcceptCurrents() throws InterruptedException {
        clickFunction(acceptCurrents);
    } //olur
@FindBy(xpath = "(//h2[@class='a-color-base headline truncate-2line'])[2]")
    private WebElement areWeHomepage;
    public void setAreWeHomepage() throws InterruptedException {
        isElementExist(areWeHomepage);
        System.out.println("We are on Home Page!");
    }
@FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;
@FindBy(id = "twotabsearchtextbox")
    private WebElement textBox;
    public void setTextBox() throws InterruptedException {
        String value="Phone";
        sendKeysFunction(textBox,value);
        clickFunction(searchButton);
    }
@FindBy(xpath = "//a[text()='Bu sonuçlar hakkında bilgi edinin.']")
    private WebElement areWeonProductPage;
    public void setAreWeonProductPage(){
        String message="Bu sonuçlar hakkında bilgi edinin.";
        Assertion(areWeonProductPage,message);
       System.out.println("We are on Product Page!");
    }
@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
    private WebElement productSelections;
    public void setProductSelections() throws InterruptedException {
        //Yodoit Display Für Phone 11 LCD Bildschirm Ersatz 6,1 Zoll 3D Touch Digitizer Montage Glas Touchscreen Ersatz mit Reparatursatz, Kompatibel für Modell A2111, A2223, A2221 ürün seçilsin
        clickFunction(productSelections);
    }
@FindBy(xpath = "//span[@id='productTitle']")
    private WebElement areWeonProductDetailsPage;
    public void setAreWeonProductDetailsPage(){
        isElementExist(areWeonProductDetailsPage);
       System.out.println("We are on Product Details Page!");
    }
@FindBy(xpath = "//input[@name='submit.add-to-cart']")
    private WebElement addProductToCart;
    public void setAddProductToCart() throws InterruptedException {
        clickFunction(addProductToCart);
    }
@FindBy(id = "nav-cart-count")
    private WebElement checkProductCountGoods;
    public void setCheckProductCountGoods(){
        Assertion(checkProductCountGoods,"1");
     System.out.println("Sepetinizdeki mal sayısı 1 adettir!");
    }
    public void goToCartPage() throws InterruptedException {
        clickFunction(checkProductCountGoods);
    }
@FindBy(xpath = "//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")
    private WebElement successfullyMessage;
    public void setSuccessfullyMessage(){
        isElementExist(successfullyMessage);
        System.out.println("Product was added to cart successfully");
    }







}
