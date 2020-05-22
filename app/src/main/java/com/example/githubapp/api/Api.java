package com.example.githubapp.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

	private static Api mInstanse;
	private Retrofit mRetrofit;

	public Api() {

		Gson gson  = new GsonBuilder()
				.setLenient()
				.create();

		mRetrofit = new Retrofit.Builder()
				.baseUrl()
				.addConverterFactory(GsonConverterFactory.create())
				.build();

	}
}
