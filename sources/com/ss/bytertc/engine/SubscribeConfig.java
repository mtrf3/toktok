package com.ss.bytertc.engine;

import X.V0N;
import X.X1D;

/* loaded from: classes33.dex */
public class SubscribeConfig {
    public int framerate;
    public boolean isScreen;
    public boolean subAudio;
    public int subHeight;
    public boolean subVideo;
    public int subVideoIndex;
    public int subWidth;
    public SVCLayer svcLayer;
    public int videoIndex;

    public SubscribeConfig() {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubscribeConfig{isScreen=");
        LIZ.append(this.isScreen);
        LIZ.append(", subVideo=");
        LIZ.append(this.subVideo);
        LIZ.append(", subAudio=");
        LIZ.append(this.subAudio);
        LIZ.append(", videoIndex=");
        LIZ.append(this.videoIndex);
        LIZ.append(", svcLayer=");
        LIZ.append(this.svcLayer);
        LIZ.append(", sub_width=");
        LIZ.append(this.subWidth);
        LIZ.append(", sub_height=");
        LIZ.append(this.subHeight);
        LIZ.append(", sub_video_index=");
        LIZ.append(this.subVideoIndex);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes33.dex */
    public enum SVCLayer {
        DEFAULT(0),
        BASE(1),
        MAIN(2),
        HIGH(3);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static SVCLayer convertFromInt(int i) {
            return values()[i];
        }

        public static SVCLayer valueOf(String str) {
            return (SVCLayer) V0N.LJJJ(SVCLayer.class, str);
        }

        SVCLayer(int i) {
            this.value = i;
        }
    }

    public SubscribeConfig(SubscribeConfig subscribeConfig) {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        if (subscribeConfig != null) {
            this.isScreen = subscribeConfig.isScreen;
            this.subVideo = subscribeConfig.subVideo;
            this.subAudio = subscribeConfig.subAudio;
            this.videoIndex = subscribeConfig.videoIndex;
            this.svcLayer = subscribeConfig.svcLayer;
            this.subWidth = subscribeConfig.subWidth;
            this.subHeight = subscribeConfig.subHeight;
            this.subVideoIndex = subscribeConfig.subVideoIndex;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeConfig subscribeConfig = (SubscribeConfig) obj;
        if (this.isScreen == subscribeConfig.isScreen && this.subVideo == subscribeConfig.subVideo && this.subAudio == subscribeConfig.subAudio && this.videoIndex == subscribeConfig.videoIndex && this.svcLayer == subscribeConfig.svcLayer && this.subWidth == subscribeConfig.subWidth && this.subHeight == subscribeConfig.subHeight) {
            return true;
        }
        return false;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i) {
        this.subVideoIndex = -1;
        SVCLayer sVCLayer = SVCLayer.DEFAULT;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = sVCLayer;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = SVCLayer.convertFromInt(i2);
        this.subWidth = 0;
        this.subHeight = 0;
        this.subVideoIndex = -1;
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        this.subVideoIndex = -1;
        this.svcLayer = SVCLayer.DEFAULT;
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
        this.svcLayer = SVCLayer.convertFromInt(i2);
        this.subWidth = i3;
        this.subHeight = i4;
        this.subVideoIndex = i5;
    }

    public static SubscribeConfig create(boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5) {
        return new SubscribeConfig(z, z2, z3, i, i2, i3, i4, i5);
    }
}
