package com.dockerimages;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/get")
    public String getMessage(){
        return "Krishnaraddi the king";
    }


}
