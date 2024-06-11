package java_exam.Entities;



public class Etudiant {
    private int matricule;
    private String nomComplet;
    private String tuteur;


    public Etudiant(int matricule, String nomComplet, String tuteur) {
        this.matricule = matricule;
        this.nomComplet = nomComplet;
        this.tuteur = tuteur;
    }

  
    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;
    }

   
    public String toString() {
        return "Etudiant{" +
                "matricule=" + matricule +
                ", nomComplet='" + nomComplet + '\'' +
                ", tuteur='" + tuteur + '\'' +
                '}';
    }
}

