package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class B extends AppCompatActivity {

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String KEY_DATA = "keyData";
    public static final String EXTRA_DATA_B = "EXTRA_DATA_B";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        String data = sharedPreferences.getString(KEY_DATA, "No Data Found"); // "No Data Found" на случай, если данных нет

        textView.setText(data + " --> B");

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(B.this, C.class);
                intent.putExtra(EXTRA_DATA_B, "screen B");
                startActivity(intent);
            }
        });
    }
}
