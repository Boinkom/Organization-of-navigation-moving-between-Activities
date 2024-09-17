package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class C extends AppCompatActivity {
    public static final String EXTRA_DATA_C = "EXTRA_DATA_C";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);
        Intent intent = getIntent();
        String data = intent.getStringExtra(B.EXTRA_DATA_B);

        textView.setText(data + " --> C");

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra(EXTRA_DATA_C, "screen C");
                setResult(RESULT_OK, resultIntent);
                final Intent intent = new Intent(C.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
