package com.spot.actmvp.data.local;

import com.spot.actmvp.data.Note;
import com.spot.actmvp.data.TasksDataSource;

public class LocalDataSource implements TasksDataSource {
    SqlDb db;

    public LocalDataSource() {
        db = new SqlDb();
    }

    @Override
    public void saveNote(Note note) {
        db.saveNote(note);
    }

    @Override
    public void getNoteDb(onNoteLoadedCallback callback) {
        Note note = db.getNote();
        callback.onNoteloaded(note);
    }
}
