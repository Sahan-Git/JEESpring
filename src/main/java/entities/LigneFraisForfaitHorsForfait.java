package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneFraisForfaitHorsForfait implements Serializable{

    /**
     *
     * Création de la classe LigneFraisForfaitHorsForfait pour migrer avec hibernate
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visiteur_id")
    private Visiteur visiteur_id;

    private int mois;
    private String libelle;
    private Date date;
    private float montant;


    public LigneFraisForfaitHorsForfait() {
        super();
    }


    public LigneFraisForfaitHorsForfait(Long id, Visiteur visiteur_id, int mois, String libelle, Date date, float montant) {
        this.id = id;
        this.visiteur_id = visiteur_id;
        this.mois = mois;
        this.libelle = libelle;
        this.date = date;
        this.montant = montant;
    }



    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Visiteur getVisiteur_id() {
        return this.visiteur_id;
    }

    public void setVisiteur_id(Visiteur visiteur_id) {
        this.visiteur_id = visiteur_id;
    }

    public int getMois() {
        return this.mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getMontant() {
        return this.montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

}