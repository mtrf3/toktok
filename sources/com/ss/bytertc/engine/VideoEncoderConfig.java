package com.ss.bytertc.engine;

import X.V0N;
import X.X1D;

/* loaded from: classes33.dex */
public class VideoEncoderConfig {
    public EncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    public boolean isValid() {
        if (this.width > 0 && this.height > 0 && this.frameRate > 0) {
            int i = this.maxBitrate;
            if (i > 0 && i < this.minBitrate) {
                return false;
            }
            return true;
        }
        return false;
    }

    public VideoEncoderConfig() {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoEncoderConfig{width=");
        LIZ.append(this.width);
        LIZ.append("height=");
        LIZ.append(this.height);
        LIZ.append(", frameRate=");
        LIZ.append(this.frameRate);
        LIZ.append(", maxBitrate=");
        LIZ.append(this.maxBitrate);
        LIZ.append(", minBitrate=");
        LIZ.append(this.minBitrate);
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
        DISABLED(0),
        MAINTAIN_FRAMERATE(1),
        MAINTAIN_QUALITY(2),
        BALANCE(3);

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

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5) {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
    }

    public static VideoEncoderConfig create(int i, int i2, int i3, int i4, int i5) {
        return new VideoEncoderConfig(i, i2, i3, i4, i5);
    }

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.maxBitrate = -1;
        this.encodePreference = EncoderPreference.MAINTAIN_FRAMERATE;
        this.width = i;
        this.height = i2;
        this.frameRate = i3;
        this.maxBitrate = i4;
        this.minBitrate = i5;
        this.encodePreference = EncoderPreference.convertFromInt(i8);
    }
}
