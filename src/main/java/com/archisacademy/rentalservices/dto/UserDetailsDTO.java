package com.archisacademy.rentalservices.dto;

public class UserDetailsDTO {

    private String name;
    private String company;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserDetailsDTO(String name, String company, String location) {
        this.name = name;
        this.company = company;
        this.location = location;
    }
}
