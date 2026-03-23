package pages;

import org.openqa.selenium.By;

public class ElementsPage extends BasePageActions {
		
		 /* ================= LOCATORS ================= */

	    // Page header
    private By elementsCard = By.xpath("//div[@class='card mt-4 top-card'][1]");

	    private By elementsHeader = By.xpath("//h1[text()='Elements']");

	   //MenuList 
	    private By textBoxMenu = By.xpath("//span[text()='Text Box']");
	    private By checkBoxMenu = By.xpath("//span[text()='Check Box']");
	    private By radioButtonMenu = By.xpath("//span[text()='Radio Button']");
	    private By webTablesMenu = By.xpath("//span[text()='Web Tables']");
	    private By buttonsMenu = By.xpath("//span[text()='Buttons']");
	    private By linksMenu = By.xpath("//span[text()='Links']");
	    private By BorderLinksImages= By.xpath("//span[text()='Web Tables']");
	    private By UplaodDownlaod  = By.xpath("//span[text()='Buttons']");
	    private By DynamidProperties = By.xpath("//span[text()='Links']");

	    
	    //TextBoxMenu
	    private By FullName = By.xpath("//span[text()='Text Box']");
	    private By Email = By.xpath("//span[text()='Text Box']");
	    private By CuAddress = By.xpath("//span[text()='Text Box']");
	    private By PTAddress = By.xpath("//span[text()='Text Box']");
	    private By Submit = By.xpath("//span[text()='Text Box']");
	    
	    
	    
	 // Text Box fields
	    private By fullName = By.id("userName");
	    private By email = By.id("userEmail");
	    private By currentAddress = By.id("currentAddress");
	    private By permanentAddress = By.id("permanentAddress");
	    private By submitButton = By.xpath("//form[@id='userForm']/descendant::button[contains(text(),'Submit')]");

	    // Output
	    private By outputName = By.id("name");
	    private By outputEmail = By.id("email");
	    
	    /* ================= ACTION METHODS ================= */

	    public boolean isElementsPageDisplayed() {
	        return getText(elementsHeader).contains("Elements");
	    }
	    public void openElementsCard() {
	        click(elementsCard);
	    }
	    public void openTextBox() {
	        click(textBoxMenu);
	    }

	    public void openCheckBox() {
	        click(checkBoxMenu);
	    }

	    public void openRadioButton() {
	        click(radioButtonMenu);
	    }

	    public void fillTextBoxForm(String name, String mail,
	                                String currAddr, String permAddr) {
	        type(fullName, name);
	        type(email, mail);
	        type(currentAddress, currAddr);
	        type(permanentAddress, permAddr);
	        click(submitButton);
	    }

	    public String getOutputName() {
	        return getText(outputName);
	    }

	    public String getOutputEmail() {
	        return getText(outputEmail);
	    }
	}


	


