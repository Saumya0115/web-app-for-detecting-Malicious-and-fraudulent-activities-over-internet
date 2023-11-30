// MainActivity.java
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText phoneNumberEditText;
    private TextView checkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        checkTextView = findViewById(R.id.checkTextView);
    }

    public void onProceedButtonClick(View view) {
        String phoneNumber = phoneNumberEditText.getText().toString().trim();

        if (!phoneNumber.isEmpty()) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("phoneNumber", phoneNumber);
            startActivity(intent);
        }
    }

    public void onPaytmButtonClick(View view) {
        // Handle Paytm button click
    }

    public void onFacebookButtonClick(View view) {
        // Handle Facebook button click
    }

    public void onTruecallerButtonClick(View view) {
        // Handle Truecaller button click
    }
}
