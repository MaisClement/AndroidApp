package com.example.walnut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NouvelleCompetence extends AppCompatActivity {


    public static final String EXTRA_REPLY = "com.example.android.competencelistsql.REPLY";
    private EditText editionCompetence;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouvelle_competence);
        editionCompetence = findViewById(R.id.edit_competence);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(editionCompetence.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String competence = editionCompetence.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, competence);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}