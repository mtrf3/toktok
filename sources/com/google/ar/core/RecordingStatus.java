package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);

    public final int nativeCode;

    public static RecordingStatus forNumber(int i) {
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i) {
                return recordingStatus;
            }
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Unexpected value for native RecordingStatus, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    public static RecordingStatus valueOf(String str) {
        return (RecordingStatus) V0N.LJJJ(RecordingStatus.class, str);
    }

    RecordingStatus(int i) {
        this.nativeCode = i;
    }
}
