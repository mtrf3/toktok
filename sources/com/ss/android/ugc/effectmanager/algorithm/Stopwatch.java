package com.ss.android.ugc.effectmanager.algorithm;

import android.os.SystemClock;

/* loaded from: classes16.dex */
public class Stopwatch {
    public long startTick;

    public static Stopwatch createStarted() {
        return new Stopwatch(SystemClock.uptimeMillis());
    }

    public long elapsedMillis() {
        return SystemClock.uptimeMillis() - this.startTick;
    }

    public Stopwatch(long j) {
        this.startTick = j;
    }
}
