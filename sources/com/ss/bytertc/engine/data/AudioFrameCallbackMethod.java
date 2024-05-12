package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioFrameCallbackMethod {
    AUDIO_FRAME_CALLBACK_RECORD(0),
    AUDIO_FRAME_CALLBACK_PLAYBACK(1),
    AUDIO_FRAME_CALLBACK_MIXED(2),
    AUDIO_FRAME_CALLBACK_REMOTE_USER(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static AudioFrameCallbackMethod fromId(int i) {
        for (AudioFrameCallbackMethod audioFrameCallbackMethod : values()) {
            if (audioFrameCallbackMethod.value() == i) {
                return audioFrameCallbackMethod;
            }
        }
        return null;
    }

    public static AudioFrameCallbackMethod valueOf(String str) {
        return (AudioFrameCallbackMethod) V0N.LJJJ(AudioFrameCallbackMethod.class, str);
    }

    AudioFrameCallbackMethod(int i) {
        this.value = i;
    }
}
