package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioProcessorMethod {
    AUDIO_FRAME_PROCESSOR_RECORD(0),
    AUDIO_FRAME_PROCESSOR_PLAYBACK(1),
    AUDIO_FRAME_PROCESSOR_REMOTE_USER(2),
    AUDIO_FRAME_PROCESSOR_EAR_MONITOR(3),
    AUDIO_FRAME_PROCESSOR_SCREEN(4);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioProcessorMethod$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod;

        static {
            int[] iArr = new int[AudioProcessorMethod.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod = iArr;
            try {
                iArr[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_RECORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_PLAYBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_REMOTE_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_EAR_MONITOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[AudioProcessorMethod.AUDIO_FRAME_PROCESSOR_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioProcessorMethod[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "AUDIO_FRAME_PROCESSOR_SCREEN";
                    }
                    return "AUDIO_FRAME_PROCESSOR_EAR_MONITOR";
                }
                return "AUDIO_FRAME_PROCESSOR_REMOTE_USER";
            }
            return "AUDIO_FRAME_PROCESSOR_PLAYBACK";
        }
        return "AUDIO_FRAME_PROCESSOR_RECORD";
    }

    public int value() {
        return this.value;
    }

    public static AudioProcessorMethod fromId(int i) {
        for (AudioProcessorMethod audioProcessorMethod : values()) {
            if (audioProcessorMethod.value() == i) {
                return audioProcessorMethod;
            }
        }
        return null;
    }

    public static AudioProcessorMethod valueOf(String str) {
        return (AudioProcessorMethod) V0N.LJJJ(AudioProcessorMethod.class, str);
    }

    AudioProcessorMethod(int i) {
        this.value = i;
    }
}
