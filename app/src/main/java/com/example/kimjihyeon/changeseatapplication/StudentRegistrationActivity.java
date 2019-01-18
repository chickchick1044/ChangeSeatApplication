package com.example.kimjihyeon.changeseatapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentRegistrationActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    private ArrayList<list_student> list_studentArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_registration);

        listView = (ListView)findViewById(R.id.listview);
        list_studentArrayList = new ArrayList<list_student>();

        list_studentArrayList.add(new list_student(R.mipmap.ic_launcher, "학생1"));
        list_studentArrayList.add(new list_student(R.mipmap.ic_launcher, "학생2"));

        listAdapter = new ListAdapter(StudentRegistrationActivity.this, list_studentArrayList);
        listView.setAdapter(listAdapter);

    }
}
