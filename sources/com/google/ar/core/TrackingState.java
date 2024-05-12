package com.google.ar.core;

import X.V0N;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes34.dex */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);

    public final int nativeCode;

    public static TrackingState forNumber(int i) {
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i) {
                return trackingState;
            }
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Unexpected value for native TrackingState, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    public static TrackingState valueOf(String str) {
        return (TrackingState) V0N.LJJJ(TrackingState.class, str);
    }

    TrackingState(int i) {
        this.nativeCode = i;
    }
}
