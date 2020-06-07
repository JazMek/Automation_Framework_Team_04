package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static Home.AmazonPageWebElement.*;
import static Home.BaseClass.*;

public class HomePage extends WebAPI {




    public void wholefoodsPage() {
        amazonWholefoodsbutton.click();


    }
public static String expecttext="";
    public void verifywholefoodslogo() {
        amazonWholefoodstext.isDisplayed();

    }
}
