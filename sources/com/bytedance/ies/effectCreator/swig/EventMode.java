package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum EventMode {
    EventMode_Confluence(0),
    EventMode_Sequence;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static EventMode swigToEnum(int i) {
        EventMode[] eventModeArr = (EventMode[]) EventMode.class.getEnumConstants();
        if (i < eventModeArr.length && i >= 0) {
            EventMode eventMode = eventModeArr[i];
            if (eventMode.swigValue == i) {
                return eventMode;
            }
        }
        for (EventMode eventMode2 : eventModeArr) {
            if (eventMode2.swigValue == i) {
                return eventMode2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(EventMode.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static EventMode valueOf(String str) {
        return (EventMode) V0N.LJJJ(EventMode.class, str);
    }

    EventMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    EventMode(EventMode eventMode) {
        int i = eventMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    EventMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
