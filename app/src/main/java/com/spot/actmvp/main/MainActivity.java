package com.spot.actmvp.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.spot.actmvp.R;
import com.spot.actmvp.data.Note;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
    }

    public void handleClick(View view) {
        switch (view.getId()){
            case R.id.button:
                presenter.somebodyClickedButton();
                break;
            case R.id.buttonsave:
                EditText editText = findViewById(R.id.editText);
                String data = editText.getText().toString();
                presenter.saveNote(new Note(data));
                break;
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
