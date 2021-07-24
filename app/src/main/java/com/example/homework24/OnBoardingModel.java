package com.example.homework24;

public class OnBoardingModel {
    String txtTitle,txtDescription;
    int img;

    public OnBoardingModel(String txtTitle, String txtDescription, int img) {
        this.txtTitle = txtTitle;
        this.txtDescription = txtDescription;
        this.img = img;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtDescription() {
        return txtDescription;
    }

    public void setTxtDescription(String txtDescription) {
        this.txtDescription = txtDescription;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

