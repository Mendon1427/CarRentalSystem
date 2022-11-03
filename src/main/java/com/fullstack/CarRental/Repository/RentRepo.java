//package com.fullstack.CarRental.Repository;
//
//import com.fullstack.CarRental.Model.Customer;
//import com.fullstack.CarRental.Model.Rent;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RentRepo extends JpaRepository<Rent,String> {
//}


package com.fullstack.CarRental.Repository;

import com.fullstack.CarRental.Model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepo extends JpaRepository<Rent,Integer> {

}
