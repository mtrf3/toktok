package com.ss.ttm.player;

/* loaded from: classes9.dex */
public class SensorData {
    public static final native void _writeData(long j, int i, float f, float f2, float f3);

    public int start() {
        return -1;
    }

    public void stop() {
    }

    public final void finalize() {
        stop();
    }

    public void setHandle(long j, TTPlayer tTPlayer) {
    }
}
