package com.example.android2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class Second extends Activity {
	 private TextView textName, textemail;
     private RatingBar resultRatingBar;
     String nombre,correo;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_second);
             
             
             textName = (TextView) findViewById(R.id.textName);
             textemail = (TextView) findViewById(R.id.textEmail);
             resultRatingBar = (RatingBar) findViewById(R.id.resultRatingBar);
             
             nombre = getIntent().getStringExtra("nombre");
             correo = getIntent().getStringExtra("correo");
             Float rating = getIntent().getFloatExtra("rating", 0);

             textName.setText(nombre);
             textemail.setText(correo);
             resultRatingBar.setRating(rating);
             
             
             
             
             
             
             
             
             
     }
}
