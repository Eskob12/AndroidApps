package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        TextView txtName = findViewById(R.id.textName);
        EditText edtTxtName = findViewById(R.id.editName);
        txtName.setText(edtTxtName.getText().toString());

        TextView txtLastName= findViewById(R.id.textLastName);
        edtTxtName = findViewById(R.id.editLast);
        txtLastName.setText(edtTxtName.getText().toString());

        TextView txtEmail= findViewById(R.id.textEmail);
        edtTxtName = findViewById(R.id.editEmail);
        txtEmail.setText(edtTxtName.getText().toString());

    }
}