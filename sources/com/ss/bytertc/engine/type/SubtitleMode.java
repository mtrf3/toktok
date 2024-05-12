package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum SubtitleMode {
    SUBTITLE_MODE_RECOGINTE(0),
    SUBTITLE_MODE_TRANSLATION(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static SubtitleMode fromId(int i) {
        for (SubtitleMode subtitleMode : values()) {
            if (subtitleMode.value() == i) {
                return subtitleMode;
            }
        }
        return SUBTITLE_MODE_RECOGINTE;
    }

    public static SubtitleMode valueOf(String str) {
        return (SubtitleMode) V0N.LJJJ(SubtitleMode.class, str);
    }

    SubtitleMode(int i) {
        this.value = i;
    }
}
