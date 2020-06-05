package testHome;

import Home.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHomePage extends WebAPI {
public  static HomePage homePage;
    public static void init(){
       homePage= PageFactory.initElements(driver,HomePage.class);
//       driver.get("https://www.amazon.com/");
 }


@Test
       public void searchField(){
        init();
        homePage.searchBox.sendKeys("t shirt");
        homePage.searchButton.click();


}

}
