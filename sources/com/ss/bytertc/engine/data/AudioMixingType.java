package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioMixingType {
    AUDIO_MIXING_TYPE_PLAYOUT(0),
    AUDIO_MIXING_TYPE_PUBLISH(1),
    AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH(2);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioMixingType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType;

        static {
            int[] iArr = new int[AudioMixingType.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType = iArr;
            try {
                iArr[AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType[AudioMixingType.AUDIO_MIXING_TYPE_PUBLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingType[AudioMixingType.AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "AUDIO_MIXING_TYPE_PLAYOUT_AND_PUBLISH";
            }
            return "AUDIO_MIXING_TYPE_PUBLISH";
        }
        return "AUDIO_MIXING_TYPE_PLAYOUT";
    }

    public int value() {
        return this.value;
    }

    public static AudioMixingType fromId(int i) {
        for (AudioMixingType audioMixingType : values()) {
            if (audioMixingType.value() == i) {
                return audioMixingType;
            }
        }
        return null;
    }

    public static AudioMixingType valueOf(String str) {
        return (AudioMixingType) V0N.LJJJ(AudioMixingType.class, str);
    }

    AudioMixingType(int i) {
        this.value = i;
    }
}
