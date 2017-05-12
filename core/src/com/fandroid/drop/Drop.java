package com.fandroid.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by vorobev on 12.05.2017.
 */

public class Drop extends Game{

    SpriteBatch batch;  //объект используется для отображения объектов на экране, таких как текстуры
    BitmapFont font;    // используется для отображения текста на экране

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        this.setScreen(new MainMenuScreen(this));

    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
        font.dispose();
        batch.dispose();
    }
}
