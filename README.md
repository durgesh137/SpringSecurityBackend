# SpringSecurityBackend

# first normal project is converted to spring boot project
1. Add spring-boot-starter-web
2. use java8 version
3. inbuilt tomcat was not included so added spring-boot-starter-tomcat

# basic-auth
=> this branch includes using inbuilt default authentication of spring security
=> Spring security contains default user and default password
=> default username is user
=> password is shown on console when the project is run

How it works?
In default authentication, the default credentials are “user” with a default password that’s a universally unique identifier (UUID). 
This default password is randomly generated when the Spring context is loaded (at the app startup). 
At this time, the application writes the password to the console where you can see it

