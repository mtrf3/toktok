package com.ss.bytertc.engine.video;

import X.V0N;
import X.X1D;

/* loaded from: classes33.dex */
public class VideoEncoderConfiguration {
    public VideoDimensions dimensions;
    public FrameRate frameRate;
    public int kBitrate;
    public int kMinBitrate;
    public OrientationMode orientationMode;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoEncoderConfiguration{dimensions=");
        LIZ.append(this.dimensions);
        LIZ.append(", frameRate=");
        LIZ.append(this.frameRate);
        LIZ.append(", bitrate=");
        LIZ.append(this.kBitrate);
        LIZ.append(", minBitrate=");
        LIZ.append(this.kMinBitrate);
        LIZ.append(", orienttationMode=");
        LIZ.append(this.orientationMode);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes33.dex */
    public enum OrientationMode {
        ORIENTATION_MODE_ADAPTIVE(0),
        ORIENTATION_MODE_FIXED_LANDSCAPE(1),
        ORIENTATION_MODE_FIXED_PORTRAIT(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static OrientationMode valueOf(String str) {
            return (OrientationMode) V0N.LJJJ(OrientationMode.class, str);
        }

        OrientationMode(int i) {
            this.value = i;
        }
    }

    public VideoEncoderConfiguration(VideoDimensions videoDimensions, FrameRate frameRate, int i, int i2, OrientationMode orientationMode) {
        this.dimensions = videoDimensions;
        this.frameRate = frameRate;
        this.kBitrate = i;
        this.kMinBitrate = i2;
        this.orientationMode = orientationMode;
    }
}
