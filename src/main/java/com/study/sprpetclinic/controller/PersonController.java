package com.study.sprpetclinic.controller;

import com.study.sprpetclinic.model.Person;
import com.study.sprpetclinic.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonServiceImpl personService;

    @RequestMapping("/person")
    public String getPersion(Model model) {
        List<Person> listPerson = personService.listAll();
        model.addAttribute("listPerson",listPerson);
        return "person/index";
    }
    @RequestMapping("/new")
    public String newPerson (Model model) {
        Person person = new Person();
        model.addAttribute("person", person);

        return "person/createPerson";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePreson(@ModelAttribute("person") Person person) {

        personService.save(person);

        return "redirect:/person";
    }
    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") int id) {
        personService.delete(id);
        return "redirect:/person";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView editProduct(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("person/editPerson");
        Person person = personService.get(id);
        mav.addObject("person", person);
        return mav;
    }

}
