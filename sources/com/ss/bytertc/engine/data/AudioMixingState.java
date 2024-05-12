package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioMixingState {
    AUDIO_MIXING_STATE_PRELOADED(0),
    AUDIO_MIXING_STATE_PLAYING(1),
    AUDIO_MIXING_STATE_PAUSED(2),
    AUDIO_MIXING_STATE_STOPPED(3),
    AUDIO_MIXING_STATE_FAILED(4),
    AUDIO_MIXING_STATE_FINISHED(5),
    AUDIO_MIXING_STATE_PCM_ENABLED(6),
    AUDIO_MIXING_STATE_PCM_DISABLED(7);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioMixingState$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState;

        static {
            int[] iArr = new int[AudioMixingState.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState = iArr;
            try {
                iArr[AudioMixingState.AUDIO_MIXING_STATE_PRELOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[AudioMixingState.AUDIO_MIXING_STATE_PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[AudioMixingState.AUDIO_MIXING_STATE_PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[AudioMixingState.AUDIO_MIXING_STATE_STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[AudioMixingState.AUDIO_MIXING_STATE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[AudioMixingState.AUDIO_MIXING_STATE_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[AudioMixingState.AUDIO_MIXING_STATE_PCM_ENABLED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[AudioMixingState.AUDIO_MIXING_STATE_PCM_DISABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioMixingState[ordinal()]) {
            case 1:
                return "AUDIO_MIXING_STATE_PRELOADED";
            case 2:
                return "AUDIO_MIXING_STATE_PLAYING";
            case 3:
                return "AUDIO_MIXING_STATE_PAUSED";
            case 4:
                return "AUDIO_MIXING_STATE_STOPPED";
            case 5:
                return "AUDIO_MIXING_STATE_FAILED";
            case 6:
                return "AUDIO_MIXING_STATE_FINISHED";
            case 7:
                return "AUDIO_MIXING_STATE_PCM_ENABLED";
            case 8:
                return "AUDIO_MIXING_STATE_PCM_DISABLED";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static AudioMixingState fromId(int i) {
        for (AudioMixingState audioMixingState : values()) {
            if (audioMixingState.value() == i) {
                return audioMixingState;
            }
        }
        return null;
    }

    public static AudioMixingState valueOf(String str) {
        return (AudioMixingState) V0N.LJJJ(AudioMixingState.class, str);
    }

    AudioMixingState(int i) {
        this.value = i;
    }
}
