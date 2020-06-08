package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static Home.AmazonPageWebElement.*;
import static Home.BaseClass.*;
import static Home.BaseClass.ClickBestSellers;

public class HomePage extends WebAPI {

    //    public void wholefoodsPage() {
//        amazonWholefoodsbutton.click();
//
//
//    }
//public static String expecttext="";
//    public void verifywholefoodslogo() {
//        amazonWholefoodstext.isDisplayed();
//
//    }
//
    public void BestSellersPage() {
        ClickBestSellers.click();

    }

    public static String ExpectedUrl="https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";
    public void VerifyBestSellersUrl(){

        Assert.assertEquals(driver.getCurrentUrl(),ExpectedUrl,"the url used didn't navigate to the Best Sellers Page");





    }





}
