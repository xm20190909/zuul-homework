package com.mingyin.serviceB;

import com.mingyin.serviceA.SAInterface;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SAController implements SAInterface {

    public String aa(@PathVariable("id")Long id) {
        System.out.println("用户"+id+"调用SA接口");
        return "{'msg': '实现SA接口'}";
    }
}
