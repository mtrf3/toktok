package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SubtitleState {
    SUBTITLE_STATE_STARTED(0),
    SUBTITLE_STATE_STOPED(1),
    SUBTITLE_STATE_ERROR(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubtitleState fromId(int i) {
        for (SubtitleState subtitleState : values()) {
            if (subtitleState.value() == i) {
                return subtitleState;
            }
        }
        return SUBTITLE_STATE_ERROR;
    }

    public static SubtitleState valueOf(String str) {
        return (SubtitleState) V0N.LJJJ(SubtitleState.class, str);
    }

    SubtitleState(int i) {
        this.value = i;
    }
}
