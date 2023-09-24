package com.example.myapplication.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.adapters.FeaturedAdapter;
import com.example.myapplication.adapters.FeaturedVerAdapter;
import com.example.myapplication.models.FeaturedModel;
import com.example.myapplication.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    ////////Featured Horizontal RecyclerView
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    ////////Featured Vertical RecyclerView
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_first, container, false);

       ///////Featured Hor RecyclerView

       recyclerView=view.findViewById(R.id.featured_hor_rec);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
       featuredModelsList=new ArrayList<>();

       featuredModelsList.add(new FeaturedModel(R.drawable.fav1,"Healthy Breakfast","A very fine way to begin the morning\nIs by having this fruits filled oats"));
       featuredModelsList.add(new FeaturedModel(R.drawable.fav2,"Glutton Bun","If you ever felt like having loads of glutton\nHave this cheesy cheese burger made just for you"));
       featuredModelsList.add(new FeaturedModel(R.drawable.fav3,"Healthy carb","Noodles and the veggies form the perfect diet"));

       featuredAdapter=new FeaturedAdapter(featuredModelsList);
       recyclerView.setAdapter(featuredAdapter);

       //////Featured Ver RecyclerView

        recyclerView2=view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelList=new ArrayList<>();

        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver1,"Oat breakfast","Combine 1 cup rolled oats with 2 cups water/milk, cook for 5-7 minutes And serve with strawberry and banana toppings.","4.5","8 minutes"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver2,"Bread and Omelette","Whisk eggs, salt, and pepper; dip bread slices in the mixture,then cook in a greased pan until golden on both sides.","4.0","5 minutes"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.ver3,"Honey pancake","Mix flour, milk, eggs, sugar, and baking powder; pour batter onto a greased skillet and cook until golden on both sides pour honey and fruits on top.","4.8","15 minutes"));

        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}