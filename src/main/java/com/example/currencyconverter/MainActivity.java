package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void USDtoR (View view){

        Log.i("ACTION","USDtoR BUTTON PRESSED");
        EditText usdtrEditText=  findViewById(R.id.usdtrEditText);
        String amountInUSD= usdtrEditText.getText().toString();
        double amountINUSD= Double.parseDouble(amountInUSD);
        double amountINRupees= amountINUSD*73.33;
        String answer= String.format("%.2f",amountINRupees);
        Log.i("USD DOLLAR", usdtrEditText.getText().toString());
        Log.i("Rupees", answer);
        Toast.makeText(this, "USD TO RUPEES: "+ answer,Toast.LENGTH_SHORT).show();
    }

    public void EUROtoR (View view){

        Log.i("ACTION","EUROtoR BUTTON PRESSED");
        EditText eurotrEditText=  findViewById(R.id.eurotrEditText);
        String amountInEuro= eurotrEditText.getText().toString();
        double amountINEuro= Double.parseDouble(amountInEuro);
        double amountINRupees= amountINEuro*89.14;
        String answer= String.format("%.2f",amountINRupees);
        Log.i("EUROS", eurotrEditText.getText().toString());
        Log.i("Rupees", answer);
        Toast.makeText(this, "EURO TO RUPEES: "+ answer,Toast.LENGTH_SHORT).show();

    }

    public void DhiramToR(View view){

        Log.i("ACTION","DirhamToR BUTTON PRESSED");
        EditText dirhamtrEditText=  findViewById(R.id.dirhamtrEditText);
        String amountInDirham= dirhamtrEditText.getText().toString();
        double amountINDirham= Double.parseDouble(amountInDirham);
        double amountINRupees= amountINDirham*19.97;
        String answer= String.format("%.2f",amountINRupees);
        Log.i("USD DOLLAR", dirhamtrEditText.getText().toString());
        Log.i("Rupees", answer);
        Toast.makeText(this, "DIRHAM TO RUPEES: "+ answer,Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}