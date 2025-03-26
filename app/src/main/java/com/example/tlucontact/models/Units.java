package com.example.tlucontact.models;

public class Units {
    private int id;
    private String nameUnits;
    private String phoneNumberUnit;
    private String addressUnit;

    public Units(int id, String nameUnits, String phoneNumberUnit, String addressUnit) {
        this.id = id;
        this.nameUnits = nameUnits;
        this.phoneNumberUnit = phoneNumberUnit;
        this.addressUnit = addressUnit;
    }

    public String getAddressUnit() {
        return addressUnit;
    }

    public void setAddressUnit(String addressUnit) {
        this.addressUnit = addressUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUnits() {
        return nameUnits;
    }

    public void setNameUnits(String nameUnits) {
        this.nameUnits = nameUnits;
    }

    public String getPhoneNumberUnit() {
        return phoneNumberUnit;
    }

    public void setPhoneNumberUnit(String phoneNumberUnit) {
        this.phoneNumberUnit = phoneNumberUnit;
    }
}