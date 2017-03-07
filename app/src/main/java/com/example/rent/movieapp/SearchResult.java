package com.example.rent.movieapp;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResult {

    @SerializedName("Search")
    List<MovieListingItem> items;

    public String getTotalResults() {
        return totalResults;
    }

    public String getResponse() {
        return response;
    }

    public List<MovieListingItem> getItems() {
        return items;
    }

    private String totalResults;
    @SerializedName("Response")
    private String response;
}
