package com.example.administrator;

import android.widget.Button;

public class AdminModel {
    //hello
    String Authorname;
    String image;
    Button button;

    public AdminModel(String Authorname, String image, Button button) {
        this.Authorname = Authorname;
        this.image = image;
        this.button = button;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public String getImage() {

        return image;
    }
    public Button getButton(){
        return button;
    }
}
