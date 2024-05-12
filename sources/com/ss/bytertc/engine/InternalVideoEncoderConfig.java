package com.ss.bytertc.engine;

import X.V0N;
import com.ss.bytertc.engine.VideoEncoderConfig;

/* loaded from: classes33.dex */
public class InternalVideoEncoderConfig {
    public InternalVideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    /* renamed from: com.ss.bytertc.engine.InternalVideoEncoderConfig$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType;

        static {
            int[] iArr = new int[VideoEncoderConfig.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference = iArr;
            try {
                iArr[VideoEncoderConfig.EncoderPreference.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.MAINTAIN_QUALITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[VideoEncoderConfig.EncoderPreference.BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[VideoEncoderConfig.VideoCodecType.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType = iArr2;
            try {
                iArr2[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[VideoEncoderConfig.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[VideoEncoderConfig.CodecMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode = iArr3;
            try {
                iArr3[VideoEncoderConfig.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[VideoEncoderConfig.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes33.dex */
    public enum InternalVideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalVideoCodecMode valueOf(String str) {
            return (InternalVideoCodecMode) V0N.LJJJ(InternalVideoCodecMode.class, str);
        }

        InternalVideoCodecMode(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum InternalVideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalVideoCodecType valueOf(String str) {
            return (InternalVideoCodecType) V0N.LJJJ(InternalVideoCodecType.class, str);
        }

        InternalVideoCodecType(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum InternalVideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalVideoEncoderPreference valueOf(String str) {
            return (InternalVideoEncoderPreference) V0N.LJJJ(InternalVideoEncoderPreference.class, str);
        }

        InternalVideoEncoderPreference(int i) {
            this.value = i;
        }
    }

    public InternalVideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxKBps() {
        return this.maxBitrate;
    }

    public int getMinKBps() {
        return this.minBitrate;
    }

    public int getWidth() {
        return this.width;
    }

    public InternalVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        this.encodePreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = videoEncoderConfig.width;
        this.height = videoEncoderConfig.height;
        this.frameRate = videoEncoderConfig.frameRate;
        this.maxBitrate = videoEncoderConfig.maxBitrate;
        this.minBitrate = videoEncoderConfig.minBitrate;
        this.encodePreference = ConvertEnumValue(videoEncoderConfig.encodePreference);
    }

    private InternalVideoEncoderPreference ConvertEnumValue(VideoEncoderConfig.EncoderPreference encoderPreference) {
        InternalVideoEncoderPreference internalVideoEncoderPreference = InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$EncoderPreference[encoderPreference.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return internalVideoEncoderPreference;
                    }
                    return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
                }
                return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
            }
            return internalVideoEncoderPreference;
        }
        return InternalVideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
    }

    private InternalVideoCodecMode ConvertEnumValue(VideoEncoderConfig.CodecMode codecMode) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$CodecMode[codecMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
                }
                return InternalVideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
            }
            return InternalVideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
        }
        return InternalVideoCodecMode.VIDEO_CODEC_MODE_AUTO;
    }

    private InternalVideoCodecType ConvertEnumValue(VideoEncoderConfig.VideoCodecType videoCodecType) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoEncoderConfig$VideoCodecType[videoCodecType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
                }
                return InternalVideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
            }
            return InternalVideoCodecType.VIDEO_CODEC_TYPE_H264;
        }
        return InternalVideoCodecType.VIDEO_CODEC_TYPE_AUTO;
    }
}
