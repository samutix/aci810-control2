package com.example.android2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RatingBar;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    
    private EditText EditName1, Editemail;
    private Button Boton;
    private RatingBar Bar;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            
            EditName1 = (EditText) findViewById(R.id.edit_message);
            Editemail = (EditText) findViewById(R.id.edit_message1);
            Boton = (Button) findViewById(R.id.button_send);
            Bar = (RatingBar) findViewById(R.id.RatingBar);
            
            Boton.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                            Intent i = new Intent(MainActivity.this, Second.class);
                            i.putExtra("nombre", EditName1.getText()+""); 
                            i.putExtra("correo", Editemail.getText()+"");
                            i.putExtra("rating", Bar.getRating());
                            startActivity(i);
                            
                       }
            });        
            
}
}
