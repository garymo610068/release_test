package com.test;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) throws Exception
    {
    	for (int i = 0; i < 2; i++) {
    		logger.debug("This is a log4j debug message");
    		Thread.sleep(500);
    		try {
        		String[] strs = {"1","2"};
        		String str = strs[2];
        		System.out.println(str);
			} catch (Exception e) {
				logger.error("This is a error message", e);
				logger.error("123");
				logger.debug("test test");
			}
		}
    }
}
