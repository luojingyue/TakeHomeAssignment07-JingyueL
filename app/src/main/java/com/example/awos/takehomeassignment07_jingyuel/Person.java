package com.example.awos.takehomeassignment07_jingyuel;

/**
 * Created by awos on 2018/3/26.
 */

public class Person {
    public String name;
    public String info;
    public int photoId;

    public Person(String name, String info, int photoId){
        this.name=name;
        this.info=info;
        this.photoId=photoId;
    }

    public String getName() {
        return name;
    }
}
