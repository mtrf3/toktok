package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioDeviceType {
    AUDIO_DEVICE_TYPE_UNKNOWN(-1),
    AUDIO_DEVICE_TYPE_RENDER_DEVICE(0),
    AUDIO_DEVICE_TYPE_CAPTURE_DEVICE(1),
    AUDIO_DEVICE_TYPE_SCREEN_CAPTURE_DEVICE(2);

    public final int value;

    public int value() {
        return this.value;
    }

    public static AudioDeviceType fromId(int i) {
        for (AudioDeviceType audioDeviceType : values()) {
            if (audioDeviceType.value() == i) {
                return audioDeviceType;
            }
        }
        return AUDIO_DEVICE_TYPE_UNKNOWN;
    }

    public static AudioDeviceType valueOf(String str) {
        return (AudioDeviceType) V0N.LJJJ(AudioDeviceType.class, str);
    }

    AudioDeviceType(int i) {
        this.value = i;
    }
}
