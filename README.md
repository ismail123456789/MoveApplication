--------------------------
Statment Git
--------------------------
- git status
- git add [file]
- git add . 
- git commit -m "message"
- git log
- git push origin master
 
 and
 
 cd path/to/directory
 git init .
 git add .
 git commit -a -m "commit message goes here"
 git clone git@github.com:albatrocity/gratuitator.git
 git pull origin master
 git push origin master
 
 **OR**
 git clone, git fetch, git pull, or git push to a remote repository using HTTPS 
 
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