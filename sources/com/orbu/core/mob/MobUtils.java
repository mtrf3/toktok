package com.orbu.core.mob;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class MobUtils {
    public static final MobUtils INSTANCE = new MobUtils();

    public final long getCurMillis() {
        return SystemClock.uptimeMillis();
    }
}
