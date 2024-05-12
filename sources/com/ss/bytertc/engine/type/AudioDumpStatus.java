package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioDumpStatus {
    AUDIO_DUMP_START_FAILURE(0),
    AUDIO_DUMP_START_SUCCESS(1),
    AUDIO_DUMP_STOP_FAILURE(2),
    AUDIO_DUMP_STOP_SUCCESS(3),
    AUDIO_DUMP_RUNNING_FAILURE(4),
    AUDIO_DUMP_RUNNING_SUCCESS(5);

    public int value;

    public int value() {
        return this.value;
    }

    public static AudioDumpStatus fromId(int i) {
        for (AudioDumpStatus audioDumpStatus : values()) {
            if (audioDumpStatus.value() == i) {
                return audioDumpStatus;
            }
        }
        return AUDIO_DUMP_START_FAILURE;
    }

    public static AudioDumpStatus valueOf(String str) {
        return (AudioDumpStatus) V0N.LJJJ(AudioDumpStatus.class, str);
    }

    AudioDumpStatus(int i) {
        this.value = i;
    }
}
