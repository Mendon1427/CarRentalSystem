package com.fullstack.CarRental.Controller;

import com.fullstack.CarRental.Model.Car;
import com.fullstack.CarRental.Model.Customer;
import com.fullstack.CarRental.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {

   @Autowired
    private CarRepo carrepo;

    @GetMapping("/car")
    public String homePage(Model model){
        model.addAttribute("cars",carrepo.findAll());
        return "car";
    }

    @GetMapping("/saveCar")
    public String saveCar(Model model){
        Car car = new Car();
        model.addAttribute("cars",car);
        return "add_car";
    }
    @PostMapping("/savecar")
    public String save(@ModelAttribute("cars") Car car){
        carrepo.save(car);
        return "redirect:/car";
    }
    @GetMapping("/deleteCar/{reg_no}")
    public String deleteCustomer(@PathVariable("reg_no") String reg_no){
        carrepo.deleteById(reg_no);
        return "redirect:/car";
    }
}
