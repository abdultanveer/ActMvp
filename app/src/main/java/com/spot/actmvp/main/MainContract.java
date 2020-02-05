package com.spot.actmvp.main;

import com.spot.actmvp.data.Note;

public interface MainContract {

    interface View{
        void showToast(String msg);//presenter -view to show a toast
    }
    interface  Presenter{
       void somebodyClickedButton();
       void saveNote(Note note);
    }
}
