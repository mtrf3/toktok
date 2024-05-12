package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum ChangeFrom {
    None(0),
    ChangeFromNormal,
    ChangeFromInit,
    ChangeFromUndo,
    ChangeFromRedo,
    ChangeFromContinuous,
    ChangeFromEffect;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ChangeFrom swigToEnum(int i) {
        ChangeFrom[] changeFromArr = (ChangeFrom[]) ChangeFrom.class.getEnumConstants();
        if (i < changeFromArr.length && i >= 0) {
            ChangeFrom changeFrom = changeFromArr[i];
            if (changeFrom.swigValue == i) {
                return changeFrom;
            }
        }
        for (ChangeFrom changeFrom2 : changeFromArr) {
            if (changeFrom2.swigValue == i) {
                return changeFrom2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(ChangeFrom.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static ChangeFrom valueOf(String str) {
        return (ChangeFrom) V0N.LJJJ(ChangeFrom.class, str);
    }

    ChangeFrom() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ChangeFrom(ChangeFrom changeFrom) {
        int i = changeFrom.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ChangeFrom(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
