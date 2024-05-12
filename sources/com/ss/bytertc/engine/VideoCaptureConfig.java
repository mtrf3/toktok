package com.ss.bytertc.engine;

import X.V0N;
import X.X1D;

/* loaded from: classes33.dex */
public class VideoCaptureConfig {
    public CapturePreference capturePreference;
    public int frameRate;
    public int height;
    public int width;

    public VideoCaptureConfig() {
        this.capturePreference = CapturePreference.AUTO;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCaptureConfig{capturePreference=");
        LIZ.append(this.capturePreference);
        LIZ.append("width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", frameRate=");
        LIZ.append(this.frameRate);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes33.dex */
    public enum CapturePreference {
        AUTO(0),
        MANUAL(1),
        AUTO_PERFORMANCE(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static CapturePreference convertFromInt(int i) {
            return values()[i];
        }

        public static CapturePreference valueOf(String str) {
            return (CapturePreference) V0N.LJJJ(CapturePreference.class, str);
        }

        CapturePreference(int i) {
            this.value = i;
        }
    }

    public VideoCaptureConfig(int i, int i2, int i3) {
        this.capturePreference = CapturePreference.AUTO;
        this.capturePreference = CapturePreference.MANUAL;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
    }
}
