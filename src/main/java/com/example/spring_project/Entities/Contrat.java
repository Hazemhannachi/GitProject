package com.example.spring_project.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal(TemporalType.DATE)
    private Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private int montantContrat;
    @ManyToOne
    private Etudiant etudiant;

    public int getIdContrat() {
        return idContrat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrat contrat = (Contrat) o;
        return idContrat == contrat.idContrat && archive == contrat.archive && montantContrat == contrat.montantContrat && Objects.equals(dateDebutContrat, contrat.dateDebutContrat) && Objects.equals(dateFinContrat, contrat.dateFinContrat) && specialite == contrat.specialite && Objects.equals(etudiant, contrat.etudiant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContrat, dateDebutContrat, dateFinContrat, specialite, archive, montantContrat, etudiant);
    }

    public void setIdContrat(int idContrat) {
        this.idContrat = idContrat;
    }
}
