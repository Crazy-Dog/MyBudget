package com.example.alinadolmatovich.qwerty;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button login = (Button) view.findViewById(R.id.login);
        final EditText name = (EditText) view.findViewById(R.id.name_edit);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle info = new Bundle();
                info.putString("name",name.getText().toString());
                FirstAttemptFragment faf = new FirstAttemptFragment();
                faf.setArguments(info);
                getActivity().
                        getSupportFragmentManager().
                        beginTransaction().
                        addToBackStack("faf").
                        replace(R.id.containerFragments, faf, "faf").
                        commit();
            }
        });

        return view;
    }
}
