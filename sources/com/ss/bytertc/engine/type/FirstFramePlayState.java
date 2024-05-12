package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum FirstFramePlayState {
    FIRST_FRAME_PLAY_STATE_PLAYING(0),
    FIRST_FRAME_PLAY_STATE_PLAYED(1),
    FIRST_FRAME_PLAY_STATE_END(2);

    public int state;

    public int value() {
        return this.state;
    }

    public static FirstFramePlayState fromId(int i) {
        for (FirstFramePlayState firstFramePlayState : values()) {
            if (firstFramePlayState.value() == i) {
                return firstFramePlayState;
            }
        }
        return null;
    }

    public static FirstFramePlayState valueOf(String str) {
        return (FirstFramePlayState) V0N.LJJJ(FirstFramePlayState.class, str);
    }

    FirstFramePlayState(int i) {
        this.state = i;
    }
}
