package com.example.hw1_3m;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnSend;
    private EditText enterMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.btn_send);
        enterMessage = findViewById(R.id.et_enterMessage);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = enterMessage.getText().toString();

                if (!message.isEmpty()) {
                    Intent sendIntent = new Intent(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT, message);


                    startActivity(Intent.createChooser(sendIntent, "Поделиться через"));

                    Toast.makeText(MainActivity.this, "Выберите приложение для отправки", Toast.LENGTH_SHORT).show();

                } else {
                    // Если текст пустой, выводим предупреждение
                    Toast.makeText(MainActivity.this, "Введите сообщение для отправки", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


