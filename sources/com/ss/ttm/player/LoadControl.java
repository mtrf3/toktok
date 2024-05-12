package com.ss.ttm.player;

/* loaded from: classes9.dex */
public abstract class LoadControl extends NativeObject {
    public abstract int onCodecStackSelected(int i);

    public abstract int onFilterStackSelected(int i);

    public abstract int onTrackSelected(int i);

    public abstract boolean shouldStartPlayback(long j, float f, boolean z);
}
