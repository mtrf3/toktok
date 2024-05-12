package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum ApplyFrom {
    ApplyFromManualOp,
    ApplyFromCreate,
    ApplyFromClone,
    ApplyFromLoad,
    ApplyFromUndo,
    ApplyFromRedo,
    ApplyFromReconstruct;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ApplyFrom swigToEnum(int i) {
        ApplyFrom[] applyFromArr = (ApplyFrom[]) ApplyFrom.class.getEnumConstants();
        if (i < applyFromArr.length && i >= 0) {
            ApplyFrom applyFrom = applyFromArr[i];
            if (applyFrom.swigValue == i) {
                return applyFrom;
            }
        }
        for (ApplyFrom applyFrom2 : applyFromArr) {
            if (applyFrom2.swigValue == i) {
                return applyFrom2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(ApplyFrom.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static ApplyFrom valueOf(String str) {
        return (ApplyFrom) V0N.LJJJ(ApplyFrom.class, str);
    }

    ApplyFrom() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ApplyFrom(ApplyFrom applyFrom) {
        int i = applyFrom.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ApplyFrom(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
