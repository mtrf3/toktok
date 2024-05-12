package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioSourceType {
    AUDIO_SOURCE_TYPE_EXTERNAL(0),
    AUDIO_SOURCE_TYPE_INTERNAL(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == AUDIO_SOURCE_TYPE_EXTERNAL) {
            return "AUDIO_SOURCE_TYPE_EXTERNAL";
        }
        return "AUDIO_SOURCE_TYPE_INTERNAL";
    }

    public int value() {
        return this.value;
    }

    public static AudioSourceType fromId(int i) {
        for (AudioSourceType audioSourceType : values()) {
            if (audioSourceType.value() == i) {
                return audioSourceType;
            }
        }
        return null;
    }

    public static AudioSourceType valueOf(String str) {
        return (AudioSourceType) V0N.LJJJ(AudioSourceType.class, str);
    }

    AudioSourceType(int i) {
        this.value = i;
    }
}
