package com.peaksoft.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.peaksoft.dao.PersonDAO;
@Controller
@RequestMapping("/people")
public class PeopleController {
    private final PersonDAO personDAO;

//    @Autowired//you don't need it bcs of @Controller, but you can write Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String index(Model model) {
        //We will get all people from DAO and give for showing in view
        model.addAttribute("people", personDAO.index());
        return "people/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        //We will get one person by id from DAO and five it for showing in view
        model.addAttribute("person",personDAO.show(id));
        return "people/show";
    }

}
