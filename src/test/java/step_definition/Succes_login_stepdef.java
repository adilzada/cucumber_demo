package step_definition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.Login_page;
import utilities.Config;
import utilities.ConfigReader;
import utilities.Driver;
public class Succes_login_stepdef extends Config{


    Login_page page=new Login_page();
    @Given("go to trendyol site")
    public void go_to_trendyol_site() {

        Driver.getDriver().get(ConfigReader.getProperty("trendyol"));
    }
    @Given("click the login button")
    public void click_the_login_button() {

    }
    @When("fill username and password")
    public void fill_username_and_password() {

    }
    @When("click the submit button")
    public void click_the_submit_button() {

    }

}




