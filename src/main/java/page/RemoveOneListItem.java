package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveOneListItem {
	WebDriver driver;

	public RemoveOneListItem(WebDriver driver) {
		this.driver= driver;
	}
	//define the webelements
	@FindBy(how=How.XPATH,using= "//*[@id=\"todos-content\"]/form/ul/li[2]/input") WebElement SINGLE_LIST;
	@FindBy(how=How.XPATH,using= "/html/body/div[3]/input[1]") WebElement REMOVE_BUTTON;
	
	//coresponding methods to interact with webelements
	public void remove_single_list() {
		SINGLE_LIST.click();

	}
	public void remove_button_function() {
		REMOVE_BUTTON.click();
	}
	//the validation
	public void validateSingleItemCanBeRemoved() {
		boolean status = SINGLE_LIST.isEnabled();
		
		System.out.println("Checking boolean status:" + status);
		if (status) {

			System.out.println(status+ "removed");

		}else

			System.out.println(status+ "not removed");

	}
	}


