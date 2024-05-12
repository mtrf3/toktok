package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum ActionExtraDataType {
    ActionExtraDataType_Unknown(0),
    ActionExtraDataType_TimeInterval;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ActionExtraDataType swigToEnum(int i) {
        ActionExtraDataType[] actionExtraDataTypeArr = (ActionExtraDataType[]) ActionExtraDataType.class.getEnumConstants();
        if (i < actionExtraDataTypeArr.length && i >= 0) {
            ActionExtraDataType actionExtraDataType = actionExtraDataTypeArr[i];
            if (actionExtraDataType.swigValue == i) {
                return actionExtraDataType;
            }
        }
        for (ActionExtraDataType actionExtraDataType2 : actionExtraDataTypeArr) {
            if (actionExtraDataType2.swigValue == i) {
                return actionExtraDataType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(ActionExtraDataType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static ActionExtraDataType valueOf(String str) {
        return (ActionExtraDataType) V0N.LJJJ(ActionExtraDataType.class, str);
    }

    ActionExtraDataType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ActionExtraDataType(ActionExtraDataType actionExtraDataType) {
        int i = actionExtraDataType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ActionExtraDataType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
