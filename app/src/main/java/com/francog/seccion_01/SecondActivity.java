package com.francog.seccion_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView myText = null;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myText = findViewById(R.id.textViewMain);
        btn3 = findViewById(R.id.buttonNext3th);

        //Tomar datos del Intent
        Bundle miBundle = getIntent().getExtras();
        if(miBundle != null){
            String texto = miBundle.getString("idSALUDO");// idSALUDO fue creado en el Main Activity
            myText.setText(texto);
            Toast.makeText(SecondActivity.this, "Here is Second Activity!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(SecondActivity.this, "It is Empty", Toast.LENGTH_SHORT).show();
        }

        //Ir al activity 3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActivity3 = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intentActivity3);
            }
        });
    }
}
