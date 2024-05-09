package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {
    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//td[.='Price']") public WebElement textPriceCheckout;
    @FindBy(xpath = "//td[.='Quantity']") public WebElement textQuantityCheckout;
    @FindBy(xpath = "//td[.='Total']") public WebElement textTotalCheckout;

}
