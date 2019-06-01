import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.course")
public class Application {

    public static void main(String [] args){

        SpringApplication.run(Application.class,args);
    }
}