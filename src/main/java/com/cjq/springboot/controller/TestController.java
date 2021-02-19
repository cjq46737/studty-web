/*
 * @projectName studty-web
 * @package com.cjq.springboot.controller
 * @className com.cjq.springboot.controller.TestController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.springboot.controller;

import com.cjq.studyClientStarter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月19日 10:07 上午
 * @version 3.0.0
 */
@RestController
public class TestController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String home(){
        return helloService.sayHello();
    }
}
