package com.facebook.common.time;

import X.WBE;
import android.os.SystemClock;

/* loaded from: classes14.dex */
public class AwakeTimeSinceBootClock implements WBE {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    @Override // X.WBE
    public long now() {
        return SystemClock.uptimeMillis();
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }
}
