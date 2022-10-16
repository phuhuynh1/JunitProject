package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//create constructor from the class
//define webElements
//methods to interact with webelements
//

	public class RemoveAllList {
	WebDriver driver;
	public RemoveAllList(WebDriver driver) { //constructor
		this.driver= driver;
	}

	//@Test
	@FindBy(how=How.XPATH,using="//*[@id=\"todos-content\"]/form/ul/li[1]/input") WebElement toggle_checkbox;
	
	@FindBy(how=How.XPATH,using= "/html/body/div[3]/input[1]") WebElement REMOVE_CHECKBOX;


	public void click_on_toggle_all() {
		toggle_checkbox.click();
	}

	public void remove_button_function() {
		REMOVE_CHECKBOX.click();
	}
	
	public void validateUserShouldBeAbleToRemoveAllButtons() {
		 boolean status = toggle_checkbox.isEnabled();
			//
					// confirming what is there in status for learning purpose otherwise no need
					System.out.println("Checking boolean status:" + status);
			
					// checking condition is true or not.
					if (status) {
						System.out.println("ALL LIST ITEMS HAS BEEN REMOVED");
			
					}
			
					else {
						System.out.println("ALL LIST ITEMS CAN NOT BE REMOVED");
					}
			
				}
	}

	
	

	
	

