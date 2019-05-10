package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(name="uid")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	public void enterDetails(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
}
