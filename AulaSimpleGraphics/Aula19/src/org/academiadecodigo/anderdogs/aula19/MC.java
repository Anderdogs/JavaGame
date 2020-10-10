package org.academiadecodigo.anderdogs.aula19;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MC {

    private Picture picture;
    private Cadet cadet;

    public MC(){
        picture = new Picture( -500,0, "resources/logo.png");
        picture.draw();
    }

    public void setCadet(Cadet cadet) {
        this.cadet = cadet;
    }

    public void moveRight(){
        picture.translate(20,0);

        if(picture.getX() + picture.getWidth() > cadet.getX()){
           cadet.changePicture();
        }
     }
}
