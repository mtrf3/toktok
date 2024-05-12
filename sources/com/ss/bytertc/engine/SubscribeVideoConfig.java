package com.ss.bytertc.engine;

import X.X1D;

/* loaded from: classes33.dex */
public class SubscribeVideoConfig {
    public int priority;
    public int videoIndex;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscribeVideoConfig{videoIndex=");
        LIZ.append(this.videoIndex);
        LIZ.append(", priority=");
        LIZ.append(this.priority);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public int getPriority() {
        return this.priority;
    }

    public int getVideoIndex() {
        return this.videoIndex;
    }

    public SubscribeVideoConfig(int i, int i2) {
        this.videoIndex = i;
        this.priority = i2;
    }
}
