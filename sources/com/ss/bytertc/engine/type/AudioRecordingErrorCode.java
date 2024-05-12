package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioRecordingErrorCode {
    AUDIO_RECORDING_ERROR_CODE_OK(0),
    AUDIO_RECORDING_ERROR_CODE_NO_PERMISSION(-1),
    AUDIO_RECORDING_ERROR_CODE_NOT_IN_ROOM(-2),
    AUDIO_RECORDING_ERROR_CODE_ALREADY_STARTED(-3),
    AUDIO_RECORDING_ERROR_CODE_NOT_STARTED(-4),
    AUDIO_RECORDING_ERROR_CODE_NOT_SUPPORT(-5),
    AUDIO_RECORDING_ERROR_CODE_OTHER(-6);

    public int value;

    public int value() {
        return this.value;
    }

    public static AudioRecordingErrorCode fromId(int i) {
        for (AudioRecordingErrorCode audioRecordingErrorCode : values()) {
            if (audioRecordingErrorCode.value() == i) {
                return audioRecordingErrorCode;
            }
        }
        return AUDIO_RECORDING_ERROR_CODE_OTHER;
    }

    public static AudioRecordingErrorCode valueOf(String str) {
        return (AudioRecordingErrorCode) V0N.LJJJ(AudioRecordingErrorCode.class, str);
    }

    AudioRecordingErrorCode(int i) {
        this.value = i;
    }
}
