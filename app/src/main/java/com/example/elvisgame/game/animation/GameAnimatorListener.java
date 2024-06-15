package com.example.elvisgame.game.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

import com.example.elvisgame.game.mechanics.GameEngine;

public class GameAnimatorListener extends AnimatorListenerAdapter {
    private GameEngine gameEngine;

    public GameAnimatorListener(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    @Override
    public void onAnimationRepeat(Animator animation) {
        super.onAnimationRepeat(animation);
        gameEngine.increaseNoAnswerCounter();
        gameEngine.setWord();
    }
}
