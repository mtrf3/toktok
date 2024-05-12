package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum EffectType {
    EffectType_ForPreviewAndEdit(0),
    EffectType_ForPreviewOnly,
    EffectType_ForEditOnly,
    EffectType_ForProjectSave;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static EffectType swigToEnum(int i) {
        EffectType[] effectTypeArr = (EffectType[]) EffectType.class.getEnumConstants();
        if (i < effectTypeArr.length && i >= 0) {
            EffectType effectType = effectTypeArr[i];
            if (effectType.swigValue == i) {
                return effectType;
            }
        }
        for (EffectType effectType2 : effectTypeArr) {
            if (effectType2.swigValue == i) {
                return effectType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(EffectType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static EffectType valueOf(String str) {
        return (EffectType) V0N.LJJJ(EffectType.class, str);
    }

    EffectType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    EffectType(EffectType effectType) {
        int i = effectType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    EffectType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
