package com.eworl.tictactoe.models.gameStatus;

/**
 * Created by Maninder Taggar on 26/1/17.
 */

public class Draw extends GameStatus {

    @Override
    protected void setStatus() {
        this.status = "draw";
    }
}
