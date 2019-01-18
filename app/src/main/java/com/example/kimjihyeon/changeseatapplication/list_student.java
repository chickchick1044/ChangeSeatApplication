package com.example.kimjihyeon.changeseatapplication;

public class list_student {

    private int profile_image;
    private String name;

    public list_student(int profile_image, String name){
        this.profile_image = profile_image;
        this.name = name;
    }

    public int getProfile_image(){
        return profile_image;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
