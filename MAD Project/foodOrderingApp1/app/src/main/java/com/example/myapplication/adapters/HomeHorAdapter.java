package com.example.myapplication.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.HomeHorModel;
import com.example.myapplication.models.HomeVerModel;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check=true;
    boolean select=true;
    int row_index=-1;
    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec,Activity activity, ArrayList<HomeHorModel> homeHorModelList) {
        this.updateVerticalRec=updateVerticalRec;
        this.activity=activity;
        list=homeHorModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Mushroom and sausage", "10:00 - 12:00", "4.9", "Min - 35$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Veggie Pizza", "10:00 - 12:00", "4.1", "Min - 25$"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pineapple Pizza", "10:00 - 12:00", "3.7", "Min - 15$"));
            homeVerModels.add(new HomeVerModel(R.drawable.gray_bg, "Pizza 4", "10:00 - 12:00", "4.9", "Min - 35$"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    row_index=position;
                    notifyDataSetChanged();

                    if(position==0){
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Mushroom and sausage", "10:00 - 12:00", "4.9", "Min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Veggie Pizza", "10:00 - 12:00", "4.1", "Min - 25$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pineapple Pizza", "10:00 - 12:00", "3.7", "Min - 15$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.gray_bg, "Pizza 4", "10:00 - 12:00", "4.9", "Min - 35$"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position==1){
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Cheese and ham","10:00 - 12:00","4.0","Min - 15$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Double pattie lamb","10:00 - 12:00","4.8","Min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger1,"Loaded burger","10:00 - 12:00","4.4","Min - 45$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.gray_bg," 4","10:00 - 12:00","4.9","Min - 35$"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if(position==2){
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.fries1,"Salted fries","10:00 - 12:00","4.0","Min - 15$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2,"Seasoned wedges","10:00 - 12:00","4.2","Min - 15$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3,"Chicken topped","10:00 - 12:00","4.0","Min - 20$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4,"Ready to go fries","10:00 - 12:00","3.5","Min - 10$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.gray_bg,"Fries 5","10:00 - 12:00","4.9","Min - 35$"));
                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position==3){
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1,"Chocolate cone","10:00 - 12:00","4.9","Min - 5$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2,"Oreo","10:00 - 12:00","4.4","Min - 8$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3,"Fig and honey","10:00 - 12:00","4.1","Min - 15$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4,"Strawberry softie","10:00 - 12:00","4.0","Min - 5$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.gray_bg,"Ice Cream 4","10:00 - 12:00","4.9","Min - 35$"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position==4){
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1,"Corn sandwich","10:00 - 12:00","4.0","Min - 15$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2,"Brown bread sandwich","10:00 - 12:00","3.9","Min - 25$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3,"Ham and cheese","10:00 - 12:00","4.7","Min - 35$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4,"Sandwich combo","10:00 - 12:00","4.0","Min - 25$"));
                        homeVerModels.add(new HomeVerModel(R.drawable.gray_bg,"Sandwich 4","10:00 - 12:00","4.9","Min - 35$"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                }
            });

            if(select){
                if (position==0){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select=false;
                }
            }
            else{
                if (row_index==position){
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
                else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);
                }
            }
        }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            imageView=itemView.findViewById(R.id.hor_img);
            name=itemView.findViewById(R.id.hor_text);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
