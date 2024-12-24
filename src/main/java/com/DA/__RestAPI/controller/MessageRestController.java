package com.DA.__RestAPI.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    public MessageRestController() {
        System.out.println("Message rest controller constructor ....");
    }

    @GetMapping("/statusCode")
    public ResponseEntity<String>   getWelcomeMessage()
    {
        String msg = "Welcome to first Rest API";
        return  new ResponseEntity<>(msg, HttpStatus.CONFLICT);
        // 409 as status code .
//        return  new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
//        return  new ResponseEntity<>(msg, HttpStatus.CREATED);
    }
    // we will use Response entity when we want's to send status code with message.
//    suppose we want to show 401 as status code in this then we can mention it here.


    @GetMapping("/greed")
    public String getGreadMessage()
    {
        String msg= "Good Evening";
        return msg;
        // default status code is 200 for success message.
    }


}
