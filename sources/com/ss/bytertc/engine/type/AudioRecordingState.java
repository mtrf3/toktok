package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioRecordingState {
    AUDIO_RECORDING_STATE_ERROR(0),
    AUDIO_RECORDING_STATE_PROCESSING(1),
    AUDIO_RECORDING_STATE_SUCCESS(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static AudioRecordingState fromId(int i) {
        for (AudioRecordingState audioRecordingState : values()) {
            if (audioRecordingState.value() == i) {
                return audioRecordingState;
            }
        }
        return AUDIO_RECORDING_STATE_ERROR;
    }

    public static AudioRecordingState valueOf(String str) {
        return (AudioRecordingState) V0N.LJJJ(AudioRecordingState.class, str);
    }

    AudioRecordingState(int i) {
        this.value = i;
    }
}
