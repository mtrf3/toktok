package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioFrameSource {
    AUDIO_FRAME_SOURCE_MIC(0),
    AUDIO_FRAME_SOURCE_PLAYBACK(1),
    AUDIO_FRAME_SOURCE_MIXED(2);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioFrameSource$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource;

        static {
            int[] iArr = new int[AudioFrameSource.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource = iArr;
            try {
                iArr[AudioFrameSource.AUDIO_FRAME_SOURCE_MIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[AudioFrameSource.AUDIO_FRAME_SOURCE_MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioFrameSource[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "kAudioFrameSourceMixed";
            }
            return "kAudioFrameSourcePlayback";
        }
        return "kAudioFrameSourceMic";
    }

    public int value() {
        return this.value;
    }

    public static AudioFrameSource fromId(int i) {
        for (AudioFrameSource audioFrameSource : values()) {
            if (audioFrameSource.value() == i) {
                return audioFrameSource;
            }
        }
        return null;
    }

    public static AudioFrameSource valueOf(String str) {
        return (AudioFrameSource) V0N.LJJJ(AudioFrameSource.class, str);
    }

    AudioFrameSource(int i) {
        this.value = i;
    }
}
