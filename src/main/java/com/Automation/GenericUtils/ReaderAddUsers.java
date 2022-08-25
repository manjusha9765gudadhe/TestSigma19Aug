package com.Automation.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReaderAddUsers {
	static Properties prop= new Properties();
	public static void initProperty() throws FileNotFoundException, IOException
	{
		prop.load(new FileInputStream("C:\\Users\\manjusha.gudadhe\\eclipse-workspace\\OrangeHRM_GlobalLogic\\src\\test\\resources\\Config\\configAddUsers.properties"));
	}
	public static String getProperty(String key)
	{
		return prop.getProperty(key);
	}
}
