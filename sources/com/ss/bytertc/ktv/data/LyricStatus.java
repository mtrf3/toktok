package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum LyricStatus {
    NONE(0),
    KRC(1),
    LRC(2),
    KRC_AND_LRC(4);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.LyricStatus$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus;

        static {
            int[] iArr = new int[LyricStatus.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus = iArr;
            try {
                iArr[LyricStatus.KRC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[LyricStatus.LRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[LyricStatus.KRC_AND_LRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[LyricStatus.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$LyricStatus[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "LYRIC_STATUS_NONE";
                }
                return "LYRIC_STATUS_KRC_AND_LRC";
            }
            return "LYRIC_STATUS_LRC";
        }
        return "LYRIC_STATUS_KRC";
    }

    public int value() {
        return this.value;
    }

    public static LyricStatus fromId(int i) {
        for (LyricStatus lyricStatus : values()) {
            if (lyricStatus.value() == i) {
                return lyricStatus;
            }
        }
        return null;
    }

    public static LyricStatus valueOf(String str) {
        return (LyricStatus) V0N.LJJJ(LyricStatus.class, str);
    }

    LyricStatus(int i) {
        this.value = i;
    }
}
