package org.dwsapp.allproductstest;

import org.dwsapp.genericlibrary.BaseConfig;
import org.dwsapp.pagerepository.Camerapage;
import org.dwsapp.pagerepository.CellPhonesPage;
import org.dwsapp.pagerepository.WelcomePage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners(org.dwsapp.listenerlibrary.ListenerImplementation.class)

public class Electronics extends BaseConfig {

	@Test(enabled = true, priority = 2, groups = "FT")
	public void verifyCameraAndPhoto() {

		// create the Test information
		test = report.createTest("verify CameraAndPhoto");

		// steps information
		test.log(Status.INFO, "Step 1: launching the browser");
		test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
		test.log(Status.INFO, "Step 3: verified page Successful");

		waitStatement();
		cpobj = new Camerapage(driver);
		wpobj = new WelcomePage(driver);

		// Step 4: MouseHovering to the Electronics
		Assert.assertEquals(wpobj.getElectronicsheader().isDisplayed(), true);
		Assert.assertEquals(wpobj.getElectronicsheader().isEnabled(), true);
		if (wpobj.getElectronicsheader().isDisplayed() && wpobj.getElectronicsheader().isEnabled()) {
			test.log(Status.PASS, "Step 4: verified the Electronicsheader is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 4: verified the Electronicsheader is not displayed and not enabled");
		}
		mouseHoverToTheElement(wpobj.getElectronicsheader());
		Reporter.log("Mouse Hovered to the Electronics Successfully");

		waitStatement(wpobj.getCameraphotohidden());

		// Step 5: MouseHovering to the Electronics and clicked on Camera and Photo
		Assert.assertEquals(wpobj.getCameraphotohidden().isDisplayed(), true);
		Assert.assertEquals(wpobj.getCameraphotohidden().isEnabled(), true);
		if (wpobj.getCameraphotohidden().isDisplayed() && wpobj.getCameraphotohidden().isEnabled()) {
			test.log(Status.PASS, "Step 5: verified the Cameraphoto is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 5: verified the Cameraphoto is not displayed and not enabled");
		}
		clickOnElement_UsingActions(wpobj.getCameraphotohidden());
		Reporter.log("Camera clicked Successfully");

		// Step 6: Camera text is displayed and enabled
		Assert.assertEquals(cpobj.getCameralinktext().isDisplayed(), true);
		Assert.assertEquals(cpobj.getCameralinktext().isEnabled(), true);
		if (cpobj.getCameralinktext().isDisplayed() && cpobj.getCameralinktext().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Electronicsheader is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Electronicsheader is not displayed and not enabled");
		}
		clickOnElement(cpobj.getCameralinktext());
		Reporter.log("camera text clicked Successfully", true);

		// Step 7: Add to cart is displayed and enabled
		Assert.assertEquals(cpobj.getAddtocart().isDisplayed(), true);
		Assert.assertEquals(cpobj.getAddtocart().isEnabled(), true);
		if (cpobj.getAddtocart().isDisplayed() && cpobj.getAddtocart().isEnabled()) {
			test.log(Status.PASS, "Step 7: verified the Addtocart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 7: verified the Addtocart is not displayed and not enabled");
		}
		clickOnElement(cpobj.getAddtocart());
		Reporter.log("Camera added to cart Successfully", true);

		Reporter.log("ElectronicsTest-CameraAndPhoto Verified", true);
	}

	@Test(enabled = true, priority = 1, groups = "RT")
	public void verifyCellPhones() {

		// create the Test information
		test = report.createTest("verify CellPhones");

		// steps information
		test.log(Status.INFO, "Step 1: launching the browser");
		test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
		test.log(Status.INFO, "Step 3: verified page Successful");

		waitStatement();

		cppobj = new CellPhonesPage(driver);
		wpobj = new WelcomePage(driver);

		// Step 4: MouseHovering to the Electronics
		Assert.assertEquals(wpobj.getElectronicsheader().isDisplayed(), true);
		Assert.assertEquals(wpobj.getElectronicsheader().isEnabled(), true);
		if (wpobj.getElectronicsheader().isDisplayed() && wpobj.getElectronicsheader().isEnabled()) {
			test.log(Status.PASS, "Step 4: verified the Electronicsheader is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 4: verified the Electronicsheader is not displayed and not enabled");
		}
		mouseHoverToTheElement(wpobj.getElectronicsheader());
		Reporter.log("Mouse Hovered to the Electronics Successfully");

		waitStatement(wpobj.getCellphoneshidden());

		// Step 5: MouseHovering to the Electronics and clicked on cell phones
		Assert.assertEquals(wpobj.getCellphoneshidden().isDisplayed(), true);
		Assert.assertEquals(wpobj.getCellphoneshidden().isEnabled(), true);
		if (wpobj.getCellphoneshidden().isDisplayed() && wpobj.getCellphoneshidden().isEnabled()) {
			test.log(Status.PASS, "Step 5: verified the Cellphones is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 5: verified the Cellphones is not displayed and not enabled");
		}
		clickOnElement_UsingActions(wpobj.getCellphoneshidden());
		Reporter.log("Cellphone clicked Successfully");

		//Step 6: Camera text is displayed and enabled
		Assert.assertEquals(cppobj.getPhonelinktext().isDisplayed(), true);
		Assert.assertEquals(cppobj.getPhonelinktext().isEnabled(), true);
		if (cppobj.getPhonelinktext().isDisplayed() && cppobj.getPhonelinktext().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Phonelinktext is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Phonelinktext is not displayed and not enabled");
		}
		clickOnElement(cppobj.getPhonelinktext());
		Reporter.log("Phone text clicked Successfully", true);

		//Step 7: Add to cart is displayed and enabled
		Assert.assertEquals(cppobj.getAddtocart().isDisplayed(), true);
		Assert.assertEquals(cppobj.getAddtocart().isEnabled(), true);
		if (cppobj.getAddtocart().isDisplayed() && cppobj.getAddtocart().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Phonelinktext is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Phonelinktext is not displayed and not enabled");
		}
		clickOnElement(cppobj.getAddtocart());
		Reporter.log("Phone added to cart Successfully", true);

		Reporter.log("ElectronicsTest-CellPhones Verified", true);
	}
}
