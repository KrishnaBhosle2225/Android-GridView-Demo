package com.krishna.gridviewactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapterdesign extends BaseAdapter {
    Context mContext;
    List<Modeldesign> dresslist;

    public Adapterdesign(Context mContext,List<Modeldesign> dresslist) {
        this.mContext = mContext;
        this.dresslist = dresslist;
    }

    @Override
    public int getCount() {
        return dresslist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            view= inflater.inflate(R.layout.designflipcart,null);
        }
        else {
            view= convertView;
        }

        ImageView Image = view.findViewById(R.id.dress1);
        TextView Text1 = view.findViewById(R.id.text1);
        TextView Text2 = view.findViewById(R.id.text2);
        TextView Text3 = view.findViewById(R.id.text3);
        TextView Text4 = view.findViewById(R.id.text4);
        TextView Text5 = view.findViewById(R.id.text5);

        Modeldesign model = dresslist.get(position);
        Image.setImageResource(model.getImage());
        Text1.setText(model.getName());
        Text2.setText(model.getHeight());
        Text3.setText(model.getPrice());
        Text4.setText(model.getOff());
        Text5.setText(model.getBuyat());
        return view;
    }


}