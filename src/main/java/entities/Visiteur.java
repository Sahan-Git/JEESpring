package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visiteur {

    /**
     *
     * Création de la classe Visiteur pour migrer avec hibernate
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;
    private String login;
    private String mdp;
    private Date dateEmbauche;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return this.cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return this.mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Date getDate() {
        return this.dateEmbauche;
    }

    public void setDate(Date date) {
        this.dateEmbauche = date;
    }

    public Visiteur()
    {
        super();
    }

    public Visiteur(Long id,String nom, String prenom, String adresse, String cp, String ville, String login, String mdp, Date date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.login = login;
        this.mdp = mdp;
        this.dateEmbauche = date;
    }
}