package com.example.myapplication.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.DailyMealAdapter;
import com.example.myapplication.models.DailyMealModel;

import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModels;
    DailyMealAdapter dailyMealAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root=inflater.inflate(R.layout.daily_meal_fragment,container,false);

        recyclerView = root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels = new ArrayList<>();

        dailyMealModels.add(new DailyMealModel(R.drawable.breakfast,"Breakfast","30% off","Breakfasts at good price from 10am to 1pm","breakfast"));
        dailyMealModels.add(new DailyMealModel(R.drawable.lunch,"Lunch","10% off","Tasty and filling lunch from 2pm to 5pm","lunch"));
        dailyMealModels.add(new DailyMealModel(R.drawable.dinner,"Dinner","20% off","Fine dinner from 7pm to 10m","dinner"));
        dailyMealModels.add(new DailyMealModel(R.drawable.sweets,"Sweets","39% off","Desserts time","sweets"));
        dailyMealModels.add(new DailyMealModel(R.drawable.coffee,"Coffee","25% off","Your dose of caffeine","coffee"));

        dailyMealAdapter = new DailyMealAdapter(dailyMealModels,getContext());
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();

        return root;
    }
}