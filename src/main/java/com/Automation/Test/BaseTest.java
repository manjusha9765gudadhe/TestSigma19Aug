package com.Automation.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.PropertyfileReader;
import com.Automation.GenericUtils.ReaderAddUsers;

public class BaseTest {
	@BeforeMethod
	public void Precondition() throws FileNotFoundException, IOException
	{
		{
			DriverUtils.createDriver();
			PropertyfileReader.initProperty();
			ReaderAddUsers.initProperty();
			
		}
		
	}
}
