package com.example.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton mToggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToggleButton =(ToggleButton) findViewById(R.id.ToggleButton);
        mToggleButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean b){
        if (b==true){
            Toast.makeText(this,"Has encendido el boton", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Epa apagaste el boton", Toast.LENGTH_SHORT).show();
        }
    }

}