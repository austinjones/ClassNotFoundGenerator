This is a testcase application for a bug in Tomcat that was fixed in Tomcat 8.0.13.  Bug displays as ClassNotFoundError (and sometimes NullPointerExceptions) coming from the WebappClassLoader on threads running shutdown handlers (registered in web.xml) during context shutdown.

Bug link:  https://issues.apache.org/bugzilla/show_bug.cgi?id=56938

Drop servlet-api.jar into lib_build/

Run the distribute ant task, which creates dist/ClassNotFoundGenerator.war

Deploy the WAR using Tomcat's Manager interface (deploy command).

Deploy a 2nd time, and the ClassNotFoundException will appear in localhost.log
