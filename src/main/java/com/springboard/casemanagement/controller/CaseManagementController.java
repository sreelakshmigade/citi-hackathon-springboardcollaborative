package com.springboard.casemanagement.controller;

import com.springboard.casemanagement.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@Slf4j
public class CaseManagementController {

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "register_form";
    }

@PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        log.info("user={}" , user);
        return "register_success";
    }
}
