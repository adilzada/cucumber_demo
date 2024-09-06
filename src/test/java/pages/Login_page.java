package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login_page {
    public Login_page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
