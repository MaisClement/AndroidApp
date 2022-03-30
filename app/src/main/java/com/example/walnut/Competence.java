package com.example.walnut;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "competence_table")
public class Competence{
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "nomCompetence")
    private String nomCompetence;

    @NonNull
    @ColumnInfo(name= "ordreAffichage")
    public int ordreAffiche;

    public void setNomCompetence(@NonNull String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }

    public void setOrdreAffiche(int ordreAffiche) {
        this.ordreAffiche = ordreAffiche;
    }

    public Competence(String nomCompetence, int ordre) {this.nomCompetence = nomCompetence;, this.ordreAffiche = ordre;}

    public String getNomCompetence() {return nomCompetence;}



}
