package com.geektech.a3lvl_1less;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ivPhoto = findViewById(R.id.iv_photo);

        Bundle arg = getIntent().getExtras();

        String txt = arg.getString("text");
        if(arg != null){

            Toast.makeText(this, txt, Toast.LENGTH_SHORT).show();
        }switch (txt){
            case "WhatsApp":
                ivPhoto.setImageResource(R.drawable.whatsapp);
                break;

            case "YouTube":
                ivPhoto.setImageResource(R.drawable.youtube);
                break;

            case "Chrome":
                ivPhoto.setImageResource(R.drawable.chrome);
                break;
        }
    }
}