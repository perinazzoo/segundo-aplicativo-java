package com.gabrielperinazzo.segundoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView title, devByText;
    EditText nameInput, lastNameInput, emailInput, courseInput;
    Button clearButton, saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView name = findViewById(R.id.nameInput);
        final TextView lastName = findViewById(R.id.lastNameInput);
        final TextView emailAddress = findViewById(R.id.emailInput);
        final TextView course = findViewById(R.id.courseInput);

        Button clear = findViewById(R.id.clearButton);
        Button save = findViewById(R.id.saveButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Nome: "+name.getText()+"\nSobrenome: "+lastName.getText()+"\nEmail: "+emailAddress.getText()+"\nCurso: "+course.getText(), Toast.LENGTH_LONG).show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                lastName.setText("");
                emailAddress.setText("");
                course.setText("");
            }
        });


    }
}
