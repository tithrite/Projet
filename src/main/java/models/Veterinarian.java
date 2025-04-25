package models;

import java.util.ArrayList;
import java.util.List;

public class Veterinarian {
    private int id;
    private String prenom;
    private String nom;
    private String specialite;
    private String telephone;
    private String email;
    private List<Visit> visites;

    public Veterinarian() {
        this.visits = new ArrayList<>();
    }

    public Veterinarian(int id, String prenom, String nom, String specialite, String telephone, String email) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.specialite = specialite;
        this.telephone = telephone;
        this.email = email;
        this.visites = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Visit> getVisites() {
        return visites;
    }

    public void setVisites(List<Visit> visites) {
        this.visites = visites;
    }

    public void ajouterVisit(Visit visite) {
        visites.add(visite);
    }

    public void suprimerVisit(Visit visite) {
        visites.remove(visite);
    }

    @Override
    public String toString() {
        return "Dr. " + prenom + " " + nom + " (" + specialite + ")";
    }
}
