package com.example.konversinilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText etnama,etnim,etnilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit =findViewById(R.id.btn_submit);
        etnama=findViewById(R.id.et_nama);
        etnim=findViewById(R.id.et_nim);
        etnilai=findViewById(R.id.et_nilai);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                String sNilai=etnilai.getText().toString();
                String sNama = etnama.getText().toString();
                String sNIM = etnim.getText().toString();
                String sHuruf = null;
                double dNilai= Double.parseDouble(sNilai);

                if (dNilai> 3.66 && dNilai <=4)
                {   sHuruf="A";   }
               if (dNilai> 3.33 && dNilai <=3.66)
                { sHuruf="A-";   }
               if (dNilai> 3 && dNilai <=3.33)
                {  sHuruf="B+";   }
                if (dNilai> 2.66 && dNilai <=3)
                {  sHuruf="B";   }
                if (dNilai> 2.33 && dNilai <=2.66)
                {  sHuruf="B-";   }
                if (dNilai> 2 && dNilai <=2.33)
                { sHuruf="C+";   }
                if (dNilai> 1.66 && dNilai <=2)
                {  sHuruf="C";   }
                if (dNilai> 1.33 && dNilai <=1.66)
                { sHuruf="C-";   }
                if (dNilai> 1 && dNilai <=1.33)
                {  sHuruf="D+";   }
                if (dNilai==1)
                {  sHuruf="D";   }
                if ( dNilai > 4 || dNilai < 1)
                {  sHuruf= "--";   }

                etnama.setText("Nama : " +sNama);
                etnim.setText("NIM : "+sNIM);
                etnilai.setText(sHuruf);
                }catch (NumberFormatException nfe)
                {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}