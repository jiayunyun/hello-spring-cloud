package hello.spring.cloud.service.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RedisServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisServiceApplication.class,args);
    }
}
