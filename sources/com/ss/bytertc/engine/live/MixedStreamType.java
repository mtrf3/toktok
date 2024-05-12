package com.ss.bytertc.engine.live;

import X.V0N;

/* loaded from: classes33.dex */
public enum MixedStreamType {
    MIXED_STREAM_TYPE_BY_SERVER(0),
    MIXED_STREAM_TYPE_BY_CLIENT(1);

    public int value;

    /* renamed from: com.ss.bytertc.engine.live.MixedStreamType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType;

        static {
            int[] iArr = new int[MixedStreamType.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType = iArr;
            try {
                iArr[MixedStreamType.MIXED_STREAM_TYPE_BY_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$MixedStreamType[MixedStreamType.MIXED_STREAM_TYPE_BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$MixedStreamType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "MIXED_STREAM_TYPE_BY_CLIENT";
        }
        return "MIXED_STREAM_TYPE_BY_SERVER";
    }

    public int value() {
        return this.value;
    }

    public static MixedStreamType fromId(int i) {
        for (MixedStreamType mixedStreamType : values()) {
            if (mixedStreamType.value() == i) {
                return mixedStreamType;
            }
        }
        return null;
    }

    public static MixedStreamType valueOf(String str) {
        return (MixedStreamType) V0N.LJJJ(MixedStreamType.class, str);
    }

    MixedStreamType(int i) {
        this.value = i;
    }
}
