//package com.fullstack.CarRental.Model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
////@Data
////@AllArgsConstructor
////@NoArgsConstructor
//@Entity
//@Table(name = "rent")
//
//public class Rent {
//
//    @Id
//    private String Number_of_days;
////    private String customerName;
////    private String carName;
////
////    private String model;
////
//////    private LocalDate pickupDate;
//////    private LocalDate returnDate;
////
////    String pickupDate;
////    String returnDate;
//
//
//
////    public Rent(String Number_of_days){
//////            ,String carName, String customerName, String model,String pickupDate,String returnDate) {
//////        this.customerName = customerName;
////        this.Number_of_days=Number_of_days;
//////        this.carName=carName;
//////        this.model = model;
////////        this.pickupDate = pickupDate;
////////        this.returnDate = returnDate;
//////        this.pickupDate=pickupDate;
//////        this.returnDate=returnDate;
////    }
//    public Rent() {
//
//    }
//}
//


package com.fullstack.CarRental.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ren")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    private String reg_no;
    private String rental_id;
//    private String name;
    private String model;
    private String color;

//    private String price;
    private String rental_date;
    private String from_time;
    private String to_time;


    public Rent(String rental_id, String name, String model, String color, String price) {
//        this.reg_no=reg_no;
        this.rental_id=rental_id;
//        this.name=name;
        this.model = model;
        this.color = color;
//        this.price=price;
        this.rental_date = rental_date;
        this.from_time = from_time;
        this.to_time = to_time;
    }

}
