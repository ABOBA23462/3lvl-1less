package com.geektech.a3lvl_1less;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etEt;
    Button btnBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEt = findViewById(R.id.et_et);
        btnBtn = findViewById(R.id.btn_btn);

        btnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = etEt.getText().toString().trim();
                if (txt.isEmpty()){
                    etEt.setError("напиши что нибудь");
                }else{
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("text",txt);
                    startActivity(intent);
                }
            }
        });    Log.e("lifecycle", "onClick: ");
    }
}