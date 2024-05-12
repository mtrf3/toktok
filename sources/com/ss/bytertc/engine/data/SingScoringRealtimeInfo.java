package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class SingScoringRealtimeInfo {
    public int averageScore;
    public int currentPosition;
    public int sentenceIndex;
    public int sentenceScore;
    public int standardPitch;
    public int totalScore;
    public int userPitch;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingScoringRealtimeInfo{currentPosition='");
        LIZ.append(this.currentPosition);
        LIZ.append('\'');
        LIZ.append("userPitch='");
        LIZ.append(this.userPitch);
        LIZ.append('\'');
        LIZ.append("standardPitch='");
        LIZ.append(this.standardPitch);
        LIZ.append('\'');
        LIZ.append("sentenceIndex='");
        LIZ.append(this.sentenceIndex);
        LIZ.append('\'');
        LIZ.append("sentenceScore='");
        LIZ.append(this.sentenceScore);
        LIZ.append('\'');
        LIZ.append("totalScore='");
        LIZ.append(this.totalScore);
        LIZ.append('\'');
        LIZ.append("averageScore='");
        LIZ.append(this.averageScore);
        LIZ.append('\'');
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public SingScoringRealtimeInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.currentPosition = i;
        this.userPitch = i2;
        this.standardPitch = i3;
        this.sentenceIndex = i4;
        this.sentenceScore = i5;
        this.totalScore = i6;
        this.averageScore = i7;
    }

    public static SingScoringRealtimeInfo create(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new SingScoringRealtimeInfo(i, i2, i3, i4, i5, i6, i7);
    }
}
