package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioProfileType {
    AUDIO_PROFILE_DEFAULT(0),
    AUDIO_PROFILE_FLUENT(1),
    AUDIO_PROFILE_STANDARD(2),
    AUDIO_PROFILE_HD(3),
    AUDIO_PROFILE_STANDARD_STEREO(4),
    AUDIO_PROFILE_HD_MONO(5);

    public final int value;

    public int value() {
        return this.value;
    }

    public static AudioProfileType fromId(int i) {
        for (AudioProfileType audioProfileType : values()) {
            if (audioProfileType.value() == i) {
                return audioProfileType;
            }
        }
        return AUDIO_PROFILE_DEFAULT;
    }

    public static AudioProfileType valueOf(String str) {
        return (AudioProfileType) V0N.LJJJ(AudioProfileType.class, str);
    }

    AudioProfileType(int i) {
        this.value = i;
    }
}
