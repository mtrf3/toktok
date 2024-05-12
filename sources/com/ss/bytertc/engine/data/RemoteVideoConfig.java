package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class RemoteVideoConfig {
    public int framerate;
    public int height;
    public int width;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RemoteVideoConfig{width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", framerate=");
        LIZ.append(this.framerate);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public int getFrameRate() {
        return this.framerate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public RemoteVideoConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.framerate = i3;
    }
}
