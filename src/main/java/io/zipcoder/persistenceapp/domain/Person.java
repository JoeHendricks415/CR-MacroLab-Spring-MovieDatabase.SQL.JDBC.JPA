package io.zipcoder.persistenceapp.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

    private int id;
    private String firstName;
    private String surName;
    //private Date birthDate;
    private String mobileNumber;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

    public Person(int id, String firstName, String surName, String mobileNumber){
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        //this.birthDate = format.parse(birthDate);
        this.mobileNumber = mobileNumber;
    }

    public Person(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


//    public Date getBirthDate() {
//        return birthDate;
//    }

//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
