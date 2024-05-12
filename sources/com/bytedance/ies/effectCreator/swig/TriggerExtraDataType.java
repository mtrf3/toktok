package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum TriggerExtraDataType {
    TriggerExtraDataType_Unknown(0),
    TriggerExtraDataType_DelayTime,
    TriggerExtraDataType_FPS,
    TriggerExtraDataType_Object;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static TriggerExtraDataType swigToEnum(int i) {
        TriggerExtraDataType[] triggerExtraDataTypeArr = (TriggerExtraDataType[]) TriggerExtraDataType.class.getEnumConstants();
        if (i < triggerExtraDataTypeArr.length && i >= 0) {
            TriggerExtraDataType triggerExtraDataType = triggerExtraDataTypeArr[i];
            if (triggerExtraDataType.swigValue == i) {
                return triggerExtraDataType;
            }
        }
        for (TriggerExtraDataType triggerExtraDataType2 : triggerExtraDataTypeArr) {
            if (triggerExtraDataType2.swigValue == i) {
                return triggerExtraDataType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(TriggerExtraDataType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static TriggerExtraDataType valueOf(String str) {
        return (TriggerExtraDataType) V0N.LJJJ(TriggerExtraDataType.class, str);
    }

    TriggerExtraDataType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    TriggerExtraDataType(TriggerExtraDataType triggerExtraDataType) {
        int i = triggerExtraDataType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    TriggerExtraDataType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
