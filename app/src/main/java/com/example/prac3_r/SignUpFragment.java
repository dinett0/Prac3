package com.example.prac3_r;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignUpFragment extends Fragment {
    View view;
    private Button signUp;
    private EditText fieldName, fieldEmail, fieldPassword;

    public SignUpFragment() {
        super(R.layout.fragment_sign_up);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        signUp = view.findViewById(R.id.buttonSignUp);
        fieldName = view.findViewById(R.id.editTextName);
        fieldEmail = view.findViewById(R.id.editTextEmail);
        fieldPassword = view.findViewById(R.id.editTextPassword);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        return view;
    }
}