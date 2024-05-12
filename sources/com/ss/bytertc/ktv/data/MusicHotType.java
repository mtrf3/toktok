package com.ss.bytertc.ktv.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MusicHotType {
    CONTENT_CENTER(1),
    PROJECT(2);

    public int value;

    /* renamed from: com.ss.bytertc.ktv.data.MusicHotType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$ktv$data$MusicHotType;

        static {
            int[] iArr = new int[MusicHotType.values().length];
            $SwitchMap$com$ss$bytertc$ktv$data$MusicHotType = iArr;
            try {
                iArr[MusicHotType.CONTENT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$ktv$data$MusicHotType[MusicHotType.PROJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$ktv$data$MusicHotType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "PROJECT_RANK";
        }
        return "CONTENT_CENTER_RANK";
    }

    public int value() {
        return this.value;
    }

    public static MusicHotType fromId(int i) {
        for (MusicHotType musicHotType : values()) {
            if (musicHotType.value() == i) {
                return musicHotType;
            }
        }
        return null;
    }

    public static MusicHotType valueOf(String str) {
        return (MusicHotType) V0N.LJJJ(MusicHotType.class, str);
    }

    MusicHotType(int i) {
        this.value = i;
    }
}
