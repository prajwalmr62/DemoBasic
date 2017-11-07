package com.vasistas.prajwal.demobasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.vasistas.prajwal.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, LoggedInActivity.class);
        EditText editText = (EditText) findViewById(R.id.usernameLogin);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
