package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                try {
                    String s = editText.getText().toString();
              //Toast.makeText(MainActivity.this, "Hi click listener worked!", Toast.LENGTH_SHORT).show();
                    int kg = Integer.parseInt(s);
                    double pound = 2.205 * kg;
                    @SuppressLint("DefaultLocale")
                    String s1=String.format("The corresponding value is %5.2f",pound);
                    textView.setText(s1);


                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}