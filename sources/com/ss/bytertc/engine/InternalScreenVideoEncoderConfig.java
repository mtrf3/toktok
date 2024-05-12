package com.ss.bytertc.engine;

import X.V0N;
import com.ss.bytertc.engine.ScreenVideoEncoderConfig;

/* loaded from: classes33.dex */
public class InternalScreenVideoEncoderConfig {
    public InternalScreenVideoEncoderPreference encodePreference;
    public int frameRate;
    public int height;
    public int maxBitrate;
    public int minBitrate;
    public int width;

    /* renamed from: com.ss.bytertc.engine.InternalScreenVideoEncoderConfig$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference;

        static {
            int[] iArr = new int[ScreenVideoEncoderConfig.EncoderPreference.values().length];
            $SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference = iArr;
            try {
                iArr[ScreenVideoEncoderConfig.EncoderPreference.MaintainFramerate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference[ScreenVideoEncoderConfig.EncoderPreference.MaintainQuality.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes33.dex */
    public enum InternalScreenVideoEncoderPreference {
        SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE(1),
        SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY(2);

        public int value;

        public int getIntValue() {
            return this.value;
        }

        public static InternalScreenVideoEncoderPreference valueOf(String str) {
            return (InternalScreenVideoEncoderPreference) V0N.LJJJ(InternalScreenVideoEncoderPreference.class, str);
        }

        InternalScreenVideoEncoderPreference(int i) {
            this.value = i;
        }
    }

    public InternalScreenVideoEncoderPreference getEncoderPreference() {
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

    public InternalScreenVideoEncoderConfig(ScreenVideoEncoderConfig screenVideoEncoderConfig) {
        this.encodePreference = InternalScreenVideoEncoderPreference.SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        this.width = screenVideoEncoderConfig.width;
        this.height = screenVideoEncoderConfig.height;
        this.frameRate = screenVideoEncoderConfig.frameRate;
        this.maxBitrate = screenVideoEncoderConfig.maxBitrate;
        this.minBitrate = screenVideoEncoderConfig.minBitrate;
        this.encodePreference = ConvertEnumValue(screenVideoEncoderConfig.encodePreference);
    }

    private InternalScreenVideoEncoderPreference ConvertEnumValue(ScreenVideoEncoderConfig.EncoderPreference encoderPreference) {
        InternalScreenVideoEncoderPreference internalScreenVideoEncoderPreference = InternalScreenVideoEncoderPreference.SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_FRAMERATE;
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$ScreenVideoEncoderConfig$EncoderPreference[encoderPreference.ordinal()];
        if (i == 1 || i != 2) {
            return internalScreenVideoEncoderPreference;
        }
        return InternalScreenVideoEncoderPreference.SCREEN_VIDEO_ENCODER_PREFERENCE_MAINTAIN_QUALITY;
    }
}
