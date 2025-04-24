package models;

import java.time.LocalDateTime;

public class Visit {
    private int id;
    private LocalDateTime date;
    private String description;
    private Pet pet;
    private Veterinarian veterinarian;

    public Visit() {
    }

    public Visit(int id, LocalDateTime date, String description, Pet pet, Veterinarian veterinarian) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.pet = pet;
        this.veterinarian = veterinarian;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    @Override
    public String toString() {
        return "Visite du " + date.toLocalDate() + " - " + description;
    }
}