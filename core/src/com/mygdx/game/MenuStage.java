package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

/**
 * Created by tuskeb on 2016. 09. 30..
 */
public class MenuStage extends MyStage {
    private BadlActor actor;
    private CrossActor crossActor;
    private TextButton textButton;

    public MenuStage(Game game) {
        super(game);
    }

    public void init(final Game game)
    {
        actor = new BadlActor();
        crossActor = new CrossActor();
        textButton = new MyButton("Előre");
        textButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                game.setScreen(new OtherScreen(game));
            }
        });

        addActor(actor);
        addActor(crossActor);
        addActor(textButton);
    }


    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void dispose() {
        super.dispose();

    }
}