/*
 * @projectName studty-web
 * @package com.cjq.springboot.controller
 * @className com.cjq.springboot.controller.TestController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.springboot.controller;

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

    @RequestMapping("/")
    public String home(){
        return "hello world";
    }
}
