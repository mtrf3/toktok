package com.ss.bytertc.engine;

import X.V0N;
import X.X1D;
import android.util.Pair;

/* loaded from: classes33.dex */
public class VideoStreamDescription {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int maxKbps;
    public int minKbps;
    public Pair<Integer, Integer> videoSize;

    public boolean isValid() {
        Pair<Integer, Integer> pair = this.videoSize;
        if (pair != null && ((Integer) pair.first).intValue() > 0 && ((Integer) this.videoSize.second).intValue() > 0 && this.frameRate > 0) {
            int i = this.maxKbps;
            if (i > 0 && this.minKbps > i) {
                return false;
            }
            return true;
        }
        return false;
    }

    public VideoStreamDescription() {
        this.encodePreference = EncoderPreference.MaintainFramerate;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoStreamDescription{videoSize=");
        LIZ.append(this.videoSize);
        LIZ.append(", frameRate=");
        LIZ.append(this.frameRate);
        LIZ.append(", maxKbps=");
        LIZ.append(this.maxKbps);
        LIZ.append(", minKbps=");
        LIZ.append(this.minKbps);
        LIZ.append(", encodePreference=");
        LIZ.append(this.encodePreference);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes33.dex */
    public enum CodecMode {
        CODEC_MODE_AUTO(0),
        CODEC_MODE_HARDWARE(1),
        CODEC_MODE_SOFTWARE(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static CodecMode convertFromInt(int i) {
            return values()[i];
        }

        public static CodecMode valueOf(String str) {
            return (CodecMode) V0N.LJJJ(CodecMode.class, str);
        }

        CodecMode(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum EncoderPreference {
        Disabled(0),
        MaintainFramerate(1),
        MaintainQuality(2),
        Balance(3);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static EncoderPreference convertFromInt(int i) {
            return values()[i];
        }

        public static EncoderPreference valueOf(String str) {
            return (EncoderPreference) V0N.LJJJ(EncoderPreference.class, str);
        }

        EncoderPreference(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum VideoCodecType {
        CODEC_TYPE_AUTO(0),
        CODEC_TYPE_H264(1),
        CODEC_TYPE_BYTEVC1(2);

        public int value;

        public int getValue() {
            return this.value;
        }

        public static VideoCodecType convertFromInt(int i) {
            return values()[i];
        }

        public static VideoCodecType valueOf(String str) {
            return (VideoCodecType) V0N.LJJJ(VideoCodecType.class, str);
        }

        VideoCodecType(int i) {
            this.value = i;
        }
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5) {
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.minKbps = i5;
    }

    public static VideoStreamDescription create(int i, int i2, int i3, int i4, int i5) {
        return new VideoStreamDescription(i, i2, i3, i4, i5);
    }

    public VideoStreamDescription(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.encodePreference = EncoderPreference.MaintainFramerate;
        this.videoSize = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        this.frameRate = i3;
        this.maxKbps = i4;
        this.minKbps = i5;
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }
}
