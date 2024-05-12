package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum VoiceChangerType {
    VOICE_CHANGER_ORIGINAL(0),
    VOICE_CHANGER_GIANT(1),
    VOICE_CHANGER_CHIPMUNK(2),
    VOICE_CHANGER_MINIONST(3),
    VOICE_CHANGER_VIBRATO(4),
    VOICE_CHANGER_ROBOT(5);

    public final int value;

    public int value() {
        return this.value;
    }

    public static VoiceChangerType fromId(int i) {
        for (VoiceChangerType voiceChangerType : values()) {
            if (voiceChangerType.value() == i) {
                return voiceChangerType;
            }
        }
        return VOICE_CHANGER_ORIGINAL;
    }

    public static VoiceChangerType valueOf(String str) {
        return (VoiceChangerType) V0N.LJJJ(VoiceChangerType.class, str);
    }

    VoiceChangerType(int i) {
        this.value = i;
    }
}
