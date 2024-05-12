package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioAlignmentMode {
    AUDIO_ALIGNMENT_MODE_OFF(0),
    AUDIO_ALIGNMENT_MODE_AUDIOMIXING(1);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioAlignmentMode$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode;

        static {
            int[] iArr = new int[AudioAlignmentMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode = iArr;
            try {
                iArr[AudioAlignmentMode.AUDIO_ALIGNMENT_MODE_OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode[AudioAlignmentMode.AUDIO_ALIGNMENT_MODE_AUDIOMIXING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioAlignmentMode[ordinal()];
        if (i == 1 || i != 2) {
            return "kAudioAlignmentModeOff";
        }
        return "kAudioAlignmentModeAudioMixing";
    }

    public int value() {
        return this.value;
    }

    public static AudioAlignmentMode fromId(int i) {
        for (AudioAlignmentMode audioAlignmentMode : values()) {
            if (audioAlignmentMode.value() == i) {
                return audioAlignmentMode;
            }
        }
        return null;
    }

    public static AudioAlignmentMode valueOf(String str) {
        return (AudioAlignmentMode) V0N.LJJJ(AudioAlignmentMode.class, str);
    }

    AudioAlignmentMode(int i) {
        this.value = i;
    }
}
