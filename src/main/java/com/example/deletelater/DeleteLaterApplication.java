package com.example.deletelater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DeleteLaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeleteLaterApplication.class, args);
    }
    @GetMapping
    public String method(){
        return "index";
    }
    @GetMapping("/congrats.html")
    public String method2(){
        return "congrats";
    }
    @GetMapping("/chatGpt.html")
    public String method3(){
        return "chatGpt";
    }

    @GetMapping("/confirmation.html")
    public String method4(){
        return "confirmation";
    }

    @GetMapping("/final.html")
    public String method5(){
        return "final";
    }
    @GetMapping("/reminder.html")
    public String method6(){
        return "reminder";
    }


}
