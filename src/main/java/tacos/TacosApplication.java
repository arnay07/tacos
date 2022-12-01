package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacosApplication.class, args);

        // TODO Remove caching line thymeleaf in application.yml for production
        // thymeleaf cache the results of the template processing, which is great for performance
        // but not so great for development. If you want to see the changes you make to your
        // templates, you’ll need to disable the cache. You can do this by setting the thymeleaf
        // cache property to false in the application.yml file.
    }

}
