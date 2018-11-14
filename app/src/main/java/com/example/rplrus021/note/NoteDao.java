package com.example.rplrus021.note;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface NoteDao {
    @Insert
    void insert(model_data_note model_data_note);

    @Update
    void update(model_data_note model_data_note);

    @Delete
    void delete(model_data_note model_data_note);

    @Query("SELECT * FROM note_table")
    LiveData<List<model_data_note>> get_all_data();
}
