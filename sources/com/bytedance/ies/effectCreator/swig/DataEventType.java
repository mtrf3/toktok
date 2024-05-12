package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum DataEventType {
    DataEventType_Unknown(0),
    DataEventType_RequestReloadEffectResource(1),
    DataEventType_FrameRefresh(2);

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static DataEventType swigToEnum(int i) {
        DataEventType[] dataEventTypeArr = (DataEventType[]) DataEventType.class.getEnumConstants();
        if (i < dataEventTypeArr.length && i >= 0) {
            DataEventType dataEventType = dataEventTypeArr[i];
            if (dataEventType.swigValue == i) {
                return dataEventType;
            }
        }
        for (DataEventType dataEventType2 : dataEventTypeArr) {
            if (dataEventType2.swigValue == i) {
                return dataEventType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(DataEventType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static DataEventType valueOf(String str) {
        return (DataEventType) V0N.LJJJ(DataEventType.class, str);
    }

    DataEventType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    DataEventType(DataEventType dataEventType) {
        int i = dataEventType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    DataEventType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
