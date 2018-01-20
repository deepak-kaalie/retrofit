package com.example.user.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by User on 20-01-2018.
 */

public class RequestInterface {
    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON() {


        return null;
    }
}
