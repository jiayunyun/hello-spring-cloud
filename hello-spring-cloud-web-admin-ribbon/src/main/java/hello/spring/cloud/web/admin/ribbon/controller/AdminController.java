package hello.spring.cloud.web.admin.ribbon.controller;

import com.netflix.discovery.converters.Auto;
import hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("hi")
    public String sayHi(String massage){
      return  adminService.sayHi(massage);
    }

}
