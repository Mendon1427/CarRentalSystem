package com.fullstack.CarRental.Controller;

import com.fullstack.CarRental.Model.Customer;
import com.fullstack.CarRental.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;


@Controller
public class CustomerController {

    @Autowired
    private CustomerRepo repo;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("customerlist",repo.findAll());
        return "home";
    }

    @GetMapping("/main")
    public String mainPage(Model model){
        model.addAttribute("customerlist",repo.findAll());
        return "index";
    }

    @GetMapping("/saveCustomer")
    public String saveCustomer(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer",customer);
        return "add_customer";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("customer") Customer customer){
        repo.save(customer);
        return "redirect:/";
    }


    @GetMapping("updateCustomer/{customerId}")
    public String updateCustomer(@PathVariable("customerId") Integer customerId,Model model){
        Optional<Customer> temp = repo.findById(customerId);
        Customer customer = temp.get();
        model.addAttribute("customer",customer);
        return "update_customer";
    }

    @GetMapping("/deleteCustomer/{customerId}")
    public String deleteCustomer(@PathVariable("customerId") Integer customerId){
        repo.deleteById(customerId);
        return "redirect:/";
    }

}
