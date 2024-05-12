package com.facebook.common.time;

import X.WBE;
import android.os.SystemClock;

/* loaded from: classes14.dex */
public class RealtimeSinceBootClock implements WBE {
    public static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();

    @Override // X.WBE
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }
}
