package hello.spring.cloud.feign.service;

import hello.spring.cloud.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping("hi")
    public String sayHi(@RequestParam(value = "massage") String massage);

}
