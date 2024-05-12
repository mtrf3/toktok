package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public class GameInfo implements Serializable {

    @InterfaceC65349Pkn("game_score")
    public int gameScore;

    @InterfaceC65349Pkn("game_type")
    public int gameType;

    public int getGameScore() {
        return this.gameScore;
    }

    public int getGameType() {
        return this.gameType;
    }

    public void setGameScore(int i) {
        this.gameScore = i;
    }

    public void setGameType(int i) {
        this.gameType = i;
    }
}
