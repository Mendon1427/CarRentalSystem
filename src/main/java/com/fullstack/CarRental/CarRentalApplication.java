package com.fullstack.CarRental;

import com.fullstack.CarRental.Model.Car;
import com.fullstack.CarRental.Model.Customer;
import com.fullstack.CarRental.Model.Rent;
import com.fullstack.CarRental.Repository.CarRepo;
import com.fullstack.CarRental.Repository.CustomerRepo;
import com.fullstack.CarRental.Repository.RentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.time.LocalDate;

@SpringBootApplication
public class CarRentalApplication{

	@Autowired
	private CustomerRepo repo;

	@Autowired
	private RentRepo rentRepo;

	@Autowired
	private CarRepo carrepo;
	public static void main(String[] args) {

		SpringApplication.run(CarRentalApplication.class, args);
//		LocalDate date=LocalDate.parse("11-01-2022");
//		LocalDate date1=LocalDate.parse("11-03-2022");
//
//		System.out.println(date1.getDayOfMonth()-date.getDayOfMonth());
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Customer c1 = new Customer("Shraddha","Karnataka, Bangalore",799680365,"Female");
//		Customer c2 = new Customer("Harish","Maharashtra, Pune",968611867,"Male");
//		Customer c3 = new Customer("Shailaja","Karnataka, Mangalore",982204896,"Female");
//		Customer c4 = new Customer("Joshna","Karnataka, Mangalore",963240763,"Female");
//
//		repo.save(c1);
//		repo.save(c2);
//		repo.save(c3);
//		repo.save(c4);

//		Car car1 = new Car("Suzuki","Swift","Black",1000);
//		car1.setReg_no("AP500");
//		Car car2 = new Car("Audi","Q3","Grey",5000);
//		car2.setReg_no("TS1020");
//		Car car3 = new Car("MarutiSuzuki","Nexus","white",5700080);
//		car3.setReg_no("KA321");
//		Car car4 = new Car("Toyota","Fortuner","Green",7800000);
//		car4.setReg_no("MP3223");
//
//		carrepo.save(car1);
//		carrepo.save(car2);
//		carrepo.save(car3);
//		carrepo.save(car4);

//		Rent rentRepo = new Rent();
//		rentRepo.save()

//	Rent rent1 = new Rent("TS1020","Audi","Q3","blue","Grey","5000");
//	Rent rent2 = new Rent("KA321","MarutiSuzuki","Nexus","White","1/11/22","1000");
//	Rent rent3 = new Rent("MH129014","Toyota","Fortuner","Green","31/11/22","2000");
//	Rent rent4 = new Rent("DL789","Hyundai","i20","blue","Blue","11:45pm","1000");
//rentRepo.save(rent1);
//rentRepo.save(rent2);
//rentRepo.save(rent3);
//rentRepo.save(rent4);

//public class getRent{
//	public static void main(String[] args) {
//
//	}
//
//}



}
