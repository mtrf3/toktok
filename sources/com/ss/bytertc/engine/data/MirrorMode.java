package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MirrorMode {
    MIRROR_MODE_OFF(0),
    MIRROR_MODE_ON(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == MIRROR_MODE_ON) {
            return "kMirrorModeOn";
        }
        return "kMirrorModeOff";
    }

    public int value() {
        return this.value;
    }

    public static MirrorMode fromId(int i) {
        for (MirrorMode mirrorMode : values()) {
            if (mirrorMode.value() == i) {
                return mirrorMode;
            }
        }
        return null;
    }

    public static MirrorMode valueOf(String str) {
        return (MirrorMode) V0N.LJJJ(MirrorMode.class, str);
    }

    MirrorMode(int i) {
        this.value = i;
    }
}
