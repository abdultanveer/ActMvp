package com.spot.actmvp.data.local;

import android.util.Log;

import com.spot.actmvp.data.Note;

public class SqlDb {

    private static final String TAG = SqlDb.class.getSimpleName();

    Note getNote(){
        return new Note("act note");
    }

    public void saveNote(Note note) {
        Log.i(TAG, "note saved");
    }
}
