package com.bytedance.realx.video;

import X.V0N;
import X.X1D;

/* loaded from: classes33.dex */
public interface VideoEncoder {

    /* loaded from: classes33.dex */
    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    /* loaded from: classes33.dex */
    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public String toString() {
            if (this.on) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("[ ");
                LIZ.append(this.low);
                LIZ.append(", ");
                LIZ.append(this.high);
                LIZ.append(" ]");
                return X1D.LIZIZ(LIZ);
            }
            return "OFF";
        }

        public ScalingSettings() {
        }

        public ScalingSettings(boolean z) {
            this.on = z;
        }

        public ScalingSettings(int i, int i2) {
            this.on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(boolean z, int i, int i2) {
            this.on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }

    VideoCodecStatus encode(VideoFrame videoFrame, boolean z);

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    VideoCodecStatus release();

    VideoCodecStatus requestKeyFrame();

    VideoCodecStatus setPrivateParam(String str, String str2);

    VideoCodecStatus setRateAllocation(int i, int i2);

    /* loaded from: classes33.dex */
    public enum BitrateMode {
        AUTO(0),
        VBR(1),
        CBR(2);

        public int value;

        public static BitrateMode fromValue(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return AUTO;
                    }
                    return CBR;
                }
                return VBR;
            }
            return AUTO;
        }

        public static BitrateMode valueOf(String str) {
            return (BitrateMode) V0N.LJJJ(BitrateMode.class, str);
        }

        BitrateMode(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public static class CodecSpecificInfo {
        public RXVideoCodecStandard codec_standard;

        public CodecSpecificInfo(RXVideoCodecStandard rXVideoCodecStandard) {
            this.codec_standard = rXVideoCodecStandard;
        }
    }

    /* loaded from: classes33.dex */
    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);

        public int value;

        public static ScaleMode fromValue(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return AUTO;
                        }
                        return FIT_WITH_FILLING;
                    }
                    return FIT_WITH_CROPPING;
                }
                return STRETCH;
            }
            return AUTO;
        }

        public static ScaleMode valueOf(String str) {
            return (ScaleMode) V0N.LJJJ(ScaleMode.class, str);
        }

        ScaleMode(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public static class Settings {
        public final BitrateMode bitrateMode;
        public final boolean closeSetProfile;
        public final int height;
        public final int matrixId;
        public final int maxQp;
        public final int minQp;
        public final int primaryId;
        public final int rangeId;
        public final ScaleMode scaleMode;
        public final int targetBps;
        public final int targetFps;
        public final int targetKeyFrameIntervalMs;
        public final int temporalLayerNum;
        public final int transferId;
        public final boolean useSurfaceMode;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z, boolean z2) {
            this.width = i;
            this.height = i2;
            this.scaleMode = ScaleMode.fromValue(i3);
            this.targetBps = i4;
            this.targetFps = i5;
            this.primaryId = i6;
            this.transferId = i7;
            this.matrixId = i8;
            this.rangeId = i9;
            this.maxQp = i10;
            this.minQp = i11;
            this.temporalLayerNum = i12;
            this.bitrateMode = BitrateMode.fromValue(i13);
            this.targetKeyFrameIntervalMs = i14;
            this.closeSetProfile = z;
            this.useSurfaceMode = z2;
        }
    }
}
