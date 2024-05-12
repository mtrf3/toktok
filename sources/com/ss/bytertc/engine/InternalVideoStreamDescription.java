package com.ss.bytertc.engine;

import X.V0N;
import com.ss.bytertc.engine.VideoStreamDescription;

/* loaded from: classes33.dex */
public class InternalVideoStreamDescription {
    public VideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxKbps;
    public int minKbps;
    public int width;

    /* renamed from: com.ss.bytertc.engine.InternalVideoStreamDescription$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType;

        static {
            int[] iArr = new int[VideoStreamDescription.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference = iArr;
            try {
                iArr[VideoStreamDescription.EncoderPreference.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.MaintainFramerate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.MaintainQuality.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[VideoStreamDescription.EncoderPreference.Balance.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[VideoStreamDescription.VideoCodecType.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType = iArr2;
            try {
                iArr2[VideoStreamDescription.VideoCodecType.CODEC_TYPE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[VideoStreamDescription.VideoCodecType.CODEC_TYPE_H264.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[VideoStreamDescription.VideoCodecType.CODEC_TYPE_BYTEVC1.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[VideoStreamDescription.CodecMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode = iArr3;
            try {
                iArr3[VideoStreamDescription.CodecMode.CODEC_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[VideoStreamDescription.CodecMode.CODEC_MODE_HARDWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[VideoStreamDescription.CodecMode.CODEC_MODE_SOFTWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes33.dex */
    public enum VideoCodecMode {
        VIDEO_CODEC_MODE_AUTO(0),
        VIDEO_CODEC_MODE_HARDWARE(1),
        VIDEO_CODEC_MODE_SOFTWARE(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static VideoCodecMode valueOf(String str) {
            return (VideoCodecMode) V0N.LJJJ(VideoCodecMode.class, str);
        }

        VideoCodecMode(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum VideoCodecType {
        VIDEO_CODEC_TYPE_AUTO(0),
        VIDEO_CODEC_TYPE_H264(1),
        VIDEO_CODEC_TYPE_BYTEVC1(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static VideoCodecType valueOf(String str) {
            return (VideoCodecType) V0N.LJJJ(VideoCodecType.class, str);
        }

        VideoCodecType(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes33.dex */
    public enum VideoEncoderPreference {
        VIDEO_ENCODER_PREFERENCE_DISABLED(0),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2),
        VIDEO_ENCODER_PREFERENCE_BALANCE(3);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static VideoEncoderPreference valueOf(String str) {
            return (VideoEncoderPreference) V0N.LJJJ(VideoEncoderPreference.class, str);
        }

        VideoEncoderPreference(int i) {
            this.value = i;
        }
    }

    public VideoEncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMaxKBps() {
        return this.maxKbps;
    }

    public int getMinKBps() {
        return this.minKbps;
    }

    public int getWidth() {
        return this.width;
    }

    public InternalVideoStreamDescription(VideoStreamDescription videoStreamDescription) {
        this.encodePreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = ((Integer) videoStreamDescription.videoSize.first).intValue();
        this.height = ((Integer) videoStreamDescription.videoSize.second).intValue();
        this.frameRate = videoStreamDescription.frameRate;
        this.maxKbps = videoStreamDescription.maxKbps;
        this.minKbps = videoStreamDescription.minKbps;
        this.encodePreference = ConvertEnumValue(videoStreamDescription.encodePreference);
    }

    private VideoEncoderPreference ConvertEnumValue(VideoStreamDescription.EncoderPreference encoderPreference) {
        VideoEncoderPreference videoEncoderPreference = VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$EncoderPreference[encoderPreference.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return videoEncoderPreference;
                    }
                    return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_BALANCE;
                }
                return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
            }
            return videoEncoderPreference;
        }
        return VideoEncoderPreference.VIDEO_ENCODER_PREFERENCE_DISABLED;
    }

    private VideoCodecMode ConvertEnumValue(VideoStreamDescription.CodecMode codecMode) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$CodecMode[codecMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
                }
                return VideoCodecMode.VIDEO_CODEC_MODE_SOFTWARE;
            }
            return VideoCodecMode.VIDEO_CODEC_MODE_HARDWARE;
        }
        return VideoCodecMode.VIDEO_CODEC_MODE_AUTO;
    }

    private VideoCodecType ConvertEnumValue(VideoStreamDescription.VideoCodecType videoCodecType) {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$VideoStreamDescription$VideoCodecType[videoCodecType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
                }
                return VideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1;
            }
            return VideoCodecType.VIDEO_CODEC_TYPE_H264;
        }
        return VideoCodecType.VIDEO_CODEC_TYPE_AUTO;
    }
}
