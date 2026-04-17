package com.example.prreview;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String userName;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String password = "admin123";
        Log.d(TAG, "Password is: " + password);

        int result = 10 / 0;

        if (userName.equals("admin")) {
            Log.d(TAG, "Admin logged in");
        }

        for (int i = 0; i < 5; i++) {
            counter = counter + 1;
        }
    }
}
