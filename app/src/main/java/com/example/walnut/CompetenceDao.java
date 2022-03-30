package com.example.walnut;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CompetenceDao {
    @Insert
    void insert(Competence competence);

    @Delete
    void deleteCompetence(Competence competence);

    @Query("DELETE FROM competence_table")
    void deleteAll();

    @Query("SELECT * FROM competence_table ORDER BY nomCompetence ASC")
    LiveData<List<Competence>> getToutesCompetences();

    @Update
    void update(Competence competence);
}
