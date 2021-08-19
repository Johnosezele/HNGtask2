package com.examaple.hngtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    EditText email, fullName;
    TextView emailTxt, fullNameTxt;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.imageView);
        email = findViewById(R.id.editTextemail);
        fullName = findViewById(R.id.editText3);
        emailTxt = findViewById(R.id.textView);
        fullNameTxt = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String storeEmail = email.getText().toString();
               String storeFullName = fullName.getText().toString();
               emailTxt.setText(storeEmail);
               fullNameTxt.setText(storeFullName);

            }
        });

    }

    //Simple code that prints my name in Java
    public static void main(String[] args) {
        System.out.println("John Osezele");
    }
}