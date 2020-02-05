package com.spot.actmvp.data;

public interface TasksDataSource {

    void saveNote(Note note);
    void getNoteDb(onNoteLoadedCallback callback);

    interface onNoteLoadedCallback {
        void onNoteloaded(Note note);
    }
}
