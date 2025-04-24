package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pet {
    private int id;
    private String name;
    private String type;
    private String breed;
    private LocalDate birthDate;
    private Owner owner;
    private List<Visit> visits;

    public Pet() {
        this.visits = new ArrayList<>();
    }

    public Pet(int id, String name, String type, String breed, LocalDate birthDate, Owner owner) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.birthDate = birthDate;
        this.owner = owner;
        this.visits = new ArrayList<>();
    }

    // Getters and Setters
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
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
        return name + " (" + type + ")";
    }
}
