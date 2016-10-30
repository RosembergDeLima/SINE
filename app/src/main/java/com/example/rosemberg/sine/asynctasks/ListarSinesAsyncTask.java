package com.example.rosemberg.sine.asynctasks;

import android.os.AsyncTask;

import com.example.rosemberg.sine.classes.Sine;

import java.util.List;

public class ListarSinesAsyncTask extends AsyncTask<String, Void, List<Sine>>{
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected List<Sine> doInBackground(String... strings) {

    }

    @Override
    protected void onPostExecute(List<Sine> sines) {
        super.onPostExecute(sines);
    }
}
