package com.example.awos.takehomeassignment07_jingyuel;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by awos on 2018/3/26.
 */

public class PersonViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView personName;
    public TextView personInfo;
    public ImageView personPhoto;

    public PersonViewHolder(View itemView, final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        personName=(TextView)itemView.findViewById(R.id.person_name);
        personInfo=(TextView)itemView.findViewById(R.id.person_info);
        personPhoto=(ImageView)itemView.findViewById(R.id.person_photo);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, personName.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }





}
