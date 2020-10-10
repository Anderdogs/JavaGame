package org.academiadecodigo.anderdogs.aula19;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Cadet {

    private Picture picture;

    public Cadet(){
        picture = new Picture(400,200,"resources/logo.png");
        picture.draw();
    }

    public int getX(){
        return picture.getX();
    }

    public void changePicture(){
        picture.load("resources/index.jpeg");
    }

}
