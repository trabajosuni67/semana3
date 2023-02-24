package com.example.semana3;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView NameTextView;
    TextView AmountTextView;
    TextView DescriptionTextView;

    Button buttonRegresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        NameTextView = findViewById(R.id.NameTextView);
        AmountTextView = findViewById(R.id.AmountTextView);
        DescriptionTextView = findViewById(R.id.DescriptionTextView);

        buttonRegresar = findViewById(R.id.buttonRegresar);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String name = extras.getString("name");
            int amount = extras.getInt("Mount");
            String description = extras.getString("description");

            NameTextView.setText(name);
            AmountTextView.setText(String.valueOf(amount));
            DescriptionTextView.setText(description);
            TextView liquido = findViewById(R.id.liquido);
            String sueldo =AmountTextView.getText().toString() ;

            double sueldo2 = Integer.parseInt(sueldo);
            double sueldo3 = 0;
            if (sueldo2 >= 2832 && sueldo2 <= 5371.44){
                sueldo3 = sueldo2 * 0.1;
            } else if (sueldo2 >= 5371.44 && sueldo2 <= 12228.60) {
                sueldo3 = sueldo2 * 0.2;
            }else if (sueldo2 >=12228.61){
                sueldo3 = sueldo2 * 0.3;
            }
            double resultado = sueldo2 - sueldo3;
            liquido.setText(String.valueOf(resultado));
        }
    }
}