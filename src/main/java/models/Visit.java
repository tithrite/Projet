package models;

import java.time.LocalDateTime;

public class Visit {
    private int id;
    private LocalDateTime dateHeure ;
    private String motif;
    private String diagnostic;
    private String traitement;
    private Pet animale;
    private Veterinarian veterinaaire;

    public Visit() {
    }

    public Visit(int id, LocalDateTime dateHeure, String motif, String diagnostic, String traitement, Pet animal, Veterinarian veterinaire) {
        this.id = id;
        this.dateHeure = dateHeure;
        this.motif = motif;
        this.diagnostic = diagnostic;
        this.traitement = traitement;
        this.animale = animal;
        this.veterinaire = veterinaire;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return dateHeure;
    }

    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

   public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getTraitement() {
        return traitement;
    }

    public void setTraitement(String traitement) {
        this.traitement = traitement;
    }


    public Pet getAnimal() {
        return Animal;
    }

    public void setAnimal(Pet animal) {
        this.animal = animal;
    }

    public Veterinarian getVeterinaire() {
        return veterinaire;
    }

    public void setVeterinarian(Veterinarian veterinaire) {
        this.veterinarian = veterinaire;
    }

    @Override
    public String toString() {
        return "Visite du " + dateheure.toLocalDate() + " - " + motif;
    }
}
