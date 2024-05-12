package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MuteState {
    MUTE_STATE_OFF(0),
    MUTE_STATE_ON(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == MUTE_STATE_ON) {
            return "kMuteStateOn";
        }
        return "kMuteStateOff";
    }

    public int value() {
        return this.value;
    }

    public static MuteState fromId(int i) {
        for (MuteState muteState : values()) {
            if (muteState.value() == i) {
                return muteState;
            }
        }
        return null;
    }

    public static MuteState valueOf(String str) {
        return (MuteState) V0N.LJJJ(MuteState.class, str);
    }

    MuteState(int i) {
        this.value = i;
    }
}
