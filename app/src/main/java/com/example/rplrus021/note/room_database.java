package com.example.rplrus021.note;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;


@Database(entities = {model_data_note.class}, version = 1)
public abstract class room_database extends RoomDatabase {

    public abstract NoteDao noteDao();

    private static room_database instante;

    public static synchronized room_database get_database(Context context) {
        if (instante == null) {
            instante = Room.databaseBuilder(context.getApplicationContext(),
                    room_database.class, "note_database")
                    .build();
        }
        return instante;
    }
}
