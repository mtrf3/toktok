package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class AudioMixingConfig {
    public long callbackOnProgressInterval;
    public int playCount;
    public int position;
    public boolean syncProgressToRecordFrame;
    public AudioMixingType type;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioMixingConfig{type='");
        LIZ.append(this.type);
        LIZ.append('\'');
        LIZ.append(", playCount='");
        LIZ.append(this.playCount);
        LIZ.append('\'');
        LIZ.append(", pos='");
        LIZ.append(this.position);
        LIZ.append('\'');
        LIZ.append(", callbackOnProgressInterval='");
        LIZ.append(this.callbackOnProgressInterval);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public AudioMixingConfig(AudioMixingType audioMixingType, int i) {
        this(audioMixingType, i, 0, 0L);
    }

    public AudioMixingConfig(AudioMixingType audioMixingType, int i, int i2, long j) {
        this.type = audioMixingType;
        this.playCount = i;
        this.position = i2;
        this.callbackOnProgressInterval = j;
    }
}
