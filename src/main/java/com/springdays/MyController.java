package com.springdays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello Spring Days!!!
 */

@Controller
public class MyController {

    @Value("${custom.message}") private String customMessage;

    @RequestMapping("/message")
    @ResponseBody
    public String getMessage() {
        return customMessage;
    }
}
