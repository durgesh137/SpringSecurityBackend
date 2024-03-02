# SpringSecurityBackend

## first normal project is converted to spring boot project
1. Add spring-boot-starter-web
2. use java8 version
3. inbuilt tomcat was not included so added spring-boot-starter-tomcat

## BASIC AUTH
=> this branch includes using inbuilt default authentication of spring security
=> Spring security contains default user and default password
=> default username is user
=> password is shown on console when the project is run

How it works?
In default authentication, the default credentials are “user” with a default password that’s a universally unique identifier (UUID). 
This default password is randomly generated when the Spring context is loaded (at the app startup). 
At this time, the application writes the password to the console where you can see it

=> here two things exist in spring security that does this
1.UserDetailsService
2.PasswordEncoder

for providing custom authentication both thing need to be defined.

=>
Spring Boot also chooses an authentication method when configuring the defaults, HTTP Basic access authentication. 
It’s the most straightforward access authentication method. 
Basic authentication only requires the client to send a username and a password through the HTTP Authorization header. 
In the value of the header, the client attaches the prefix Basic, followed by the Base64 encoding of the string that contains the username and password, separated by a colon (:).

## DRAWBACK OF BASIC AUTH
HTTP Basic authentication doesn’t offer confidentiality of the credentials. Base64 is only an encoding method for the convenience of the transfer; 
it’s not an encryption or hashing method. While in transit, if intercepted, anyone can see the credentials. 
Generally, we don’t use HTTP Basic authentication without at least HTTPS for confidentiality. 
detailed definition of HTTP Basic in RFC 7617 (https://tools.ietf.org/html/rfc7617).


