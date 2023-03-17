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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        signUp = view.findViewById(R.id.continue_reg);
        fieldName = view.findViewById(R.id.editTextName);
        fieldEmail = view.findViewById(R.id.editTextEmail);
        fieldPassword = view.findViewById(R.id.editTextPassword);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                result.putString("name", fieldName.getText().toString());
                result.putString("email", fieldEmail.getText().toString());
                result.putString("password", fieldPassword.getText().toString());
                getParentFragmentManager().setFragmentResult("fromSignUp", result);

                LogInFragment inst = new LogInFragment();
                ((MainActivity)getActivity()).replaceFragments(inst);
            }
        });

        return view;
    }
}