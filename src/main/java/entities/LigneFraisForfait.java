package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneFraisForfait implements Serializable{

    /**
     *
     * Création de la classe LigneFraisForfait pour migrer avec hibernate
     *
     */

    @Id
    @ManyToOne
    @JoinColumn(name = "visiteur_id")
    private Visiteur visiteur_id;

    @Id
    private int mois;

    @Id
    @JoinColumn(name = "FraisForfait_id")
    @ManyToOne
    private FraisForfait fraisForfait_id;

    private int quantite;

    public LigneFraisForfait()
    {
        super();
    }

    public LigneFraisForfait(Visiteur visiteur_id, int mois, FraisForfait fraisForfait_id, int quantite) {
        this.visiteur_id = visiteur_id;
        this.mois = mois;
        this.fraisForfait_id = fraisForfait_id;
        this.quantite = quantite;
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

    public FraisForfait getFraisForfait_id() {
        return this.fraisForfait_id;
    }

    public void setFraisForfait_id(FraisForfait frais_Forfait_id) {
        this.fraisForfait_id = frais_Forfait_id;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}
