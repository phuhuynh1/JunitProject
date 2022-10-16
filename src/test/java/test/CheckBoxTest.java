package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckBox;
import util.BrowserFactory;

public class CheckBoxTest {

	WebDriver driver;
@Test
	public void UserShouldBeAbleCheckBox() {
		driver = BrowserFactory.browserInit(); //

		CheckBox checkBox = PageFactory.initElements(driver, CheckBox.class);
//	CheckBox checkBox = new CheckBox
		checkBox.CheckingToggle();
		checkBox.validate_toggle_checkBox();

	}

}
