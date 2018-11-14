package com.example.rplrus021.note;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "model_note")
public class model_data_note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;

    public model_data_note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public model_data_note(){

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

}
