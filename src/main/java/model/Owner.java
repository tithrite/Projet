package com.example.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Owner {
    private final StringProperty name;
    private final StringProperty address;
    private final StringProperty city;
    private final StringProperty telephone;
    private final StringProperty pets;

    public Owner(String name, String address, String city, String telephone, String pets) {
        this.name = new SimpleStringProperty(name);
        this.address = new SimpleStringProperty(address);
        this.city = new SimpleStringProperty(city);
        this.telephone = new SimpleStringProperty(telephone);
        this.pets = new SimpleStringProperty(pets);
    }

    // Getters et setters
    public String getName() { return name.get(); }
    public StringProperty nameProperty() { return name; }
    public void setName(String name) { this.name.set(name); }

    public String getAddress() { return address.get(); }
    public StringProperty addressProperty() { return address; }
    public void setAddress(String address) { this.address.set(address); }

    public String getCity() { return city.get(); }
    public StringProperty cityProperty() { return city; }
    public void setCity(String city) { this.city.set(city); }

    public String getTelephone() { return telephone.get(); }
    public StringProperty telephoneProperty() { return telephone; }
    public void setTelephone(String telephone) { this.telephone.set(telephone); }

    public String getPets() { return pets.get(); }
    public StringProperty petsProperty() { return pets; }
    public void setPets(String pets) { this.pets.set(pets); }
}