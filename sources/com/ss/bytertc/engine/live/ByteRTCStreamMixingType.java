package com.ss.bytertc.engine.live;

import X.V0N;

/* loaded from: classes33.dex */
public enum ByteRTCStreamMixingType {
    STREAM_MIXING_BY_SERVER(0),
    STREAM_MIXING_BY_CLIENT(1);

    public int value;

    /* renamed from: com.ss.bytertc.engine.live.ByteRTCStreamMixingType$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType;

        static {
            int[] iArr = new int[ByteRTCStreamMixingType.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType = iArr;
            try {
                iArr[ByteRTCStreamMixingType.STREAM_MIXING_BY_SERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType[ByteRTCStreamMixingType.STREAM_MIXING_BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$ByteRTCStreamMixingType[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return "STREAM_MIXING_BY_CLIENT";
        }
        return "STREAM_MIXING_BY_SERVER";
    }

    public int value() {
        return this.value;
    }

    public static ByteRTCStreamMixingType fromId(int i) {
        for (ByteRTCStreamMixingType byteRTCStreamMixingType : values()) {
            if (byteRTCStreamMixingType.value() == i) {
                return byteRTCStreamMixingType;
            }
        }
        return null;
    }

    public static ByteRTCStreamMixingType valueOf(String str) {
        return (ByteRTCStreamMixingType) V0N.LJJJ(ByteRTCStreamMixingType.class, str);
    }

    ByteRTCStreamMixingType(int i) {
        this.value = i;
    }
}
