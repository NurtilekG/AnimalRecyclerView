package com.zoro.animalrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_animal;
    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_animal=itemView.findViewById(R.id.tv_animal);
    }
    public void bind(String animalName){
tv_animal.setText(animalName);
    }
}
