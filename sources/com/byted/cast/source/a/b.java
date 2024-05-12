package com.byted.cast.source.a;

import com.byted.cast.sdk.RTCEngine;

/* loaded from: classes29.dex */
public final /* synthetic */ class b {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[RTCEngine.ExitReason.values().length];
        a = iArr;
        RTCEngine.ExitReason exitReason = RTCEngine.ExitReason.REASON_DISCONNECT;
        iArr[exitReason.ordinal()] = 1;
        iArr[RTCEngine.ExitReason.REASON_NETWORK_ERROR.ordinal()] = 2;
        iArr[RTCEngine.ExitReason.REASON_FATAL_ERROR.ordinal()] = 3;
        iArr[RTCEngine.ExitReason.REASON_WIFI_DISCONNECTED.ordinal()] = 4;
        RTCEngine.ExitReason exitReason2 = RTCEngine.ExitReason.REASON_KICK_OUT;
        iArr[exitReason2.ordinal()] = 5;
        iArr[RTCEngine.ExitReason.REASON_HEART_BEAT_ERROR.ordinal()] = 6;
        iArr[RTCEngine.ExitReason.REASON_RECONNECT_FAILED.ordinal()] = 7;
        iArr[RTCEngine.ExitReason.REASON_RECEIVE_SIGNAL_FAILED.ordinal()] = 8;
        int[] iArr2 = new int[RTCEngine.ExitReason.values().length];
        b = iArr2;
        iArr2[exitReason.ordinal()] = 1;
        iArr2[exitReason2.ordinal()] = 2;
    }
}
