package models;

import java.util.ArrayList;
import java.util.List;

public class Veterinarian {
    private int id;
    private String firstName;
    private String lastName;
    private String speciality;
    private String phone;
    private String email;
    private List<Visit> visits;

    public Veterinarian() {
        this.visits = new ArrayList<>();
    }

    public Veterinarian(int id, String firstName, String lastName, String speciality, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.phone = phone;
        this.email = email;
        this.visits = new ArrayList<>();
    }

    // Getters and Setters
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public void removeVisit(Visit visit) {
        visits.remove(visit);
    }

    @Override
    public String toString() {
        return "Dr. " + firstName + " " + lastName + " (" + speciality + ")";
    }
}
