package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioPropertiesMode {
    AUDIO_PROPERTIES_MODE_MICROPHONE(0),
    AUDIO_PROPERTIES_MODE_AUDIOMIXING(1);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioPropertiesMode$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode;

        static {
            int[] iArr = new int[AudioPropertiesMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode = iArr;
            try {
                iArr[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_MICROPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[AudioPropertiesMode.AUDIO_PROPERTIES_MODE_AUDIOMIXING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioPropertiesMode[ordinal()];
        if (i == 1 || i != 2) {
            return "AUDIO_PROPERTIES_MODE_MICROPHONE";
        }
        return "AUDIO_PROPERTIES_MODE_AUDIOMIXING";
    }

    public int value() {
        return this.value;
    }

    public static AudioPropertiesMode fromId(int i) {
        for (AudioPropertiesMode audioPropertiesMode : values()) {
            if (audioPropertiesMode.value() == i) {
                return audioPropertiesMode;
            }
        }
        return null;
    }

    public static AudioPropertiesMode valueOf(String str) {
        return (AudioPropertiesMode) V0N.LJJJ(AudioPropertiesMode.class, str);
    }

    AudioPropertiesMode(int i) {
        this.value = i;
    }
}
