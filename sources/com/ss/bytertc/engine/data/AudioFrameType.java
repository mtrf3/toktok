package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioFrameType {
    FRAME_TYPE_PCM16(0);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == FRAME_TYPE_PCM16) {
            return "kFrameTypePCM16";
        }
        return "kFrameTypeUnknown";
    }

    public int value() {
        return this.value;
    }

    public static AudioFrameType fromId(int i) {
        for (AudioFrameType audioFrameType : values()) {
            if (audioFrameType.value() == i) {
                return audioFrameType;
            }
        }
        return null;
    }

    public static AudioFrameType valueOf(String str) {
        return (AudioFrameType) V0N.LJJJ(AudioFrameType.class, str);
    }

    AudioFrameType(int i) {
        this.value = i;
    }
}
