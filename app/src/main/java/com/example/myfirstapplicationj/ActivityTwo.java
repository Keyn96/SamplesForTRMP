package com.example.myfirstapplicationj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityTwo extends Activity {
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void back(View view){
        mEditText = findViewById(R.id.editText);
        String message = mEditText.getText().toString();
        Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }

}
