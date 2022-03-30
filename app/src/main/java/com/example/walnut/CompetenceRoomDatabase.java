package com.example.walnut;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities =  {Competence.class}, version = 1)
public abstract class CompetenceRoomDatabase extends RoomDatabase {

    public abstract CompetenceDao competenceDao();
    private static volatile CompetenceRoomDatabase INSTANCE;

    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool (NUMBER_OF_THREADS);

    static CompetenceRoomDatabase getDatabase (final Context context) {
        if (INSTANCE == null) {
            synchronized (CompetenceRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder (context.getApplicationContext(),
                            CompetenceRoomDatabase.class, "competence_database").build();
                }
            }
        }
        return INSTANCE ;
    }
}
