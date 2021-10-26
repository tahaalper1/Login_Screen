package com.thalpi.kaytekran;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ad1;
    private EditText soyad1;
    private EditText şehir1;
    private EditText yaş1;
    private EditText şifre1;
    private RadioButton Erkek1,Kadın1;
    private Button btnKayıt1;

    private static String adı,soyadı,şehiri,yaşı,şifresi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad1=(EditText)findViewById(R.id.ad);
        soyad1=(EditText)findViewById(R.id.soyad);
        şehir1=(EditText)findViewById(R.id.şehir);
        yaş1=(EditText)findViewById(R.id.yaş);
        şifre1 = (EditText) findViewById(R.id.şifre);
        Erkek1=(RadioButton)findViewById(R.id.Erkek);
        Kadın1=(RadioButton)findViewById(R.id.Kadın);
        btnKayıt1= (Button)findViewById(R.id.btnKayıt);

        btnKayıt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                adı=ad1.getText().toString();
                soyadı=soyad1.getText().toString();
                şehiri=şehir1.getText().toString();
                yaşı=yaş1.getText().toString();
                şifresi=şifre1.getText().toString();

                if (!TextUtils.isEmpty(adı) && !TextUtils.isEmpty(soyadı) && !TextUtils.isEmpty(şehiri) && !TextUtils.isEmpty(yaşı) && !TextUtils.isEmpty(şifresi))
                {
                    Toast.makeText(getApplicationContext(),"Kaydınız Oluşturuldu !!!",Toast.LENGTH_LONG).show();
                    System.out.println(" kayıt ");
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Boş Alan Bırakmayın !!!",Toast.LENGTH_LONG).show();
                    System.out.println(" kayıt ");
                }
            }
        });
    }


}
