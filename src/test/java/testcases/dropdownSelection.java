package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ElementsPage;

public class dropdownSelection extends BaseTest {

    @Test
    public void verifyTextBoxSubmission() {

        ElementsPage elements = new ElementsPage();
        elements.openElementsCard();
        elements.openTextBox();
        elements.fillTextBoxForm(
                "Prathyusha",
                "test@mail.com",
                "Hyderabad",
                "Bangalore"
        );

        Assert.assertTrue(elements.getOutputName().contains("Prathyusha"));
    }
}