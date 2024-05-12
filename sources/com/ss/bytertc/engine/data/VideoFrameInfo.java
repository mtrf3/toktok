package com.ss.bytertc.engine.data;

import X.X1D;

/* loaded from: classes33.dex */
public class VideoFrameInfo {
    public int height;
    public VideoRotation rotation;
    public int width;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoFrameInfo{width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", rotation=");
        LIZ.append(this.rotation);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public VideoFrameInfo(int i, int i2, int i3) {
        this.rotation = VideoRotation.VIDEO_ROTATION_0;
        this.width = i;
        this.height = i2;
        this.rotation = VideoRotation.fromId(i3);
    }
}
