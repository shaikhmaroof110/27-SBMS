package com.DA.__RestAPI.controller;

import com.DA.__RestAPI.dao.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    @GetMapping("/customer")
    public Customer getCustomer(){
        Customer c= new Customer();
        c.setName("John");
        c.setGender("Male");
        c.setEmail("ssame@ghdsgf.com");
        return c;

//        return type is object but we can't send object as a response to client application.
//        It will create interoperatibility problem, client application may not be java so, client application not
//        able to understand it.
//        we will get the output here in a Json format. It will be taken care by spring boot.
//        That's the beuty of Spring BOOT. we don't need to write the logic of jackson API logic to convert java object to json.

    }

}

 //    Output :
//        {
//        "name": "John",
//        "email": "ssame@ghdsgf.com",
//        "gender": "Male"
//        }