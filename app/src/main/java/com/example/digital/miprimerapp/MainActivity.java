package com.example.digital.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accionClickMe(View view){
        Toast.makeText(this, "Diego Click", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Te dije que no me clickees -.-", Toast.LENGTH_SHORT).show();
    }
}
