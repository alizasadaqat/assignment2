package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ForgotPasswordActivity extends AppCompatActivity {
    EditText etUsername;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        etUsername = findViewById(R.id.etUsername);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, ResetPasswordActivity.class);
            intent.putExtra("username", etUsername.getText().toString());
            startActivity(intent);
        });
    }
}
