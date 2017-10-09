package com.mygdx.game.DemoHttp;

import com.mygdx.game.MyBaseClasses.Scene2D.MyScreen;
import com.mygdx.game.MyGdxGame;

/**
 * Created by tuskeb on 2017. 02. 10..
 */

public class HttpDemoScreen extends MyScreen {
    HttpDemoStage stage;
    public HttpDemoScreen(MyGdxGame game) {
        super(game);
        stage = new HttpDemoStage(game);
    }


    @Override
    public void init() {

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        stage.act(delta);
        stage.draw();
    }
}
