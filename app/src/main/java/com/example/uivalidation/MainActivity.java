package com.example.uivalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,password,phone;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.username);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        phone=findViewById(R.id.phone);
        submit=findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
;


                String name1=name.getText().toString();
                String email1=email.getText().toString();
                String password1=password.getText().toString();
                String phone1=phone.getText().toString();


                if (name1.equals(""))
                {
                    name.setError("username must not be null..");
                    name.requestFocus();
                }
                else if (name1.length()<2)
                {
                    name.setError("username must be atleast 3 characters");
                }
                else
                {
                    name.setError(null);
                }
                if (email1.isEmpty())
                {
                    email.setError("email address must not be null");
                    email.requestFocus();
                }
                else
                {
                    email.setError(null);
                }
                if (password1.isEmpty())
                {
                    password.setError("field cant be empty");
                    password.requestFocus();
                }
                else
                {
                    password.setError(null);

                }
                if (phone1.isEmpty())
                {
                    phone.setError("field cant be empty");
                    phone.requestFocus();
                }
                else
                {
                    phone.setError(null);
                }






            }
        });







    }
}