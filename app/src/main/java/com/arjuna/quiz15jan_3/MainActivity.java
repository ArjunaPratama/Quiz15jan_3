package com.arjuna.quiz15jan_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etjarak, etwaktu;
    Button btnwaktu;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etjarak = (EditText) findViewById(R.id.etjarak);
        etwaktu = (EditText) findViewById(R.id.etwaktu);
        btnwaktu = (Button) findViewById(R.id.btnwaktu);
        txthasil = (TextView) findViewById(R.id.txthasil);

        btnwaktu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                String njarak = etjarak.getText().toString();
                String nwaktu = etwaktu.getText().toString();
                int ajarak = Integer.parseInt(njarak);
                int awaktu = Integer.parseInt(nwaktu);

                int hasilwaktu = (ajarak / awaktu);

                txthasil.setText("Time is :" + hasilwaktu);
            }
        });



    }
}
