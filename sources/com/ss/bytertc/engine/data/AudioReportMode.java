package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioReportMode {
    AUDIO_REPORT_MODE_NORMAL(0),
    AUDIO_REPORT_MODE_DISCONNECT(1),
    AUDIO_REPORT_MODE_RESET(2);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioReportMode$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode;

        static {
            int[] iArr = new int[AudioReportMode.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode = iArr;
            try {
                iArr[AudioReportMode.AUDIO_REPORT_MODE_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[AudioReportMode.AUDIO_REPORT_MODE_DISCONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[AudioReportMode.AUDIO_REPORT_MODE_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioReportMode[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "AUDIO_REPORT_MODE_RESET";
            }
            return "AUDIO_REPORT_MODE_DISCONNECT";
        }
        return "AUDIO_REPORT_MODE_NORMAL";
    }

    public int value() {
        return this.value;
    }

    public static AudioReportMode fromId(int i) {
        for (AudioReportMode audioReportMode : values()) {
            if (audioReportMode.value() == i) {
                return audioReportMode;
            }
        }
        return null;
    }

    public static AudioReportMode valueOf(String str) {
        return (AudioReportMode) V0N.LJJJ(AudioReportMode.class, str);
    }

    AudioReportMode(int i) {
        this.value = i;
    }
}
