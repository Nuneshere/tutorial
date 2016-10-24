package com.example.malu.myapplication; /**
 * Created by Malu on 23/10/2016.
 */

import android.app.Fragment;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONObject;
import org.json.JSONException;


public class RequestFragment extends Fragment {

    private void getRequest(final View rootView) {

        String url = " http://www.mocky.io/v2/57fd99ed2800009a1beb6b93";

        StringRequest jsObjRequest = new StringRequest
                (Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj = new JSONObject(response);
                    String ans = obj.getString("myFirstKey");

                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("ParserError", "Can't parse response into json object");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

    }

}











