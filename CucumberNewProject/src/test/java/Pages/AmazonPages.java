package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonFilter = By.cssSelector(".a-spacing-micro[aria-label='Gönderim'] .a-checkbox .a-icon");
    static By appleFilter = By.cssSelector("[aria-label='Apple'] .a-icon");
    static By firstProduct = By.cssSelector("[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By add = By.id("add-to-cart-button");
    static By back = By.id("attach-close_sideSheet-link");
    static By cart = By.id("nav-cart-count");
    static By check = By.cssSelector(".sc-list-item-content");

    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver , 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookies() {
        elementHelper.click(accept);
    }
    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search, "Airpods");
    }

    public static void searhButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterApple() {
        elementHelper.click(appleFilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(back);
        elementHelper.click(cart);
    }

    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
