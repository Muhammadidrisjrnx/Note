package com.example.rplrus021.note;

import android.app.Application;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class repository_note {
    private NoteDao noteDao;
    private LiveData<List<model_data_note>> listLiveData;

    public repository_note(Application application) {
        room_database database = room_database.get_database(application);
        noteDao = database.noteDao();
        listLiveData = noteDao.get_all_data();
    }

    public void insert(model_data_note model_data_note) {

    }

    public void delete(model_data_note model_data_note) {

    }

    public class insert_asnyctask extends AsyncTask<model_data_note, Void, Void> {

    }
}