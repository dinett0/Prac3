package com.example.prac3_r;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


public class LogInFragment extends Fragment {

    View view;

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
        EditText editEmail = view.findViewById(R.id.editTextTextEmailAddress);
        //EditText editPass = view.findViewById(R.id.editTextTextPassword);


        return inflater.inflate(R.layout.fragment_log_in, container, false);
    }
}