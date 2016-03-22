package com.beat.featherapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    private class FetchURL extends AsyncTask<URL, Void, String> {
        @Override
        protected String doInBackground(URL... params) {
            return null;
        }
        protected void onPostExecute(String result){

        }
    }
}


