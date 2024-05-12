package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class MediaPlayerConfig {
    public boolean autoPlay;
    public long callbackOnProgressInterval;
    public int playCount;
    public int startPos;
    public boolean syncProgressToRecordFrame;
    public AudioMixingType type;

    public MediaPlayerConfig() {
        this.type = AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH;
        this.playCount = 1;
        this.autoPlay = true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MediaPlayerConfig{type='");
        LIZ.append(this.type);
        LIZ.append('\'');
        LIZ.append(", playCount='");
        LIZ.append(this.playCount);
        LIZ.append('\'');
        LIZ.append(", startPos='");
        LIZ.append(this.startPos);
        LIZ.append('\'');
        LIZ.append(", autoPlay='");
        LIZ.append(this.autoPlay);
        LIZ.append('\'');
        LIZ.append(", syncProgressToRecordFrame='");
        LIZ.append(this.syncProgressToRecordFrame);
        LIZ.append('\'');
        LIZ.append(", callbackOnProgressInterval='");
        LIZ.append(this.callbackOnProgressInterval);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public MediaPlayerConfig(AudioMixingType audioMixingType, int i) {
        this(audioMixingType, i, 0, true, 0L, false);
    }

    public MediaPlayerConfig(AudioMixingType audioMixingType, int i, int i2, boolean z, long j, boolean z2) {
        this.type = audioMixingType;
        this.playCount = i;
        this.startPos = i2;
        this.autoPlay = z;
        this.syncProgressToRecordFrame = z2;
        this.callbackOnProgressInterval = j;
    }
}
