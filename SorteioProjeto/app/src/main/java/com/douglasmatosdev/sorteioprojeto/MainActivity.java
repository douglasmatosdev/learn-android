package com.douglasmatosdev.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortNumber(View view) {
        TextView text = findViewById(R.id.result);

        int numero = new Random().nextInt(11);

        text.setText("Número: " + numero);
    }
}
