package com.example.malu.myapplication; /**
 * Created by Malu on 23/10/2016.
 */


import android.app.AlertDialog;
import android.view.View;


import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;


import org.json.JSONException;
import org.json.JSONObject;

public class RequestFragment {

    /*private void getStatistics(final View rootView) {

        String url = " http://www.mocky.io/v2/57fd99ed2800009a1beb6b93";

        StringRequest sr = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj = new JSONObject(response);
                    String ans = obj.getString("myFisrtKey");
                    AlertDialog.Builder builder = new AlertDialog.Builder(RequestFragment.this).create();


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

    }*/
}
