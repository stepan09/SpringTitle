package oliinyk.example.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    private String s1 = "<h1>&nbsp&nbsp&nbsp&nbsp   Інститут фізико-технічних та комп'ютерних наук</h1>";

    @RequestMapping("/title")
    public String title(){
        return s1;
    }
}
