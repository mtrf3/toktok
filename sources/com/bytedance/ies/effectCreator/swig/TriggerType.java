package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum TriggerType {
    TriggerType_Basic(0),
    TriggerType_HeadFace,
    TriggerType_Expression,
    TriggerType_Gesture,
    TriggerType_Body,
    TriggerType_None;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static TriggerType swigToEnum(int i) {
        TriggerType[] triggerTypeArr = (TriggerType[]) TriggerType.class.getEnumConstants();
        if (i < triggerTypeArr.length && i >= 0) {
            TriggerType triggerType = triggerTypeArr[i];
            if (triggerType.swigValue == i) {
                return triggerType;
            }
        }
        for (TriggerType triggerType2 : triggerTypeArr) {
            if (triggerType2.swigValue == i) {
                return triggerType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(TriggerType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static TriggerType valueOf(String str) {
        return (TriggerType) V0N.LJJJ(TriggerType.class, str);
    }

    TriggerType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    TriggerType(TriggerType triggerType) {
        int i = triggerType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    TriggerType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
