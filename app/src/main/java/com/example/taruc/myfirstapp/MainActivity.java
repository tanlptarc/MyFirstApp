package com.example.taruc.myfirstapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declare
    private Button buttonSend, button2, button3;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
        buttonSend = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

    }

    public void sendMessage(View v){
        //get message from editText
        String message = editText.getText().toString();

        //use intent to communicate with another activity
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key",message);
        startActivity(intent);



    }
}
