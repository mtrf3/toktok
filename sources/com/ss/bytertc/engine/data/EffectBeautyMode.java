package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum EffectBeautyMode {
    WHITE(0),
    SMOOTH(1),
    SHARPEN(2),
    CLEAR(3);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == WHITE) {
            return "kEffectBeautyWhiteMode";
        }
        if (this == SMOOTH) {
            return "kEffectBeautySmoothMode";
        }
        if (this == SHARPEN) {
            return "kEffectBeautySharpenMode";
        }
        if (this == CLEAR) {
            return "kEffectBeautyClearMode";
        }
        return "";
    }

    public int value() {
        return this.value;
    }

    public static EffectBeautyMode fromId(int i) {
        for (EffectBeautyMode effectBeautyMode : values()) {
            if (effectBeautyMode.value() == i) {
                return effectBeautyMode;
            }
        }
        return null;
    }

    public static EffectBeautyMode valueOf(String str) {
        return (EffectBeautyMode) V0N.LJJJ(EffectBeautyMode.class, str);
    }

    EffectBeautyMode(int i) {
        this.value = i;
    }
}
