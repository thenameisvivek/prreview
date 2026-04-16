package com.example.prreview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String userName;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String password = "admin123"; // hardcoded credential-like value
        Log.d("MainActivity", "Password is: " + password); // sensitive info in logs

        for (int i = 0; i < 5; i++) {
            counter = counter + 1; // can be simplified
        }

        if (counter == 5) {
            Log.d("MainActivity", "Counter reached 5");
        }

        printUserNameLength(); // possible NullPointerException
        divideNumbers(10, 0);  // division by zero
    }

    private void printUserNameLength() {
        Log.d("MainActivity", "Username length: " + userName.length());
    }

    private int divideNumbers(int a, int b) {
        return a / b;
    }
}
