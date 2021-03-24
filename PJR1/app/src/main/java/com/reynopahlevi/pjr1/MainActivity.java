package com.reynopahlevi.pjr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txtTampil
    EditText edtNpm, edtNama, edtJeniskelamin, edtNotelp;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmDanNama);

        edtNpm  = (EditText) findViewById(R.id.edtNpm);
        edtNama  = (EditText) findViewById(R.id.edtNama);
        edtJeniskelamin  = (EditText) findViewById(R.id.edtJeniskelamin);
        edtNotelp  = (EditText) findViewById(R.id.edtNotelp);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strJeniskelamin = edtJeniskelamin.getText().toString();
                String strNotelp = edtNotelp.getText().toString();

                txtTampil.setText(strNpm +"\n" + strNama +"\n" + strJeniskelamin +"\n" + strNotelp);
            }
        })
    }
}