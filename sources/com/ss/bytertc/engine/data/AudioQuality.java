package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioQuality {
    AUDIO_QUALITY_LOW(0),
    AUDIO_QUALITY_MEDIUM(1),
    AUDIO_QUALITY_HIGH(2),
    AUDIO_QUALITY_ULTRA_HIGH(3);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioQuality$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioQuality;

        static {
            int[] iArr = new int[AudioQuality.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioQuality = iArr;
            try {
                iArr[AudioQuality.AUDIO_QUALITY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioQuality[AudioQuality.AUDIO_QUALITY_ULTRA_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioQuality[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "kAudioQualityUltraHigh";
                }
                return "kAudioQualityHigh";
            }
            return "kAudioQualityMedium";
        }
        return "kAudioQualityLow";
    }

    public int value() {
        return this.value;
    }

    public static AudioQuality fromId(int i) {
        for (AudioQuality audioQuality : values()) {
            if (audioQuality.value() == i) {
                return audioQuality;
            }
        }
        return null;
    }

    public static AudioQuality valueOf(String str) {
        return (AudioQuality) V0N.LJJJ(AudioQuality.class, str);
    }

    AudioQuality(int i) {
        this.value = i;
    }
}
