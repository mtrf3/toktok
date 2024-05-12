package com.bytedance.ies.actionai.jni;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes16.dex */
public enum ActionAIHttpType {
    HTTP_GET(0),
    HTTP_POST(1);

    public final int swigValue;

    /* loaded from: classes16.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ActionAIHttpType swigToEnum(int i) {
        ActionAIHttpType[] actionAIHttpTypeArr = (ActionAIHttpType[]) ActionAIHttpType.class.getEnumConstants();
        if (i < actionAIHttpTypeArr.length && i >= 0) {
            ActionAIHttpType actionAIHttpType = actionAIHttpTypeArr[i];
            if (actionAIHttpType.swigValue == i) {
                return actionAIHttpType;
            }
        }
        for (ActionAIHttpType actionAIHttpType2 : actionAIHttpTypeArr) {
            if (actionAIHttpType2.swigValue == i) {
                return actionAIHttpType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", ActionAIHttpType.class, " with value ", i));
    }

    public static ActionAIHttpType valueOf(String str) {
        return (ActionAIHttpType) V0N.LJJJ(ActionAIHttpType.class, str);
    }

    ActionAIHttpType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ActionAIHttpType(ActionAIHttpType actionAIHttpType) {
        int i = actionAIHttpType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ActionAIHttpType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
