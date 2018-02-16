package com.francog.seccion_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private final String SALUDO = "Hi from Main Activity!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonPress);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miIntent = new Intent(MainActivity.this,SecondActivity.class);
                miIntent.putExtra("idSALUDO", SALUDO);
                startActivity(miIntent);

                //Toast.makeText(MainActivity.this, "Botón presionado. Toast from code!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
