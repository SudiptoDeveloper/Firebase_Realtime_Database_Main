package com.adb.firebase_realtime_database;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter {


    public ListAdapter(Activity mContext, List<Students> studentsList) {
        super(mContext,R.layout.custom_layout,studentsList);
        this.mContext = mContext;
        this.studentsList = studentsList;
    }



    private Activity mContext;

    List<Students> studentsList;

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = mContext.getLayoutInflater();
        View listItemView = inflater.inflate(R.layout.custom_layout,null,true);

        TextView tvName = listItemView.findViewById(R.id.tvName);
        TextView tvRollno = listItemView.findViewById(R.id.tvRollno);
        TextView tvEmail = listItemView.findViewById(R.id.tvEmail);
        TextView tvCourse = listItemView.findViewById(R.id.tvCourse);

        Students students = studentsList.get(position);

        tvName.setText(students.getName());
        tvRollno.setText(students.getRollno());
        tvEmail.setText(students.getEmail());
        tvCourse.setText(students.getCourse());

        return listItemView;
    }


}
