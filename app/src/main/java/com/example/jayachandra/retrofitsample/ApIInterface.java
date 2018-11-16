package com.example.jayachandra.retrofitsample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApIInterface {
    @GET("top250")
    Call<BaseResponse> doGetListResources(@Query("start") int start,@Query("count")int count);

}
