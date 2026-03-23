package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePageActions {

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.id("login");

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(loginBtn);
    }
}
