
package com.example.jayachandra.retrofitsample;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseResponse {

    @SerializedName("count")
    @Expose
    private Long count;
    @SerializedName("start")
    @Expose
    private Long start;
    @SerializedName("total")
    @Expose
    private Long total;
    @SerializedName("subjects")
    @Expose
    private List<Subject> subjects = null;
    @SerializedName("title")
    @Expose
    private String title;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
