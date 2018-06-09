package com.example.stud.musicapp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by W57467 on 2018-05-12.
 */

public interface apiClient {

    @GET( "trending.php" )
    Call<TrendingList> getTrendingList(@Query( "country" ) String country, @Query ( "type" )
            String type, @Query ( "format" ) String format);

}
