package com.example.childmonitoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    Button Button;
    TextView textView;
    FirebaseUser user;
    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();
        Button = findViewById(R.id.logout);
        textView =findViewById(R.id.user_details);
        user = auth.getCurrentUser();
        if(user== null){
            Intent intent=new Intent(getApplicationContext().Login.class);
            startActivity(intent);
            finish();
        }else{
            textView.setText(user.getEmail());
        }

    }
}