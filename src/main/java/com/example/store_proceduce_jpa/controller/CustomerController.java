package com.example.store_proceduce_jpa.controller;

import com.example.store_proceduce_jpa.model.Customer;
import com.example.store_proceduce_jpa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;


    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/update")
    public String save(Customer customer) {
        customerService.saveWithStoredProcedure(customer);
        return "create";
    }


}
