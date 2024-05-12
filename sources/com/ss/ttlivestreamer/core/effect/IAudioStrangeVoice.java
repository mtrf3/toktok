package com.ss.ttlivestreamer.core.effect;

import java.nio.Buffer;

/* loaded from: classes12.dex */
public abstract class IAudioStrangeVoice {
    public boolean mEnable;
    public boolean mIsPlayerMode;
    public boolean mPlayInVoipMode;

    public abstract Buffer process(Buffer buffer, int i, int i2, int i3, long j);

    public void release() {
        setEnable(false);
    }

    public abstract int setAudioStrangeResource(String str);

    public int setAudioStrangeResource(String str, String str2) {
        return -1;
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public boolean isPlayerMode() {
        return this.mIsPlayerMode;
    }

    public void enablePlayerMode(boolean z) {
        this.mIsPlayerMode = z;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public void enablePlayerMode(boolean z, boolean z2) {
        this.mIsPlayerMode = z;
        this.mPlayInVoipMode = z2;
    }
}
