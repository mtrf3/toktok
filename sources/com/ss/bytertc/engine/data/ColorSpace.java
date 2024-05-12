package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum ColorSpace {
    UNKNOWN(0),
    BT601_LIMITED_RANGE(1),
    BT601_FULL_RANGE(2),
    BT709_LIMITED_RANGE(3),
    BT709_FULL_RANGE(4);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.ColorSpace$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$ColorSpace;

        static {
            int[] iArr = new int[ColorSpace.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$ColorSpace = iArr;
            try {
                iArr[ColorSpace.BT601_LIMITED_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT601_FULL_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT709_LIMITED_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ColorSpace.BT709_FULL_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$ColorSpace[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "kColorSpaceUnknown";
                    }
                    return "kColorSpaceYCbCrBT709FullRange";
                }
                return "kColorSpaceYCbCrBT709LimitedRange";
            }
            return "kColorSpaceYCbCrBT601FullRange";
        }
        return "kColorSpaceYCbCrBT601LimitedRange";
    }

    public int value() {
        return this.value;
    }

    public static ColorSpace fromId(int i) {
        for (ColorSpace colorSpace : values()) {
            if (colorSpace.value() == i) {
                return colorSpace;
            }
        }
        return null;
    }

    public static ColorSpace valueOf(String str) {
        return (ColorSpace) V0N.LJJJ(ColorSpace.class, str);
    }

    ColorSpace(int i) {
        this.value = i;
    }
}
