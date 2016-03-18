package com.takeoffandroid.appintroanimation;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardViewNative;

/**
 * Created by chris on 3/17/16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    List<MyFrag4Data> data = new ArrayList<>();

    public MyAdapter(Context context, List<MyFrag4Data> data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view  = inflater.inflate(R.layout.row_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MyFrag4Data current = data.get(position);
        holder.textView.setText(current.title);
        holder.imageView.setImageResource(current.img);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        CardViewNative viewNative;
        TextView textView;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            viewNative = (CardViewNative)itemView.findViewById(R.id.cView);
            textView = (TextView)itemView.findViewById(R.id.fragtxt);
            imageView = (ImageView)itemView.findViewById(R.id.fragimg);


        }
    }
}
