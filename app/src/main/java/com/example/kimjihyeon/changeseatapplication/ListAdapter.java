package com.example.kimjihyeon.changeseatapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<list_student> list_students;
    private TextView tv_name;
    private ImageView iv_profile;
    private int testnum;

    public ListAdapter(Context context, ArrayList<list_student> list_student){
        this.context = context;
        this.list_students = list_student;
    }

    @Override
    public int getCount() {
        return this.list_students.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list_students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView ==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.student, null);
            tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            iv_profile = (ImageView) convertView.findViewById(R.id.iv_profile);

            tv_name.setText(list_students.get(position).getName());
            iv_profile.setImageResource(list_students.get(position).getProfile_image());
        }
        return convertView;
    }
}

