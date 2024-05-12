package com.ss.ttlivestreamer.livestreamv2.filter;

/* loaded from: classes12.dex */
public final class KtvMidiData {
    public final int durationMs;
    public final int pitch;
    public final int startMs;
    public final int velocity;

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final int getPitch() {
        return this.pitch;
    }

    public final int getStartMs() {
        return this.startMs;
    }

    public final int getVelocity() {
        return this.velocity;
    }

    public KtvMidiData(int i, int i2, int i3, int i4) {
        this.pitch = i;
        this.startMs = i2;
        this.durationMs = i3;
        this.velocity = i4;
    }
}
