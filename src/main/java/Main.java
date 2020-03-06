import config.ApplConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.HelloService;

public class Main {
    //private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.println("Hello taco from runnable jar");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplConfiguration.class);
        HelloService hiService = context.getBean(HelloService.class);
        System.out.println(hiService.sayHello());
    }
}
