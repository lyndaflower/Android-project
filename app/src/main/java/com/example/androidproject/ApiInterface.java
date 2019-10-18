package com.example.androidproject;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("businesses/search")
    Call<YelpPurabella> getPerfumes(
            @Query("location") String location,
            @Query("term") String term

    );
}
