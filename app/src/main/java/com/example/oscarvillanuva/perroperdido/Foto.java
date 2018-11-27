package com.example.oscarvillanuva.perroperdido;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Foto extends AppCompatActivity
{
    private Bitmap picture;
    private ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);

        imageView3 = findViewById(R.id.imageView3);

        getPicture();
        imageView3.setImageBitmap(picture);
    }

    private void getPicture()
    {
        Bundle extras = getIntent().getExtras();

        if (extras != null)
            picture = extras.getParcelable("picture");
    }
}
