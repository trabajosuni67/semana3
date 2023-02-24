package com.example.semana3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText NameEditText;
    EditText AmountEditText;
    EditText DescriptionEditText;

    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NameEditText = findViewById(R.id.nameEditText);
                DescriptionEditText = findViewById(R.id.descriptionEditText);
                AmountEditText = findViewById(R.id.amountEditText);




                String name = NameEditText.getText().toString();
                String description = DescriptionEditText.getText().toString();
                int amount = Integer.parseInt(AmountEditText.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("Mount", amount);
                intent.putExtra("description", description);
                startActivity(intent);
                finish();
            }
        });
    }
}
