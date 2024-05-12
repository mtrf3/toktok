package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioTrackType {
    ORIGINAL(1),
    ACCOMPANY(2);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.AudioTrackType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType;

        static {
            int[] iArr = new int[AudioTrackType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType = iArr;
            try {
                iArr[AudioTrackType.ACCOMPANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType[AudioTrackType.ORIGINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$AudioTrackType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "AUDIO_TRACK_TYPE_ORIGINAL";
        }
        return "AUDIO_TRACK_TYPE_ACCOMPANY";
    }

    public int value() {
        return this.value;
    }

    public static AudioTrackType fromId(int i) {
        for (AudioTrackType audioTrackType : values()) {
            if (audioTrackType.value() == i) {
                return audioTrackType;
            }
        }
        return null;
    }

    public static AudioTrackType valueOf(String str) {
        return (AudioTrackType) V0N.LJJJ(AudioTrackType.class, str);
    }

    AudioTrackType(int i) {
        this.value = i;
    }
}
