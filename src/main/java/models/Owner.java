package models;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private int id;
    private String prenom;
    private String nom;
    private String address;
    private String ville;
    private String phone;
    private String email;
    private List<Pet> pets;

    public Owner() {
        this.pets = new ArrayList<>();
    }

    public Owner(int id, String prenom, String nom, String address, String ville, String phone, String email) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.address = address;
        this.ville = ville;
        this.phone = phone;
        this.email = email;
        this.pets = new ArrayList<>();
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
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

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
