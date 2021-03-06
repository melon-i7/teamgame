package com.example.melon_i7.teamgame.bus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.melon_i7.teamgame.R;
import com.example.melon_i7.teamgame.entity.Person;

import java.util.ArrayList;

/**
 * Created by user on 2016/12/1.
 */

public class PersionAdapter extends BaseAdapter {
    private Context mCont;
    private int mItem;
    private ArrayList<Person> mData;

    public PersionAdapter(Context mCont, int mItem, ArrayList<Person> mData) {
        this.mCont = mCont;
        this.mItem = mItem;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View _view= LayoutInflater.from(mCont).inflate(mItem,parent,false);
        ImageView a= (ImageView) _view.findViewById(R.id.p_icon);
        TextView b= (TextView) _view.findViewById(R.id.p_name);
        Person p=mData.get(position);
        a.setImageResource(p.getIcon());
        b.setText(p.getName());
        return _view;
    }
}
