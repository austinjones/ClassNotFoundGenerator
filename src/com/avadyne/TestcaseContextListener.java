package com.avadyne;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * This class throws a ClassNotFoundError when contextDestroyed is called in Tomcat 8.0.12 and Tomcat 8.0.20
 * 
 * @author Austin Jones (aj@avadynehealth.com)
 */
public class TestcaseContextListener implements ServletContextListener {
	public TestcaseContextListener() {
		
	}

	@Override
	public synchronized void contextInitialized( ServletContextEvent event ) {
		
	}

	@Override
	public synchronized void contextDestroyed( ServletContextEvent event ) {
		ThisClassNotFound.explode();
	}
}
