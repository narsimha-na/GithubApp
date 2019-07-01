package com.example.githubapp.api.Services;

import com.example.githubapp.api.Model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> repoFromUser(@Path("user") String User);
}
