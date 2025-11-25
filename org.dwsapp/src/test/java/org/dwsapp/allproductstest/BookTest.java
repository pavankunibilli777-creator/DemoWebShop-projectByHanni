package org.dwsapp.allproductstest;

import org.dwsapp.genericlibrary.BaseConfig;
import org.dwsapp.genericlibrary.ExcelLibrary;
import org.dwsapp.pagerepository.BookPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners(org.dwsapp.listenerlibrary.ListenerImplementation.class)

public class BookTest extends BaseConfig {

	@Test(enabled = true, priority = 1, groups = "RT")
	public void verifyHealthBook() {

		// create the Test information
		test = report.createTest("verify Healthbook");

		// steps information
		test.log(Status.INFO, "Step 1: launching the browser");
		test.log(Status.INFO, "Step 2: Navigating to the application via url Successful");
		test.log(Status.INFO, "Step 3: verified page Successful");

		waitStatement();

		bpobj = new BookPage(driver);
		elib = new ExcelLibrary();

		// Step 4: Search box displayed and Enabled
		Assert.assertEquals(wpobj.getSearchbox().isDisplayed(), true);
		Assert.assertEquals(wpobj.getSearchbox().isEnabled(), true);

		if (wpobj.getSearchbox().isDisplayed() && wpobj.getSearchbox().isEnabled()) {
			test.log(Status.PASS, "Step 4: verified the Searchbox is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 4: verified the Searchbox is not displayed and not enabled");
		}
		Reporter.log("Search box working Successfully", true);

		// Step 5: Entering the data on Search box
		enterDataOnElement(wpobj.getSearchbox(), elib.readSingleData("Sheet1", 1, 1));
		Reporter.log("Entering data Successfully", true);

		// Step 6: Search button displayed and Enabled and clicked on the Search button
		Assert.assertEquals(wpobj.getSearchbutton().isDisplayed(), true);
		Assert.assertEquals(wpobj.getSearchbutton().isEnabled(), true);
		if (wpobj.getSearchbutton().isDisplayed() && wpobj.getSearchbutton().isEnabled()) {
			test.log(Status.PASS, "Step 6: verified the Searchbutton is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 6: verified the Searchbutton is not displayed and not enabled");
		}
		clickOnElement(wpobj.getSearchbutton());
		Reporter.log("Search button clicked Successfully", true);

		// Step 7: Book name displayed and Enabled and clicked on the Book link text
		Assert.assertEquals(bpobj.getBooklinktext().isDisplayed(), true);
		Assert.assertEquals(bpobj.getBooklinktext().isEnabled(), true);
		if (bpobj.getBooklinktext().isDisplayed() && bpobj.getBooklinktext().isEnabled()) {
			test.log(Status.PASS, "Step 7: verified the Booklinktext is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 7: verified the Booklinktext is not displayed and not enabled");
		}
		clickOnElement(bpobj.getBooklinktext());
		Reporter.log("Clicked on the book Successfully", true);

		// Step8: Add to cart button is displayed and Enabled and clicked on the Cart
		Assert.assertEquals(bpobj.getAddtocart().isDisplayed(), true);
		Assert.assertEquals(bpobj.getAddtocart().isEnabled(), true);
		if (bpobj.getAddtocart().isDisplayed() && bpobj.getAddtocart().isEnabled()) {
			test.log(Status.PASS, "Step 8: verified the Addtocart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 8: verified the Addtocart is not displayed and not enabled");
		}

		clickOnElement(bpobj.getAddtocart());
		Reporter.log("book Added to cart Successfully", true);

		// Step 9: Shoppingcart button is displayed and Enabled and clicked on the Cart
		Assert.assertEquals(bpobj.getShoppingcart().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShoppingcart().isEnabled(), true);
		if (bpobj.getShoppingcart().isDisplayed() && bpobj.getShoppingcart().isEnabled()) {
			test.log(Status.PASS, "Step 9: verified the Shoppingcart is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 9: verified the Shoppingcart is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShoppingcart());
		Reporter.log("Clicked on Shoppingcart Successfully", true);

		// Step 10:countryid dropdown is displayed and enabled
		Assert.assertEquals(bpobj.getCountryId().isDisplayed(), true);
		Assert.assertEquals(bpobj.getCountryId().isEnabled(), true);
		if (bpobj.getCountryId().isDisplayed() && bpobj.getCountryId().isEnabled()) {
			test.log(Status.PASS, "Step 10: verified the countryid dropdown is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 10: verified the countryid dropdown is not displayed and not enabled");
		}
		selectOption("Canada", bpobj.getCountryId());
		Reporter.log("Clicked on Countryid dropdown  Successfully", true);

		// Step 11:State dropdown is displayed and enabled
		Assert.assertEquals(bpobj.getStateProvinceId().isDisplayed(), true);
		Assert.assertEquals(bpobj.getStateProvinceId().isEnabled(), true);
		if (bpobj.getStateProvinceId().isDisplayed() && bpobj.getStateProvinceId().isEnabled()) {
			test.log(Status.PASS, "Step 11: verified the State dropdown is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 11: verified the State dropdown is not displayed and not enabled");
		}
		selectOption("Manitoba", bpobj.getStateProvinceId());
		Reporter.log("Clicked on State dropdown  Successfully", true);

		// Step 12:Zipcode textfield is displayed and enabled and enter the code
		Assert.assertEquals(bpobj.getZippostalcode().isDisplayed(), true);
		Assert.assertEquals(bpobj.getZippostalcode().isEnabled(), true);
		if (bpobj.getZippostalcode().isDisplayed() && bpobj.getZippostalcode().isEnabled()) {
			test.log(Status.PASS, "Step 12: verified the Zipcode textfield is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 12: verified the Zipcode textfield is not displayed and not enabled");
		}

		enterDataOnElement(bpobj.getZippostalcode(), "637372");
		Reporter.log("Enter the code on Zippostal code  Successfully", true);

		// Step 13:Estimateshipping button is displayed and enabled and clicked on that
		Assert.assertEquals(bpobj.getEstimateshipping().isDisplayed(), true);
		Assert.assertEquals(bpobj.getEstimateshipping().isEnabled(), true);
		if (bpobj.getEstimateshipping().isDisplayed() && bpobj.getEstimateshipping().isEnabled()) {
			test.log(Status.PASS, "Step 13: verified the Estimateshipping button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 13: verified the Estimateshipping button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getEstimateshipping());
		Reporter.log("Estimateshipping button clicked  Successfully", true);

		// Step 14:clicked on checkbox
		clickOnElement(bpobj.getTermsofservice());
		Reporter.log("Clicked on TermsofserviceCheckbox Successfully", true);

		// Step 15: Checkout button is displayed and Enabled and clicked on the Checkout
		Assert.assertEquals(bpobj.getCheckoutbtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getCheckoutbtn().isEnabled(), true);
		if (bpobj.getCheckoutbtn().isDisplayed() && bpobj.getCheckoutbtn().isEnabled()) {
			test.log(Status.PASS, "Step 15: verified the Checkoutbtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 15: verified the Checkoutbtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getCheckoutbtn());
		Reporter.log("Clicked on Checkout button Successfully", true);

		// Step 16:Enter billing address and click on continue
		Assert.assertEquals(bpobj.getBillingcontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getBillingcontinuebtn().isEnabled(), true);
		if (bpobj.getBillingcontinuebtn().isDisplayed() && bpobj.getBillingcontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 16: verified the Billingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 16: verified the Billingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getBillingcontinuebtn());
		Reporter.log("Clicked on Billingcontinue button Successfully", true);

		waitStatement(bpobj.getShippingcontinuebtn());

		// Step 17:Enter Shipping address and click on continue
		Assert.assertEquals(bpobj.getShippingcontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShippingcontinuebtn().isEnabled(), true);
		if (bpobj.getShippingcontinuebtn().isDisplayed() && bpobj.getShippingcontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 17: verified the Shippingcontinuebtn is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 17: verified the Shippingcontinuebtn is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShippingcontinuebtn());
		Reporter.log("Clicked on Shippingcontinue button Successfully", true);

		waitStatement(bpobj.getShippingmethod());

		// Step 18:Select Shipping method and click on continue
		Assert.assertEquals(bpobj.getShippingmethod().isDisplayed(), true);
		Assert.assertEquals(bpobj.getShippingmethod().isEnabled(), true);
		if (bpobj.getShippingmethod().isDisplayed() && bpobj.getShippingmethod().isEnabled()) {
			test.log(Status.PASS, "Step 18: verified the Shippingmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 18: verified the Shippingmethod is not displayed and not enabled");
		}
		clickOnElement(bpobj.getShippingmethod());
		clickOnElement(bpobj.getshipmethodcontinuebtn());
		Reporter.log("Clicked on Shipping method continue button Successfully", true);

		waitStatement(bpobj.getPaymentmethod());

		// Step 19:Select payment method and click on continue
		Assert.assertEquals(bpobj.getPaymentmethod().isDisplayed(), true);
		Assert.assertEquals(bpobj.getPaymentmethod().isEnabled(), true);
		if (bpobj.getPaymentmethod().isDisplayed() && bpobj.getPaymentmethod().isEnabled()) {
			test.log(Status.PASS, "Step 19: verified the Paymentmethod is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 19: verified the Paymentmethod is not displayed and not enabled");
		}
		clickOnElement(bpobj.getPaymentmethod());
		clickOnElement(bpobj.getPaymentcontinuebtn());
		Reporter.log("Clicked on Payment method continue button Successfully", true);

		waitStatement(bpobj.getPaymentinfocontinuebtn());

		// Step 20:Payment information continue button is displayed and enabled and click on continue
		Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getPaymentinfocontinuebtn().isEnabled(), true);
		if (bpobj.getPaymentinfocontinuebtn().isDisplayed() && bpobj.getPaymentinfocontinuebtn().isEnabled()) {
			test.log(Status.PASS, "Step 20: verified the Paymentinfocontinue button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 20: verified the Paymentinfocontinue button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getPaymentinfocontinuebtn());
		Reporter.log("Clicked on Paymentinfocontinue button Successfully", true);

		waitStatement(bpobj.getConfirmbtn());

		// Step 21:Confirm button is dispalyed and enabled and clicked on confirm button
		Assert.assertEquals(bpobj.getConfirmbtn().isDisplayed(), true);
		Assert.assertEquals(bpobj.getConfirmbtn().isEnabled(), true);
		if (bpobj.getConfirmbtn().isDisplayed() && bpobj.getConfirmbtn().isEnabled()) {
			test.log(Status.PASS, "Step 21: verified the Confirm button is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 21: verified the Confirm button is not displayed and not enabled");
		}
		clickOnElement(bpobj.getConfirmbtn());
		Reporter.log("Clicked on Confirm button  Successfully", true);

		// Step 22:Thank you text is displayed and enabled
		Assert.assertEquals(bpobj.getThankyoutext().isDisplayed(), true);
		Assert.assertEquals(bpobj.getThankyoutext().isEnabled(), true);
		if (bpobj.getThankyoutext().isDisplayed() && bpobj.getThankyoutext().isEnabled()) {
			test.log(Status.PASS, "Step 22: verified the Thank you text is displayed and enabled");
		} else {
			test.log(Status.FAIL, "Step 22: verified the Thank you text is not displayed and not enabled");
		}
		Reporter.log("Thank you text displayed Successfully", true);

		Reporter.log("BookTest-HealthBook Verified", true);
	}
}
