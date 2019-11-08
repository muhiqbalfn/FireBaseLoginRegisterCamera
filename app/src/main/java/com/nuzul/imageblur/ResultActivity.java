package com.nuzul.imageblur;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    ImageView ivResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ivResult = findViewById(R.id.ivResult);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            Bitmap img = (Bitmap)extras.get("image");
            if(ivResult != null){
                ivResult.setImageBitmap(img);
            }
        }
    }
}
