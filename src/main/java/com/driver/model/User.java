package com.driver.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String phoneNumber;
    private String Password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Reservation> reservationsList = new ArrayList<>();

    public User() {
    }

    public User(String name, String phoneNumber, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

//    public List<Reservation> getReservationsList() {
//        return reservationsList;
//    }
//
//    public void setReservationsList(List<Reservation> reservations) {
//        this.reservationsList = reservationsList;
//    }


    public List<Reservation> getReservationsList() {
        return reservationsList;
    }

    public void setReservationsList(List<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }
}
