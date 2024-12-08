package com.example.hw1_3m;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MessageActivity extends AppCompatActivity {
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        textViewMessage = findViewById(R.id.textViewMessage);

        Intent intent = getIntent();
        String message = intent.getStringExtra("MESSAGE");

        if (message != null) {
            textViewMessage.setText(message);
        } else {
            textViewMessage.setText("Сообщение отсутствует");
        }
    }
}
