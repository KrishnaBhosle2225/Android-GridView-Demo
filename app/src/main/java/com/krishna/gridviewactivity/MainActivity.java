package com.krishna.gridviewactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    List<Modeldesign> dresslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= findViewById(R.id.grid);

        dresslist= new ArrayList<>();
        Modeldesign model = new Modeldesign();
        model.setImage(R.drawable.m1);
        model.setName("Mi Note 9 Pro");
        model.setHeight("(Gold 4 GB)");
        model.setPrice("Rs 14,999");
        model.setOff("10% off");
        model.setBuyat("Buy 2 Save extra 10%");
        dresslist.add(model);

        Modeldesign model1 = new Modeldesign();
        model1.setImage(R.drawable.m2);
        model1.setName("Mi Note 8 Pro");
        model1.setHeight("(White 4 GB)");
        model1.setPrice("Rs 19,999");
        model1.setOff("25% off");
        model1.setBuyat("Buy 2 Save extra 15%");
        dresslist.add(model1);

        Modeldesign model2 = new Modeldesign();
        model2.setImage(R.drawable.m3);
        model2.setName("Mi Note 7 Pro");
        model2.setHeight("(Black 6 GB)");
        model2.setPrice("Rs 99,999");
        model2.setOff("30% off");
        model2.setBuyat("Buy 2 Save extra 15%");
        dresslist.add(model2);

        Modeldesign model3 = new Modeldesign();
        model3.setImage(R.drawable.m5);
        model3.setName("Mi Note 5 Pro");
        model3.setHeight("(Grey 6 GB)");
        model3.setPrice("Rs 14,999");
        model3.setOff("20% off");
        model3.setBuyat("Buy 2 Save extra 15%");
        dresslist.add(model3);

        Modeldesign model4 = new Modeldesign();
        model4.setImage(R.drawable.m6);
        model4.setName("Mi Note 4Pro");
        model4.setHeight("(Gold 6 GB)");
        model4.setPrice("Rs 4,999");
        model4.setOff("10% off");
        model4.setBuyat("Buy 2 Save extra 10%");
        dresslist.add(model4);

        Modeldesign model5 = new Modeldesign();
        model5.setImage(R.drawable.m7);
        model5.setName("Mi Note 8");
        model5.setHeight("(Blue 4 GB)");
        model5.setPrice("Rs 9,999");
        model5.setOff("25% off");
        model5.setBuyat("Buy 2 Save extra 15%");
        dresslist.add(model5);

        Modeldesign model6 = new Modeldesign();
        model6.setImage(R.drawable.m8);
        model6.setName("Mi Note 7 ");
        model6.setHeight("(Black 8 GB)");
        model6.setPrice("Rs 11,999");
        model6.setOff("30% off");
        model6.setBuyat("Buy 2 Save extra 15%");
        dresslist.add(model6);

        Modeldesign model7 = new Modeldesign();
        model7.setImage(R.drawable.m9);
        model7.setName("Mi Note 5 Pro");
        model7.setHeight("(Black 6 GB)");
        model7.setPrice("Rs 14,999");
        model7.setOff("20% off");
        model7.setBuyat("Buy 2 Save extra 15%");
        dresslist.add(model7);

        Adapterdesign adapter = new Adapterdesign(MainActivity.this, dresslist);
        gridView.setAdapter(adapter);
    }



}
