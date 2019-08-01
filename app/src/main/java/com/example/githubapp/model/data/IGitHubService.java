package com.example.githubapp.model.data;



import com.example.githubapp.model.gists.Gist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IGitHubService {

    @GET("/gists/public")
    Call<List<Gist>> getPulicGists();

    @GET("/gists")
    Call<List<Gist>> getYourGists();

    @GET("/gists/starred")
    Call<List<Gist>> getStarredGists();
}
