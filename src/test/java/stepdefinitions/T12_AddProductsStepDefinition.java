package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AllProductsPage;
import pages.CheckoutPage;
import pages.LoginPage;
import utilities.Driver;

public class T12_AddProductsStepDefinition {
    AllProductsPage allProductsPage = new AllProductsPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    LoginPage loginPage=new LoginPage();
    @Given("Navigate to url {string}")
    public void navigateToUrlGider(String arg0) {
        Driver.getDriver().get(arg0);
    }
    @When("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Automation"));
        Driver.wait(1);
    }
    @And("Click on Products button")
    public void clickOnProductsButton() {
        loginPage.buttonProducts.click();
        Driver.getDriver().navigate().refresh();
        loginPage.buttonProducts.click();
    }
    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        Driver.hoverOverOnElementActions(allProductsPage.firstProductPicture);
        Driver.wait(2);
        allProductsPage.buttonAddToCartFirst.click();
        Driver.wait(2);
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        allProductsPage.buttonContinueShopping.click();
    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        Actions actions = new Actions(Driver.getDriver());

        // Ekranı aşağı kaydırarak elementi görünür hale getirin
        WebElement element = allProductsPage.twoProductPicture;
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        Driver.wait(1); // Sayfanın kaydırma işleminden sonra yerleşmesini sağlamak için bekleme

        // Element üzerinde hover işlemi gerçekleştir
        actions.moveToElement(element).perform();
        Driver.wait(2);

        // Ürünü sepete ekle
        allProductsPage.buttonAddToCartTwo.click();
        Driver.wait(2);
    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        allProductsPage.buttonViewCart.click();
    }

    @When("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(checkoutPage.textPriceCheckout.isDisplayed());
        Assert.assertTrue(checkoutPage.textQuantityCheckout.isDisplayed());
        Assert.assertTrue(checkoutPage.textTotalCheckout.isDisplayed());

    }
}
