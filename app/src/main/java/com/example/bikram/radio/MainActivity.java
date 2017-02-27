package com.example.bikram.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bn;
    RadioGroup radiogroup;
    RadioButton radioButton1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup=(RadioGroup)findViewById(R.id.radiobuttons);


    }
    public void click(View v)
    {
        int id=radiogroup.getCheckedRadioButtonId();
        radioButton1=(RadioButton)findViewById(id);
        if(radioButton1.getText().equals("Beginner"))
        {
            Toast.makeText(this, "Beginer", Toast.LENGTH_SHORT).show();
        }
        if(radioButton1.getText().equals("Bodybuilder"))
        {
            Toast.makeText(this, "boddybulder", Toast.LENGTH_SHORT).show();
        }
    }
}
