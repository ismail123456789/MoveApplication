--------------------------
Statment Git
--------------------------
- git status
- git add [file]
- git add . 
- git commit -m "message"
- git log
- git push origin master
 
--------------------------
Description
--------------------------
com
 +- example
     +- myproject
         +- Application.java
         |
         +- domain
         |   +- Customer.java
         |   +- CustomerRepository.java
         |
         +- service
         |   +- CustomerService.java
         |
         +- web
             +- CustomerController.java


Run
--------------------------
mvn spring-boot:run


Cod
--------------------------
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}