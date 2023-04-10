package com.example.fragmentexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class FirstFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText firstEditText = view.findViewById(R.id.firstEditText);
        EditText secondEditText = view.findViewById(R.id.secondEditText);
        Button addBtn = view.findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstNumberString = firstEditText.getText().toString();
                String secondNumberString = secondEditText.getText().toString();

                int firstNumber = Integer.parseInt(firstNumberString);
                int secondNumber = Integer.parseInt(secondNumberString);

                int result = firstNumber + secondNumber;

                Snackbar.make(view,
                        "The sum of two number is:" + result,
                        Snackbar.LENGTH_LONG).show();
            }
        });
    }
}