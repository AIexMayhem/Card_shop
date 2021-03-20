package com.example.fullhouse;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView itogo;
    TextView count;
    double itogToCart;
    ImageView pic;
    Spinner spin;
    HashMap prices;
    HashMap pricemap;
    ArrayList sp;
    ArrayAdapter spinneradapter;
    int counter = 1;
    String goods;
    double price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        prices = new HashMap();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.Counter);
        pic = findViewById(R.id.imageView);
        itogo = findViewById(R.id.textView);
        spin = findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        sp = new ArrayList();
        sp.add("36 карт Стандарт");
        sp.add("36 карт Русские Владыки");
        sp.add("56 карт Стандарт");
        sp.add("56 карт Русские Владыки");
        sp.add("Книга История игральных карт");

        pricemap = new HashMap();
        pricemap.put("36 карт Стандарт", 2.5);
        pricemap.put("36 карт Русские Владыки", 3.0);
        pricemap.put("56 карт Стандарт", 4.5);
        pricemap.put("56 карт Русские Владыки", 5.0);
        pricemap.put("Книга История игральных карт", 16.0);

        spinneradapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sp);
        spinneradapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(spinneradapter);
    }

    public void countAlf()
    {
        count.setText(Integer.toString(counter));
        itogo.setText("Цена: " + counter * price + "$");
    }
    public void Plus(View view)
    {
        counter++;
        countAlf();
    }
    public void Minus(View view) {
        if (counter > 1) {
            counter--;
            countAlf();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        goods = spin.getSelectedItem().toString();
        price = (double) pricemap.get(goods);
        counter = 1;
        if (goods == "36 карт Стандарт")
        {

            pic.setImageResource(R.drawable.card);
        }
        else if (goods == "56 карт Стандарт")
        {
            pic.setImageResource(R.drawable.d6);
        }

        else if (goods == "36 карт Русские Владыки")
        {
            pic.setImageResource(R.drawable.t56ic);
        }
        else if (goods == "56 карт Русские Владыки")
        {
            pic.setImageResource(R.drawable.t6c);
        }
        else if (goods == "Книга История игральных карт")
        {
            pic.setImageResource(R.drawable.book);
        }
        countAlf();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }


    public void addToCart(View view) {
        prices.put(goods, counter * price);
    }

    public void openCart(View view) {
        itogToCart = 0.0;
        for (Object entry : prices.keySet()) {
            double value = (double) prices.get(entry);
            itogToCart += value;
        }
        Intent cart = new Intent(MainActivity.this, Cart.class);
        cart.putExtra("map", prices);
        cart.putExtra("itog", itogToCart);
        startActivity(cart);
    }

    public void clearCart(View view) {
        prices.clear();
    }
}