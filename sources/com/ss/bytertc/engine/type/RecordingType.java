package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum RecordingType {
    RECORD_AUDIO_ONLY(0),
    RECORD_VIDEO_ONLY(1),
    RECORD_VIDEO_AND_AUDIO(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static RecordingType fromId(int i) {
        for (RecordingType recordingType : values()) {
            if (recordingType.value() == i) {
                return recordingType;
            }
        }
        return null;
    }

    public static RecordingType valueOf(String str) {
        return (RecordingType) V0N.LJJJ(RecordingType.class, str);
    }

    RecordingType(int i) {
        this.value = i;
    }
}
