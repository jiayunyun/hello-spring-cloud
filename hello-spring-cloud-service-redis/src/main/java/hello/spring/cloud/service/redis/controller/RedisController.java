package hello.spring.cloud.service.redis.controller;

import com.netflix.discovery.converters.Auto;
import hello.spring.cloud.service.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "put",method = RequestMethod.POST)
    public  String put(String key,String value,long seconds){
         redisService.put(key,value,seconds);

         return "0k";
    }

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public Object get(String key){
        Object o = redisService.get(key);
        if(o!= null){
            String json = String.valueOf(o);
            return json;
        }
        return "not_ok";
    }
}

