//package com.fullstack.CarRental.Controller;
//
//import com.fullstack.CarRental.Model.Car;
//import com.fullstack.CarRental.Model.Customer;
//import com.fullstack.CarRental.Model.Rent;
//import com.fullstack.CarRental.Repository.CarRepo;
//import com.fullstack.CarRental.Repository.RentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.Optional;
//
//public class RentController {
//    @Autowired
//    private RentRepo rentRepo;
//
//    @GetMapping("/")
//    public String homePage(Model model){
//        model.addAttribute("customerlist",rentRepo.findAll());
//        return "home";
//    }
//
//    @GetMapping("/CarRent")
//    public String rent(Model model){
//        Rent rentCar = new Rent();
////        model.addAttribute(rent);
//        model.addAttribute("rentCar",rentCar);
//        return "rent";
//    }
//
//
//    @PostMapping("/saveRent")
//    public String saveRent(@ModelAttribute("rent")Rent rent) {
//        rentRepo.save(rent);
//        return "redirect:/rent";
//
//    }
//}

package com.fullstack.CarRental.Controller;

import com.fullstack.CarRental.Model.Car;
import com.fullstack.CarRental.Model.Rent;
import com.fullstack.CarRental.Repository.RentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RentController {

    @Autowired
    private RentRepo rentrepo;


    @GetMapping("/rentSuccess")
    public String successpage(Model model){
//         rent = new Rent();
//        model.addAttribute("rent",rent);
        return "rentSuccess";
    }

    @GetMapping("/returnCar")
    public String returnpage(Model model){
//         rent = new Rent();
//        model.addAttribute("rent",rent);
        return "return";
    }

    @GetMapping("/returnSuc")
    public String returnsuccess(Model model){
//         rent = new Rent();
//        model.addAttribute("rent",rent);
        return "returnSuccess";
    }

    @GetMapping("/rent/{price}")
    public String homePage(Model model){
        Rent rent = new Rent();
        model.addAttribute("rent",rent);
        return "rent";
    }
    @PostMapping("/rent")
    public String save(@ModelAttribute("rents") Rent rent){
        rentrepo.save(rent);
        return "redirect:/rent";
    }

    @GetMapping("/deleteRent/{rental_id}")
    public String deleteRent(@PathVariable("rental_id") Integer rental_id){
        rentrepo.deleteById(rental_id);
        return "redirect:/rent";
    }
}
