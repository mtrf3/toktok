package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioChannel {
    AUDIO_CHANNEL_AUTO(-1),
    AUDIO_CHANNEL_MONO(1),
    AUDIO_CHANNEL_STEREO(2);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioChannel$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioChannel;

        static {
            int[] iArr = new int[AudioChannel.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioChannel = iArr;
            try {
                iArr[AudioChannel.AUDIO_CHANNEL_AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_MONO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioChannel[AudioChannel.AUDIO_CHANNEL_STEREO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioChannel[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "kAudioChannelUnknown";
                }
                return "kAudioChannelStereo";
            }
            return "kAudioChannelMono";
        }
        return "kAudioChannelAuto";
    }

    public int value() {
        return this.value;
    }

    public static AudioChannel fromId(int i) {
        for (AudioChannel audioChannel : values()) {
            if (audioChannel.value() == i) {
                return audioChannel;
            }
        }
        return null;
    }

    public static AudioChannel valueOf(String str) {
        return (AudioChannel) V0N.LJJJ(AudioChannel.class, str);
    }

    AudioChannel(int i) {
        this.value = i;
    }
}
