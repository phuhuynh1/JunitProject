import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveButton {
	WebDriver driver;  
	public RemoveButton(WebDriver driver) {
		
		this.driver=driver;
		
		
		
	}
	@FindBy(how=How.XPATH,using="/html/body/div[3]/input[1]") WebElement RemoveButtom;
	@FindBy(how=How.XPATH,using="//*[@id=\"todos-content\"]/form/ul/li/input") WebElement SingleItem;

	
	public void removeButtonMethod() {
		RemoveButtom.click();
	}
	public void removeSingleItem() {
		SingleItem.click();
	}
	 public void remove_Button_method() {
	     boolean status = SingleItem.isSelected();
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
	

//ctrl+Alt+arrow down
