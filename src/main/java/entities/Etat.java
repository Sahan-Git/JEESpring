package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etat {

    /**
     *
     * Création de la classe Etat pour migrer avec hibernate
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libelle;

    public Etat()
    {
        super();
    }

    public Etat(Long id, String libelle)
    {
        this.id = id;
        this.libelle = libelle;
    }

    public Long getID(){return id;}
    public String getLibelle(){return libelle;}

    public void setID(Long id){this.id = id;}
    public void setLibelle(String libelle){this.libelle = libelle;}

}