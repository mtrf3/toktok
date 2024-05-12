package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum TriggerMode {
    TriggerMode_Single(0),
    TriggerMode_And,
    TriggerMode_Or;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static TriggerMode swigToEnum(int i) {
        TriggerMode[] triggerModeArr = (TriggerMode[]) TriggerMode.class.getEnumConstants();
        if (i < triggerModeArr.length && i >= 0) {
            TriggerMode triggerMode = triggerModeArr[i];
            if (triggerMode.swigValue == i) {
                return triggerMode;
            }
        }
        for (TriggerMode triggerMode2 : triggerModeArr) {
            if (triggerMode2.swigValue == i) {
                return triggerMode2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(TriggerMode.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static TriggerMode valueOf(String str) {
        return (TriggerMode) V0N.LJJJ(TriggerMode.class, str);
    }

    TriggerMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    TriggerMode(TriggerMode triggerMode) {
        int i = triggerMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    TriggerMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
