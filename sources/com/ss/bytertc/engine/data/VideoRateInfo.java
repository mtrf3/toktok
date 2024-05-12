package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class VideoRateInfo {
    public int bitrateKbps;
    public int fps;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoRateInfo{fps='");
        LIZ.append(this.fps);
        LIZ.append('\'');
        LIZ.append(", bitrateKbps='");
        LIZ.append(this.bitrateKbps);
        LIZ.append('\'');
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public VideoRateInfo(int i, int i2) {
        this.fps = i;
        this.bitrateKbps = i2;
    }
}
