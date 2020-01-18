package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainInterface extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maininterface);
    }

    @Override
    public void onClick(View v) {
        Intent menuIntent = new Intent(getApplicationContext(), MainInterface.class);
        startActivity(menuIntent);
    }
}
