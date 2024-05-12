package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);

    public final int nativeCode;

    public static PlaybackStatus forNumber(int i) {
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i) {
                return playbackStatus;
            }
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("Unexpected value for native PlaybackStatus, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    public static PlaybackStatus valueOf(String str) {
        return (PlaybackStatus) V0N.LJJJ(PlaybackStatus.class, str);
    }

    PlaybackStatus(int i) {
        this.nativeCode = i;
    }
}
