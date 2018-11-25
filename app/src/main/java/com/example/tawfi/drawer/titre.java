package com.example.tawfi.drawer;

public class titre {
    String name=null;
    String des=null;
    int image;

    public titre(String name,String des,int image){
        this.name =name;
        this.des =des;
        this.image =image;
    }

    public String getName() {
        return this.name;
    }

    public String getDes() {
        return this.des;
    }

    public int getImage() {
        return this.image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

