package com.fullstack.CarRental.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String customerName;
    private String address;
    private Integer mobileNumber;
    private String Gender;




    public Customer(String customerName, String address, Integer mobileNumber, String gender) {
        this.customerName = customerName;
        this.address = address;
        this.mobileNumber = mobileNumber;

        Gender = gender;
    }
}
