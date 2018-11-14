package com.example.rplrus021.note;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.support.v4.content.AsyncTaskLoader;
import android.os.AsyncTask;

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
        new insert_asnyctask(noteDao).execute(model_data_note);
    }

    public void delete(model_data_note model_data_note) {
        new delete_asnyctask(noteDao).execute(model_data_note);
    }

    private class insert_asnyctask extends AsyncTask<model_data_note, Void, Void> {
        private NoteDao noteDao;

        private insert_asnyctask(NoteDao noteDao){
            this.noteDao = noteDao;
        }

        @Override
        protected Void doInBackground(model_data_note... model_data_notes) {
            noteDao.insert(model_data_notes[0]);
            return null;
        }
    }
    private class delete_asnyctask extends AsyncTask<model_data_note, Void, Void> {
        private NoteDao noteDao;

        private delete_asnyctask(NoteDao noteDao){
            this.noteDao = noteDao;
        }

        @Override
        protected Void doInBackground(model_data_note... model_data_notes) {
            noteDao.delete(model_data_notes[0]);
            return null;
        }
    }
}