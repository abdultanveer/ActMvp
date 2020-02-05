package com.spot.actmvp.main;

import com.spot.actmvp.data.Note;
import com.spot.actmvp.data.Respository;
import com.spot.actmvp.data.TasksDataSource;

public class MainPresenter implements MainContract.Presenter, TasksDataSource.onNoteLoadedCallback {
    MainContract.View view;
    Respository respository;

    public MainPresenter(MainActivity mainActivity) {
        view = mainActivity;
        respository = new Respository();
    }

    @Override
    public void somebodyClickedButton() {
        respository.getNoteDb(this);

    }

    @Override
    public void saveNote(Note note) {
        respository.saveNote(note);

    }

    @Override
    public void onNoteloaded(Note note) {
        view.showToast(note.title);

    }
}
