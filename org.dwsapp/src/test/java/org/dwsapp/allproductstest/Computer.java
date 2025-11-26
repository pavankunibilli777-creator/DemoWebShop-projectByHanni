package org.dwsapp.allproductstest;

import org.dwsapp.genericlibrary.BaseConfig;
import org.dwsapp.pagerepository.AccessoriesComputerspage;
import org.dwsapp.pagerepository.DeskTopComputersPage;
import org.dwsapp.pagerepository.NoteBooksComputerPage;
import org.dwsapp.pagerepository.WelcomePage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners(org.dwsapp.listenerlibrary.ListenerImplementation.class)

public class Computer extends BaseConfig {

	@Test(enabled = true, priority = 3, groups = "FT")
	public void verifyDesktop() {

		// create the Test information
		test = report.createTest("verify Desktop");

		// steps information
		test.log(Status.INFO, "Step 1: launching the browser");
		test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
		test.log(Status.INFO, "Step 3: verified page Successful");

		waitStatement();

		dcobj = new DeskTopComputersPage(driver);
		wpobj = new WelcomePage(driver);

		// Step 4: MouseHovering to the computersheader
		Assert.assertEquals(wpobj.getComputerheader().isDisplayed(), true);
		Assert.assertEquals(wpobj.getComputerheader().isEnabled(), true);
		if (wpobj.getComputerheader().isDisplayed() && wpobj.getComputerheader().isEnabled()) {
			test.log(Status.PASS, "Step 4: verified the Computerheader is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 4: verified the Computerheader is not displayed and not enabled");
		}
		mouseHoverToTheElement(wpobj.getComputerheader());
		Reporter.log("Mouse Hovered to the computers Successfully", true);

		waitStatement(wpobj.getDesktophidden());

		// Step 5:MouseHovering to the Desktop and clicked on desktop
		Assert.assertEquals(wpobj.getDesktophidden().isDisplayed(), true);
		Assert.assertEquals(wpobj.getDesktophidden().isEnabled(), true);
		if (wpobj.getDesktophidden().isDisplayed() && wpobj.getDesktophidden().isEnabled()) {
			test.log(Status.PASS, "Step 5: verified the Desktop is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 5: verified the Desktop is not displayed and not enabled");
		}
		clickOnElement_UsingActions(wpobj.getDesktophidden());
		Reporter.log("Desktop clicked Successfully", true);

		// Step 6: Computer text is displayed and enabled
		Assert.assertEquals(dcobj.getComputerlinktext().isDisplayed(), true);
		Assert.assertEquals(dcobj.getComputerlinktext().isEnabled(), true);
		if (dcobj.getComputerlinktext().isDisplayed() && dcobj.getComputerlinktext().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Computerlinktext is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Computerlinktext is not displayed and not enabled");
		}
		clickOnElement(dcobj.getComputerlinktext());
		Reporter.log("computer text clicked Successfully", true);

		// Step 7: Add to cart is displayed and enabled
		Assert.assertEquals(dcobj.getAddtocart().isDisplayed(), true);
		Assert.assertEquals(dcobj.getAddtocart().isEnabled(), true);
		if (dcobj.getAddtocart().isDisplayed() && dcobj.getAddtocart().isEnabled()) {
			test.log(Status.PASS, "Step 7: verified the Addtocart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 7: verified the Addtocart is not displayed and not enabled");
		}
		clickOnElement(dcobj.getAddtocart());
		Reporter.log("computer added to cart Successfully", true);

		Reporter.log("ComputerTest-Desktop Verified", true);
	}

	@Test(enabled = true, priority = 1, groups = "IT")
	public void verifyNoteBook() {

		// create the Test information
		test = report.createTest("verify NoteBook");

		// steps information
		test.log(Status.INFO, "Step 1: launching the browser");
		test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
		test.log(Status.INFO, "Step 3: verified page Successful");

		waitStatement();

		ncobj = new NoteBooksComputerPage(driver);
		wpobj = new WelcomePage(driver);

		// Step 4: MouseHovering to the computers
		Assert.assertEquals(wpobj.getComputerheader().isDisplayed(), true);
		Assert.assertEquals(wpobj.getComputerheader().isEnabled(), true);
		if (wpobj.getComputerheader().isDisplayed() && wpobj.getComputerheader().isEnabled()) {
			test.log(Status.PASS, "Step 4: verified the Computerheader is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 4: verified the Computerheader is not displayed and not enabled");
		}
		mouseHoverToTheElement(wpobj.getComputerheader());
		Reporter.log("Mouse Hovered to the computers Successfully");

		waitStatement(wpobj.getNotebookshidden());

		// Step 5:MouseHovering to the Notebooks and clicked on Notebooks
		Assert.assertEquals(wpobj.getNotebookshidden().isDisplayed(), true);
		Assert.assertEquals(wpobj.getNotebookshidden().isEnabled(), true);
		if (wpobj.getNotebookshidden().isDisplayed() && wpobj.getNotebookshidden().isEnabled()) {
			test.log(Status.PASS, "Step 5: verified the Notebooks is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 5: verified the Notebooks is not displayed and not enabled");
		}
		clickOnElement_UsingActions(wpobj.getNotebookshidden());
		Reporter.log("Notebooks clicked Successfully");

		// Step 6: Laptop text is displayed and enabled
		Assert.assertEquals(ncobj.getLaptoplinktext().isDisplayed(), true);
		Assert.assertEquals(ncobj.getLaptoplinktext().isEnabled(), true);
		if (ncobj.getLaptoplinktext().isDisplayed() && ncobj.getLaptoplinktext().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Laptoplinktext is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Laptoplinktext is not displayed and not enabled");
		}
		clickOnElement(ncobj.getLaptoplinktext());
		Reporter.log("Laptop text clicked Successfully", true);

		// Step 7: Add to cart is displayed and enabled
		Assert.assertEquals(ncobj.getAddtocart().isDisplayed(), true);
		Assert.assertEquals(ncobj.getAddtocart().isEnabled(), true);
		if (ncobj.getAddtocart().isDisplayed() && ncobj.getAddtocart().isEnabled()) {
			test.log(Status.PASS, "Step 7: verified the Addtocart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 7: verified the Addtocart is not displayed and not enabled");
		}
		clickOnElement(ncobj.getAddtocart());
		Reporter.log("computer added to cart Successfully", true);

		Reporter.log("ComputerTest-NoteBook Verified", true);
	}

	@Test(enabled = true, priority = 2, groups = "RT")
	public void verifyAccessories() {

		// create the Test information
		test = report.createTest("verify Desktop");

		// steps information
		test.log(Status.INFO, "Step 1: launching the browser");
		test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
		test.log(Status.INFO, "Step 3: verified page Successful");

		waitStatement();
		acobj = new AccessoriesComputerspage(driver);
		wpobj = new WelcomePage(driver);

		// Step 4: MouseHovering to the computers
		Assert.assertEquals(wpobj.getComputerheader().isDisplayed(), true);
		Assert.assertEquals(wpobj.getComputerheader().isEnabled(), true);
		if (wpobj.getComputerheader().isDisplayed() && wpobj.getComputerheader().isEnabled()) {
			test.log(Status.PASS, "Step 4: verified the Computerheader is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 4: verified the Computerheader is not displayed and not enabled");
		}
		mouseHoverToTheElement(wpobj.getComputerheader());
		Reporter.log("Mouse Hovered to the computers Successfully");

		waitStatement(wpobj.getAccessorieshidden());

		// Step 5:MouseHovering to the Notebooks and clicked on Notebooks
		Assert.assertEquals(wpobj.getAccessorieshidden().isDisplayed(), true);
		Assert.assertEquals(wpobj.getAccessorieshidden().isEnabled(), true);
		if (wpobj.getAccessorieshidden().isDisplayed() && wpobj.getAccessorieshidden().isEnabled()) {
			test.log(Status.PASS, "Step 5: verified the Accessories is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 5: verified the Accessories is not displayed and not enabled");
		}
		clickOnElement_UsingActions(wpobj.getAccessorieshidden());
		Reporter.log("Accessories clicked Successfully");

		// Step 6: Accessories text is displayed and enabled
		Assert.assertEquals(acobj.getAccessorieslink().isDisplayed(), true);
		Assert.assertEquals(acobj.getAccessorieslink().isEnabled(), true);
		if (acobj.getAccessorieslink().isDisplayed() && acobj.getAccessorieslink().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Accessories is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Accessories is not displayed and not enabled");
		}
		clickOnElement(acobj.getAccessorieslink());
		Reporter.log("Accessories text clicked Successfully", true);

		// Step 7: Add to cart is displayed and enabled
		Assert.assertEquals(acobj.getAddtocart().isDisplayed(), true);
		Assert.assertEquals(acobj.getAddtocart().isEnabled(), true);
		if (acobj.getAddtocart().isDisplayed() && acobj.getAddtocart().isEnabled()) {
			test.log(Status.PASS, "Step 7: verified the Addtocart() is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 7: verified the Addtocart() is not displayed and not enabled");
		}
		clickOnElement(acobj.getAddtocart());
		Reporter.log("computer added to cart Successfully", true);

		
		// Step 8: Shoppingcart button is displayed and Enabled and clicked on the Cart
		Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
		if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
			test.log(Status.PASS, "Step 8: verified the Shoppingcart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 8: verified the Shoppingcart is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShoppingcart());
		Reporter.log("Clicked on Shoppingcart Successfully", true);

		// Step 9:clicked on checkbox
		clickOnElement(bpobj.getTermsofservice());
		Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

		// Step 10: Checkout button is displayed and Enabled and clicked on the Checkout
		Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
		if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
			test.log(Status.PASS, "Step 10: verified the Checkoutbtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 10: verified the Checkoutbtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getCheckoutbtn());
		Reporter.log("Clicked on Checkout button Successfully", true);

		// Step 11:Enter billing address and click on continue
		Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
		if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 11: verified the Billingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 11: verified the Billingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getBillingcontinuebtn());
		Reporter.log("Clicked on Billingcontinue button Successfully", true);

		waitStatement(bpobj.getShippingcontinuebtn());

		// Step 12:Enter Shipping address and click on continue
		Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
		if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 12: verified the Shippingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 12: verified the Shippingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShippingcontinuebtn());
		Reporter.log("Clicked on Shippingcontinue button Successfully", true);

		waitStatement(bpobj.getShippingmethod());

		// Step 13:Select Shipping method and click on continue
		Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
		if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
			test.log(Status.PASS, "Step 13: verified the Shippingmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 13: verified the Shippingmethod is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShippingmethod());
		clickOnElement(bpobj.getshipmethodcontinuebtn());
		Reporter.log("Clicked on Shipping method continue button Successfully", true);

		waitStatement(bpobj.getPaymentmethod());

		// Step 14:Select payment method and click on continue
		Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
		Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
		if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
			test.log(Status.PASS, "Step 14: verified the Paymentmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 14: verified the Paymentmethod is not displayed and not enabled");
		}
		clickOnElement(bpobj.getPaymentmethod());
		clickOnElement(bpobj.getPaymentcontinuebtn());
		Reporter.log("Clicked on Payment method continue button Successfully", true);

		waitStatement(bpobj.getPaymentinfocontinuebtn());

		// Step 15:Payment information continue button is displayed and enabled and
		// click on continue
		Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
		if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 15: verified the Paymentinfocontinue button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 15: verified the Paymentinfocontinue button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getPaymentinfocontinuebtn());
		Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

		waitStatement(bpobj.getConfirmbtn());

		// Step 16:Confirm button is dispalyed and enabled and clicked on confirm button
		Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
		if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
			test.log(Status.PASS, "Step 16: verified the Confirm button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 16: verified the Confirm button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getConfirmbtn());
		Reporter.log("Clicked on Confirm button  Successfully", true);

		// Step 17:Thank you text is displayed and enabled
		Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
		Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
		if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
			test.log(Status.PASS, "Step 17: verified the Thank you text is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 17: verified the Thank you text is not displayed and not enabled");
		}
		Reporter.log("Thank you text displayed Successfully", true);

		Reporter.log("ComputerTest-Accessories Verified", true);
	}

}
