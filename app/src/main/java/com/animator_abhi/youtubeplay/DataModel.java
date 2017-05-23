package com.animator_abhi.youtubeplay;

/**
 * Created by ANIMATOR ABHI on 23/05/2017.
 */

public class DataModel {

    String name;
    String desc;
    String videoUrl;
    int thumbId;


    public DataModel(String name, String desc, String videoUrl, int thumbId) {
        this.name=name;
        this.desc=desc;
        this.videoUrl=videoUrl;
        this.thumbId=thumbId;


    }

    public int getThumbId() {
        return thumbId;
    }

    public String getName() {
        return name;
    }

    public String getdesc() {
        return desc;
    }

    public String getvideoUrl() {
        return videoUrl;
    }



}