package com.example.nzxt.mysunshineindonesia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by NZXT on 11/4/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter <WeatherAdapter.weatherViewHolder> {
    @Override
    public weatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewContent = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_item,parent,false);
        return new weatherViewHolder(viewContent);
    }

    @Override
    public void onBindViewHolder(weatherViewHolder holder, int position) {
    holder.itemTitle.setText("Cuaca Hari ini tanggal" +position);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class weatherViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.item_title)
        TextView itemTitle;
        public weatherViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
