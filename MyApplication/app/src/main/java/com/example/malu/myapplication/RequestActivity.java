package com.example.malu.myapplication;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


public class RequestActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

    }

    public void makeRequest(View view) {
        String url = "http://www.mocky.io/v2/57678dc30f00000a08291dc8";
        Log.d("inicio", "to aqui");
        StringRequest sr = null;
        sr = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj = new JSONObject(response);
                    String ans = obj.getString("myFirstKey");
                    AlertDialog.Builder builder = new AlertDialog.Builder(RequestActivity.this);
                    Log.d("entrou", "pegou");
                    builder.setTitle("Titulo");
                    builder.setMessage(ans);
                    builder.show();

                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.d("erro", "erro no json");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("requesterrado!!!!","pam3");
            }
        });
        Log.d("fim", "acabou");

    }


}
