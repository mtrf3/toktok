package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioMixingDualMonoMode {
    AUDIO_MIXING_DUAL_MONO_MODE_AUTO(0),
    AUDIO_MIXING_DUAL_MONO_MODE_L(1),
    AUDIO_MIXING_DUAL_MONO_MODE_R(2),
    AUDIO_MIXING_DUAL_MONO_MODE_MIX(3);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioMixingDualMonoMode$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode;

        static {
            int[] iArr = new int[AudioMixingDualMonoMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode = iArr;
            try {
                iArr[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_L.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_R.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[AudioMixingDualMonoMode.AUDIO_MIXING_DUAL_MONO_MODE_MIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingDualMonoMode[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "AUDIO_MIXING_DUAL_MONO_MODE_MIX";
                }
                return "AUDIO_MIXING_DUAL_MONO_MODE_R";
            }
            return "AUDIO_MIXING_DUAL_MONO_MODE_L";
        }
        return "AUDIO_MIXING_DUAL_MONO_MODE_AUTO";
    }

    public int value() {
        return this.value;
    }

    public static AudioMixingDualMonoMode fromId(int i) {
        for (AudioMixingDualMonoMode audioMixingDualMonoMode : values()) {
            if (audioMixingDualMonoMode.value() == i) {
                return audioMixingDualMonoMode;
            }
        }
        return null;
    }

    public static AudioMixingDualMonoMode valueOf(String str) {
        return (AudioMixingDualMonoMode) V0N.LJJJ(AudioMixingDualMonoMode.class, str);
    }

    AudioMixingDualMonoMode(int i) {
        this.value = i;
    }
}
