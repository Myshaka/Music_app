package com.example.stud.musicapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by W57467 on 2018-05-12.
 */

public class apiService {

    public static apiClient getService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://www.theaudiodb.com/api/v1/json/{1}/" )
                .addConverterFactory(GsonConverterFactory.create ())
                .build();

        return retrofit.create(apiClient.class);

    }


}
