package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBox {
	WebDriver driver;
	public CheckBox(WebDriver driver) {
		this.driver=driver;
		
	}

@FindBy(how=How.XPATH,using="/html/body/div[3]/input[3]") WebElement Toggle_CheckBox;
 public void CheckingToggle() {
	 Toggle_CheckBox.click();
	 
 }
 public void validate_toggle_checkBox() {
     boolean status = Toggle_CheckBox.isSelected();
    //
            // confirming what is there in status for learning purpose otherwise no need
            System.out.println("Checking boolean status:" + status);

            // checking condition is true or not.
            if (status) {
                System.out.println("allToggleCheckBox is selected sucessfully at profession.");

            }

            else {
                System.out.println("allToggleCheckBox is not clicked at profession.");
            }

        }	
	
}
