package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.HelloService;
import service.HelloServiceImpl;

@Configuration
public class ApplConfiguration {
    @Bean
    HelloService helloService(){
        return new HelloServiceImpl();
    }

}
