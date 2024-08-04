package com.akkitech.SCM_SpringBoot.controller;

import com.akkitech.SCM_SpringBoot.dao.UserRepository;
import com.akkitech.SCM_SpringBoot.entities.Contact;
import com.akkitech.SCM_SpringBoot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class scmController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    @ResponseBody
    public String getPage(){
        User user = new User();
        user.setName("Akshay");
        user.setEmail("akki@gmail.com");

        Contact contact = new Contact();
        contact.setName("Somya");
        contact.setPhone("9843758643");
        contact.setUser(user);

        user.getContacts().add(contact);
        userRepository.save(user);
        return "Home Page";
    }
}
