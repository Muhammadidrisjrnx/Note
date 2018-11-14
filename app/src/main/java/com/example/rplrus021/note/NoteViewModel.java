package com.example.rplrus021.note;

import android.app.Application;
import android.app.ListActivity;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;

public class NoteViewModel extends AndroidViewModel {
    private repository_note repository_note;
    private LiveData<List<model_data_note>> listLiveData;

    public NoteViewModel(@NonNull Application application) {
        super(application);

    }
}
