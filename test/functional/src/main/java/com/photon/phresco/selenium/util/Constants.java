/**
 * PHR_jquerywidget
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.photon.phresco.selenium.util;

public class Constants {

	/**
	 * Execute tests on internet explorer
	 */
	public static final String BROWSER_IE = "iexplorer";

	/**
	 * Execute tests on firefox browser
	 */
	public static final String BROWSER_FIREFOX = "firefox";
	
	/**
	 * Execute tests on googlechrome browser
	 */
	public static final String BROWSER_CHROME = "googlechrome";
	
	/**
	 * Execute tests on safari browser
	 */
	public static final String BROWSER_SAFARI = "safari";
	
	/**
	 * Execute tests on opera browser
	 */
	public static final String BROWSER_OPERA = "opera";


	/**
	 * Execute tests on headless browser
	 */
	public static final String BROWSER_HEADLESS= "htmlunit";
	
	
	/**
	 * Execute tests on Iphone Webdriver
	 * 
	 */
	 public static final String  IPHONE_WEBDRIVER = "iPhone";
	

	public static String DEFAULT_TIMEOUT = "180000";

	public static String ONE_MINUTE_TIMEOUT = "60000";

	public static String THIRTY_SECOND_TIMEOUT = "30000";
	
	public static String WINDOWS_OS  = "Windows";
	
	public static String LINUX_OS   =  "Linux";
	
	public static  String MAC_OS = "Mac";
	
	public static String DIRECTORY="/chromedriver";
	
	public static String WINDOWS_DIRECTORY=DIRECTORY+"/windows";
	
	public static String LINUX_DIRECTORY_32=DIRECTORY+"/linux-32";
	
	public static String MAC_DIRECTORY=DIRECTORY+"/mac";
	
	public static String LINUX_DIRECTORY_64=DIRECTORY+"/linux-64";
	
	public static void setDefaultTimeout(String timeout) {
		int parseInt = Integer.parseInt(timeout);
		if (parseInt > 0) {
			DEFAULT_TIMEOUT = timeout;
		}
	}
}
