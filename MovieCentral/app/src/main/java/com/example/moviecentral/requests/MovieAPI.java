package com.example.moviecentral.requests;

import androidx.lifecycle.LiveData;

import com.example.moviecentral.requests.responses.ApiResponse;
import com.example.moviecentral.requests.responses.GenreResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieAPI {

    /**
     * https://api.themoviedb.org/3/genre/movie/list?api_key=<<api_key>>&language=en-US
     */
    @GET("3/genre/movie/list")
    LiveData<ApiResponse<GenreResponse>> getGenreList(
            @Query("api_key") String apiKey,
            @Query("language") String language);

}
