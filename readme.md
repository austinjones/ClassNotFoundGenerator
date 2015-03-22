Drop servlet-api.jar into lib_build/
Run the distribute ant task, which creates dist/ClassNotFoundGenerator.war
Deploy the WAR using Tomcat's Manager interface (deploy command).
Deploy a 2nd time, and the ClassNotFoundException will appear in localhost.log