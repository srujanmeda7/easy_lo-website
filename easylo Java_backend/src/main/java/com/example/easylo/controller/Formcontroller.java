package com.example.easylo.controller;

import com.example.easylo.modal.Admin;
import com.example.easylo.modal.Applications;
import com.example.easylo.service.Formservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class Formcontroller {
    @Autowired
    private Formservice formservice;

    @GetMapping("/")
    public String hi(){
        return "hi";
    }

    @PostMapping("/submit")
    public void submit(@RequestBody Applications application){
         formservice.submit(application);
         System.out.println(application.getAmount());
    }

    @PostMapping("/register")
    public void submit(@RequestBody Admin admin){
        formservice.add(admin);
    }
@GetMapping("/view")
    public List<Applications> view(){
        return formservice.view();
}
}
