package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum SequenceMode {
    SequenceMode_Loop(0),
    SequenceMode_Random,
    SequenceMode_InOrder;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static SequenceMode swigToEnum(int i) {
        SequenceMode[] sequenceModeArr = (SequenceMode[]) SequenceMode.class.getEnumConstants();
        if (i < sequenceModeArr.length && i >= 0) {
            SequenceMode sequenceMode = sequenceModeArr[i];
            if (sequenceMode.swigValue == i) {
                return sequenceMode;
            }
        }
        for (SequenceMode sequenceMode2 : sequenceModeArr) {
            if (sequenceMode2.swigValue == i) {
                return sequenceMode2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(SequenceMode.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static SequenceMode valueOf(String str) {
        return (SequenceMode) V0N.LJJJ(SequenceMode.class, str);
    }

    SequenceMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    SequenceMode(SequenceMode sequenceMode) {
        int i = sequenceMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    SequenceMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
