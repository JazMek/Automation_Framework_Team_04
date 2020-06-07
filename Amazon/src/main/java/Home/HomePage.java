package Home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static Home.AmazonPageWebElement.*;

public class HomePage extends WebAPI {


    @FindBy(how= How.CSS ,using=searchBoxCSS)
    public WebElement searchBox;

    @FindBy(how= How.CSS ,using=searchButtonCSS)
    public WebElement searchButton;





}
