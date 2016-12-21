package com.example.alinadolmatovich.qwerty;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;

public class FirstAttemptFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_first_attempt, container, false);
        TextView nameTitle = (TextView) view.findViewById(R.id.name_title);
        TextView textView3 = (TextView) view.findViewById(R.id.textView3);

        Calendar c = Calendar.getInstance();
        System.out.println("Current time => " + c.getTime());

        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = df.format(c.getTime());

        nameTitle.setText(nameTitle.getText() + getArguments().getString("name"));
        textView3.setText(textView3.getText() + formattedDate);


        return view;
    }
}
