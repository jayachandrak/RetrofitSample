
package com.example.jayachandra.retrofitsample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("max")
    @Expose
    private Long max;
    @SerializedName("average")
    @Expose
    private Double average;
    @SerializedName("stars")
    @Expose
    private String stars;
    @SerializedName("min")
    @Expose
    private Long min;

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

}
