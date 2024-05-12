package com.ss.ttlivestreamer.core.utils;

import X.V0N;

/* loaded from: classes6.dex */
public enum LiveStreamThreadType {
    WORK_THREAD,
    VIDEO_CAPTURE,
    GRK_THREAD;

    public static LiveStreamThreadType valueOf(String str) {
        return (LiveStreamThreadType) V0N.LJJJ(LiveStreamThreadType.class, str);
    }
}
