package hello.spring.cloud.feign.service.hystrix;

import hello.spring.cloud.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String massage) {
        return String.format("hi your message is : %s but request is bad",massage);
    }
}
