package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText name;
private EditText height;
private EditText wieght;
private Spinner spin;
    private Switch male;
    private Button toAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        height=findViewById(R.id.height);
        wieght=findViewById(R.id.wieght);
        spin=findViewById(R.id.spinner1);
        male=findViewById(R.id.switchon);



    }

    public void btnclick(View view) {
        String name_c=name.getText().toString();
        String height_c=height.getText().toString();
        String wieght_c=wieght.getText().toString();
        String sp=spin.getSelectedItem().toString().trim();
if (male.isChecked()&&!name_c.isEmpty()&&!height_c.isEmpty()&&!wieght_c.isEmpty()){
    Toast.makeText(this,"hello "+name_c+" "+"hight is "+height_c+"wieght is "+wieght_c+" "+sp,Toast.LENGTH_LONG).show();
}
else
    Toast.makeText(this,"Cheack your data",Toast.LENGTH_LONG).show();

    }
}