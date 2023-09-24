package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.DetailedDailyAdapter;
import com.example.myapplication.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type=getIntent().getStringExtra("type");

        recyclerView=findViewById(R.id.detailed_rec);
        imageView=findViewById(R.id.cart_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();

        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type!=null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"Oat Breakfast","Healthy","4.1","18","10am to 1pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"House favourite burger","Glutton as hell","4.5","40","10am to 1pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"Noodles","Healthy carb","4.8","40","10am to 1pm"));
            dailyAdapter.notifyDataSetChanged();
        }
        if(type!=null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch1,"Rice and beans","Stomach filler","4.4","39","2pm to 5pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch2,"Complete south indian","El Spicy","4.0","39","2pm to 5pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.lunch3,"Salmon dish","Classique","4.0","45","2pm to 5pm"));
            dailyAdapter.notifyDataSetChanged();
        }
        if(type!=null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner1,"Chicken dish","Simple","4.4","70","7pm to 10pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner2,"Rice pudding","Low fat","4.1","50","7pm to 10pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner3,"Ham and potato","Filler","4.0","70","7pm to 10pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.dinner4,"Tomato soup and bread","Light on spices","3.9","40","7pm to 10pm"));
            dailyAdapter.notifyDataSetChanged();
        }
        if(type!=null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Doughnut","Fresh and homemade","4.4","40","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Candy ice cream","Freshly brewed","4.8","10","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Brownie","Freshly baked","3.5","20","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }
        if(type!=null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.coffee);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee_cappuccino,"Cappuccino","Classy","4.9","19","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee_iced,"Iced Coffee","Chiller","4.1","29","10am to 9pm"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffee_dalgona,"Alloca Coffee","Fan favourite","5.0","39","10am to 9pm"));
            dailyAdapter.notifyDataSetChanged();
        }
    }
//    public void cartactivity(View view){
//        startActivity(new Intent(getApplicationContext(), MyCartActivity.class));
//    }
}