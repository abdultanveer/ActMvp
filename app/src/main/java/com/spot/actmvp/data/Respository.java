package com.spot.actmvp.data;

import com.spot.actmvp.data.local.LocalDataSource;

public class Respository implements TasksDataSource {
    LocalDataSource localDataSource;

    public Respository() {
        localDataSource = new LocalDataSource();
    }

    @Override
    public void saveNote(Note note) {
        localDataSource.saveNote(note);
    }

    @Override
    public void getNoteDb(onNoteLoadedCallback callback) {
        localDataSource.getNoteDb(callback);

    }
}
