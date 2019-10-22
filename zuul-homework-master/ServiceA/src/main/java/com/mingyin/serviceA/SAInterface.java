package com.mingyin.serviceA;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/aa")
public interface SAInterface {
    @RequestMapping(value = "/sa/{id}", method = RequestMethod.GET)
    String aa(@PathVariable("id") Long id);
}
