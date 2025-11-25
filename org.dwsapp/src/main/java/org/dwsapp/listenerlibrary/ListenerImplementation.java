package org.dwsapp.listenerlibrary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.dwsapp.genericlibrary.BaseConfig;

public class ListenerImplementation implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		String Methodname=result.getName();

        // Give Current Time Stamp
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String customtime = sdf.format(new Date());

		// Perform Typescating
		TakesScreenshot ts = (TakesScreenshot) BaseConfig.stdriver;

		// Capture the ScreenShot and Store it in Temp path
		File temppath = ts.getScreenshotAs(OutputType.FILE);

		// Create Permanent Path to Take ScreenShot
		File permanentpath = new File("./src/test/resources/TestScreenshot"+Methodname+customtime+ ".png");

		// Copy the Screenshot from Temp path to Permanent path
		try {
			FileHandler.copy(temppath, permanentpath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Screenshot taken succesful");

	}

}
