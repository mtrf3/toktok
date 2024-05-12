package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioPlayType {
    LOCAL(0),
    REMOTE(1),
    LOCAL_AND_REMOTE(2);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.AudioPlayType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType;

        static {
            int[] iArr = new int[AudioPlayType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType = iArr;
            try {
                iArr[AudioPlayType.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType[AudioPlayType.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType[AudioPlayType.LOCAL_AND_REMOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$AudioPlayType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "AUDIO_PLAY_TYPE_LOCAL_AND_REMOTE";
            }
            return "AUDIO_PLAY_TYPE_REMOTE";
        }
        return "AUDIO_PLAY_TYPE_LOCAL";
    }

    public int value() {
        return this.value;
    }

    public static AudioPlayType fromId(int i) {
        for (AudioPlayType audioPlayType : values()) {
            if (audioPlayType.value() == i) {
                return audioPlayType;
            }
        }
        return null;
    }

    public static AudioPlayType valueOf(String str) {
        return (AudioPlayType) V0N.LJJJ(AudioPlayType.class, str);
    }

    AudioPlayType(int i) {
        this.value = i;
    }
}
