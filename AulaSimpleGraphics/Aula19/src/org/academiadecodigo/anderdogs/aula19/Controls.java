package org.academiadecodigo.anderdogs.aula19;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controls implements KeyboardHandler {

    private Keyboard keyboard;
    private MC mc; //Para poder invocar metodos do MC

    public void init(){
        keyboard = new Keyboard(this);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);//Indicar qual a tecla
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);//Indicar qual po evento

        keyboard.addEventListener(rightPressed);//Dizer esta atento a este evento

    }

    public void setMc(MC mc){
        this.mc = mc;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT){
            mc.moveRight();
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
