package com.example.food_spring;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.food_spring.Model.Platillo;

import java.util.List;

public class PlatilloAdapter extends ArrayAdapter<Platillo> {

    private Context context;
    private List<Platillo>platillos;


    public PlatilloAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Platillo> objects) {
        super(context, resource, textViewResourceId, objects);

        this.context=context;
        this.platillos=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.content_main,parent,false);

        TextView txtidPersona


    }

}
