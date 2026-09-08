Java 17

No unit tests.

[./run.sh](run.sh):

````shell
export JAVA_HOME=/usr/lib/jvm/java-1.17.0-openjdk-amd64
./mvnw spring-boot:run
````
Registration:
![doc/registration.png](doc/registration.png)

Login form:
![doc/login_form.png](doc/login_form.png)

Login fail:
![doc/login_fail.png](doc/login_fail.png)

Show users if login OK:
![doc/users_if_logged.png](doc/users_if_logged.png)

Users/pass:

ivan@example.com
pass

ivan@ya.ru
pass

[http://127.0.0.1:8080/users](http://127.0.0.1:8080/users)

Database spring.datasource.url=jdbc:mysql://v:3306/login_system
spring.datasource.username=vasi
spring.datasource.password=pass

# Updated to Spring Boot 3 and Spring Security 8
registration-login-module using springboot, spring mvc, spring security and thymeleaf

http://www.javaguides.net/2018/10/user-registration-module-using-springboot-springmvc-springsecurity-hibernate5-thymeleaf-mysql.html

