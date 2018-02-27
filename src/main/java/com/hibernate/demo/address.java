package com.hibernate.demo;

import javax.persistence.Embeddable;

@Embeddable
public class address {

   int streetNumber;
    String location;
    String State;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}


