package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class LocalAudioPropertiesInfo {
    public AudioPropertiesInfo audioPropertiesInfo;
    public StreamIndex streamIndex;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalAudioPropertiesInfo{streamIndex='");
        LIZ.append(this.streamIndex);
        LIZ.append('\'');
        LIZ.append("audioPropertiesInfo='");
        LIZ.append(this.audioPropertiesInfo.toString());
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public LocalAudioPropertiesInfo(StreamIndex streamIndex, AudioPropertiesInfo audioPropertiesInfo) {
        this.streamIndex = streamIndex;
        this.audioPropertiesInfo = audioPropertiesInfo;
    }

    public static LocalAudioPropertiesInfo create(int i, int i2, int i3, float[] fArr, int i4, double d) {
        AudioPropertiesInfo audioPropertiesInfo = new AudioPropertiesInfo(i2, i3, fArr, i4);
        audioPropertiesInfo.voicePitch = d;
        return new LocalAudioPropertiesInfo(StreamIndex.fromId(i), audioPropertiesInfo);
    }
}
