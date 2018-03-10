package com.example.stanly.paymentgateway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class shop extends AppCompatActivity {
    Button bTv,bAc,bMob,bBook;
    TextView tv,ac,mob,book;
    int tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        tv=(TextView)findViewById(R.id.tvPrice);
//        int tv1 = Integer.parseInt(tv.getText().toString());
        bTv=(Button)findViewById(R.id.tvB);
        //Toast.makeText(getApplicationContext(), tv.getText(),Toast.LENGTH_SHORT).show();
        bTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent score=new Intent(shop.this,MainActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("price1", tv.getText().toString());
                score.putExtras(bundle);
                startActivity(score);
                finish();
            }
        });

        ac=(TextView)findViewById(R.id.acPrice);
//        int tv1 = Integer.parseInt(tv.getText().toString());
        bAc=(Button)findViewById(R.id.acB);
        //Toast.makeText(getApplicationContext(), tv.getText(),Toast.LENGTH_SHORT).show();
        bAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent score=new Intent(shop.this,MainActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("price1", ac.getText().toString());
                score.putExtras(bundle);
                startActivity(score);
                finish();
            }
        });

        mob=(TextView)findViewById(R.id.mobilePrice);
//        int tv1 = Integer.parseInt(tv.getText().toString());
        bMob=(Button)findViewById(R.id.mobileB);
        //Toast.makeText(getApplicationContext(), tv.getText(),Toast.LENGTH_SHORT).show();
        bMob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent score=new Intent(shop.this,MainActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("price1", mob.getText().toString());
                score.putExtras(bundle);
                startActivity(score);
                finish();
            }
        });

        book=(TextView)findViewById(R.id.bookPrice);
        //int tv1 = Integer.parseInt(book.getText().toString());
        bBook=(Button)findViewById(R.id.bookB);
        //Toast.makeText(getApplicationContext(), tv.getText(),Toast.LENGTH_SHORT).show();
        bBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent score=new Intent(shop.this,MainActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("price1", book.getText().toString());
                score.putExtras(bundle);
                startActivity(score);
                finish();
            }
        });

    }

}
