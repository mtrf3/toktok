package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MusicFilterType {
    NONE(0),
    WITHOUT_LYRIC(1),
    UNSUPPORTED_SCORE(2),
    UNSUPPORTED_ACCOMPANY(4),
    UNSUPPORTED_CLIMAX(8);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.MusicFilterType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType;

        static {
            int[] iArr = new int[MusicFilterType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType = iArr;
            try {
                iArr[MusicFilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.WITHOUT_LYRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_ACCOMPANY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[MusicFilterType.UNSUPPORTED_CLIMAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$MusicFilterType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "MUSIC_FILTER_TYPE_UNSUPPORTED_CLIMAX";
                    }
                    return "MUSIC_FILTER_TYPE_UNSUPPORTED_ACCOMPANY";
                }
                return "MUSIC_FILTER_TYPE_UNSUPPORTED_SCORE";
            }
            return "MUSIC_FILTER_TYPE_WITHOUT_LYRIC";
        }
        return "MUSIC_FILTER_TYPE_NONE";
    }

    public int value() {
        return this.value;
    }

    public static MusicFilterType fromId(int i) {
        for (MusicFilterType musicFilterType : values()) {
            if (musicFilterType.value() == i) {
                return musicFilterType;
            }
        }
        return null;
    }

    public static MusicFilterType valueOf(String str) {
        return (MusicFilterType) V0N.LJJJ(MusicFilterType.class, str);
    }

    MusicFilterType(int i) {
        this.value = i;
    }
}
