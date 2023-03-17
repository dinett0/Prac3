package com.example.prac3_r;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LogInFragment extends Fragment implements View.OnClickListener{

    EditText editEmail;
    EditText editPass;
    Button signUp, login;
    String name = "Name";

    public LogInFragment(){
        super(R.layout.fragment_log_in);
    }
    String TAG = this.getClass().getSimpleName();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");
    }


    @Override
    public void onStart() {
        Toast.makeText(getActivity(), "onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Toast.makeText(getActivity(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Toast.makeText(getActivity(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Toast.makeText(getActivity(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getActivity(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);
        editEmail = view.findViewById(R.id.editTextTextEmailAddress);
        editPass = view.findViewById(R.id.editTextTextPassword);

        signUp = view.findViewById(R.id.button_signup);
        signUp.setOnClickListener(this);

        login = view.findViewById(R.id.button_login);
        login.setOnClickListener(this);

        getParentFragmentManager().setFragmentResultListener("fromSignUp", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                name = result.getString("name");
                editEmail.setText(result.getString("email"));
                editPass.setText(result.getString("password"));
            }
        });
        return view;
    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button_signup:
                SignUpFragment signUpFragment  = new SignUpFragment();
                ((MainActivity)getActivity()).replaceFragments(signUpFragment);
                break;

            case R.id.button_login:
                Bundle result = new Bundle();
                result.putString("name", name);
                result.putString("email", editEmail.getText().toString());
                result.putString("password", editPass.getText().toString());
                getParentFragmentManager().setFragmentResult("fromLogIn", result);

                ProfileFragment inst = new ProfileFragment();
                ((MainActivity)getActivity()).replaceFragments(inst);
                break;

            default:
                break;
        }
    }

}