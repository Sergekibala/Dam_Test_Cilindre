package org.example;

/
public class Dam_Test_Cilindre1 {

    private double hauteur=0.0d;
    private double diametre=0.0d;

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getDiametre() {
        return diametre;
    }

    public void setDiametre(double diametre) {
        this.diametre = diametre;
    }

    public Dam_Test_Cilindre1(double hauteur, double diametre, String matiere) {
        this.hauteur = hauteur;
        this.diametre = diametre;
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
        // déclaration de setter et getter

    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
        // déclaration de setter et getter
    }

    private String matiere;

    public double getVolume (double hauteur, double diametre){
        return hauteur*diametre*diametre*Math.PI/4;

    }
    public double getVolume (){
        return this.hauteur*this.diametre*this.diametre*Math.PI/4;

    }

}
