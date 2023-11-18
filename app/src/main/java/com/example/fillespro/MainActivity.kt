package com.example.fillespro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.eadi_text);
        TextView textView = findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                if (text.isEmpty()) {
                    textView.setText("текст пустой");
                } else {
                    textView.setText(text);
                }
            }
        });
    }
}