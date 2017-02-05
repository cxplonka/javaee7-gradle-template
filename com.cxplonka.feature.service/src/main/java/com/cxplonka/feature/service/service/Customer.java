/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cxplonka.feature.service.service;

import javax.validation.constraints.NotNull;

/**
 *
 * @author cplonka
 */
public class Customer {

    @NotNull
    String name;

    String adress;

    int age;

    public Customer() {
    }

    public Customer(String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
