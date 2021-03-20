package com.example.fullhouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart extends AppCompatActivity {
    String subject = "FullHouse order";
    double itogo;
    EditText address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Intent cart = getIntent();
        int i = 0;
        TextView itog = findViewById(R.id.textView2);
        ImageView img1, img2, img3, img4, img5;
        TextView text11, text21, text31, text41, text51, text12, text22, text32, text42, text52;

        text11 = findViewById(R.id.t11);text12 = findViewById(R.id.t12);
        text21 = findViewById(R.id.t21);text22 = findViewById(R.id.t22);
        text31 = findViewById(R.id.t31);text32 = findViewById(R.id.t32);
        text41 = findViewById(R.id.t41);text42 = findViewById(R.id.t42);
        text51 = findViewById(R.id.t51);text52 = findViewById(R.id.t52);
        address = findViewById(R.id.editTextTextEmailAddress);
        img1 = findViewById(R.id.i1); img2 = findViewById(R.id.i2); img3 = findViewById(R.id.i3); img4 = findViewById(R.id.i4); img5 = findViewById(R.id.i5);

        HashMap <String, Double> prices = (HashMap<String, Double>) getIntent().getSerializableExtra("map");
        itogo = getIntent().getDoubleExtra("itog", 0.0);
        for (String goods : prices.keySet()) {
            Double price = prices.get(goods);
            i++;
            if (goods.equals("36 карт Стандарт"))
            {
                if (i == 1) {

                img1.setImageResource(R.drawable.cardsmall);
                text11.setText(goods);
                text12.setText(price + "$");
            }
                else if (i == 2) {
                    img2.setImageResource(R.drawable.cardsmall);
                    text21.setText(goods);
                    text22.setText(price + "$");
                }
                else if (i == 3) {
                    img3.setImageResource(R.drawable.cardsmall);
                    text31.setText(goods);
                    text32.setText(price + "$");
                }
                else if (i == 4) {
                    img4.setImageResource(R.drawable.cardsmall);
                    text41.setText(goods);
                    text42.setText(price + "$");
                }
                else if (i == 5) {
                    img5.setImageResource(R.drawable.cardsmall);
                    text51.setText(goods);
                    text52.setText(price + "$");
                }
            }
            else if (goods.equals("56 карт Стандарт"))
            {
                if (i == 1) {
                    img1.setImageResource(R.drawable.d6small);
                    text11.setText(goods);
                    text12.setText(price + "$");
                }
                else if (i == 2) {
                    img2.setImageResource(R.drawable.d6small);
                    text21.setText(goods);
                    text22.setText(price + "$");
                }
                else if (i == 3) {
                    img3.setImageResource(R.drawable.d6small);
                    text31.setText(goods);
                    text32.setText(price + "$");
                }
                else if (i == 4) {
                    img4.setImageResource(R.drawable.d6small);
                    text41.setText(goods);
                    text42.setText(price + "$");
                }
                else if (i == 5) {
                    img5.setImageResource(R.drawable.d6small);
                    text51.setText(goods);
                    text52.setText(price + "$");
                }
            }

            else if (goods.equals("36 карт Русские Владыки"))
            {
                if (i == 1) {
                    img1.setImageResource(R.drawable.t56icsmall);
                    text11.setText("36 карт\nРусские Владыки");
                    text12.setText(price + "$");
                }
                else if (i == 2) {
                    img2.setImageResource(R.drawable.t56icsmall);
                    text21.setText("36 карт\nРусские Владыки");
                    text22.setText(price + "$");
                }
                else if (i == 3) {
                    img3.setImageResource(R.drawable.t56icsmall);
                    text31.setText("36 карт\nРусские Владыки");
                    text32.setText(price + "$");
                }
                else if (i == 4) {
                    img4.setImageResource(R.drawable.t56icsmall);
                    text41.setText("36 карт\nРусские Владыки");
                    text42.setText(price + "$");
                }
                else if (i == 5) {
                    img5.setImageResource(R.drawable.t56icsmall);
                    text51.setText("36 карт\nРусские Владыки");
                    text52.setText(price + "$");
                }
            }
            else if (goods.equals("56 карт Русские Владыки"))
            {
                if (i == 1) {
                    img1.setImageResource(R.drawable.t6csmall);
                    text11.setText("56 карт\nРусские Владыки");
                    text12.setText(price + "$");
                }
                else if (i == 2) {
                    img2.setImageResource(R.drawable.t6csmall);
                    text21.setText("56 карт\nРусские Владыки");
                    text22.setText(price + "$");
                }
                else if (i == 3) {
                    img3.setImageResource(R.drawable.t6csmall);
                    text31.setText("56 карт\nРусские Владыки");
                    text32.setText(price + "$");
                }
                else if (i == 4) {
                    img4.setImageResource(R.drawable.t6csmall);
                    text41.setText("56 карт\nРусские Владыки");
                    text42.setText(price + "$");
                }
                else if (i == 5) {
                    img5.setImageResource(R.drawable.t6csmall);
                    text51.setText("56 карт\nРусские Владыки");
                    text52.setText(price + "$");
                }
            }
            else if (goods.equals("Книга История игральных карт"))
            {
                if (i == 1) {
                    img1.setImageResource(R.drawable.booksmall);
                    text11.setText("Книга История\nигральных карт");
                    text12.setText(price + "$");
                }
                else if (i == 2) {
                    img2.setImageResource(R.drawable.booksmall);
                    text21.setText("Книга История\nигральных карт");
                    text22.setText(price + "$");
                }
                else if (i == 3) {
                    img3.setImageResource(R.drawable.booksmall);
                    text31.setText("Книга История\nигральных карт");
                    text32.setText(price + "$");
                }
                else if (i == 4) {
                    img4.setImageResource(R.drawable.booksmall);
                    text41.setText("Книга История\nигральных карт");
                    text42.setText(price + "$");
                }
                else if (i == 5) {
                    img5.setImageResource(R.drawable.booksmall);
                    text51.setText("Книга История\nигральных карт");
                    text52.setText(price + "$");
                }
            }


        }
        itog.setText("Итого: " + itogo + "$");
    }

    public void sendEmail(View view) {


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { address.getText() + "" });
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, "Итого: " + itogo + "$\nОплатите в течение 24 часов на сайте https:\\Grigory_41-lox.com");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}