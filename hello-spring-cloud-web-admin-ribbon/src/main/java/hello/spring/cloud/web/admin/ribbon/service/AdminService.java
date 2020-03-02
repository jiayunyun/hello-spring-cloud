package hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String massage){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message="+massage,String.class);
    }

    public String hiError(String massage){
        return String.format("hi your message is : %s but request is bad",massage);
    }
}
