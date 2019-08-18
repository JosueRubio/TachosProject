package com.example.josue.tachosproject.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.josue.tachosproject.R;
import com.example.josue.tachosproject.TabRegistro;
import com.example.josue.tachosproject.TabRegistro3;
import com.example.josue.tachosproject.tab_registro1;
import com.example.josue.tachosproject.tab_registro2;
import com.example.josue.tachosproject.tab_registro4;
import com.example.josue.tachosproject.tab_registro5;
import com.example.josue.tachosproject.tab_registro6;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static Fragment newInstance(int index) {
        Fragment fragment = null;

        switch (index){
            case 1: fragment = new tab_registro1(); break;
            case 2: fragment = new tab_registro2(); break;
            case 3: fragment = new TabRegistro3(); break;
            case 4: fragment = new tab_registro4(); break;
            case 5: fragment = new tab_registro5(); break;
            case 6: fragment = new tab_registro6(); break;
        }
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tab_registro, container, false);
        final TextView textView = root.findViewById(R.id.textView_tab);
        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}