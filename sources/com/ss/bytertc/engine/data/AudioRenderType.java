package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioRenderType {
    AUDIO_RENDER_TYPE_EXTERNAL(0),
    AUDIO_RENDER_TYPE_INTERNAL(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == AUDIO_RENDER_TYPE_EXTERNAL) {
            return "AUDIO_RENDER_TYPE_EXTERNAL";
        }
        return "AUDIO_RENDER_TYPE_INTERNAL";
    }

    public int value() {
        return this.value;
    }

    public static AudioRenderType fromId(int i) {
        for (AudioRenderType audioRenderType : values()) {
            if (audioRenderType.value() == i) {
                return audioRenderType;
            }
        }
        return null;
    }

    public static AudioRenderType valueOf(String str) {
        return (AudioRenderType) V0N.LJJJ(AudioRenderType.class, str);
    }

    AudioRenderType(int i) {
        this.value = i;
    }
}
