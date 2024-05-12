package com.bytedance.ies.actionai.jni;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes15.dex */
public enum ActionAIExecutorType {
    IO(0),
    DEFAULT(1),
    SERIAL(2);

    public final int swigValue;

    /* loaded from: classes15.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ActionAIExecutorType swigToEnum(int i) {
        ActionAIExecutorType[] actionAIExecutorTypeArr = (ActionAIExecutorType[]) ActionAIExecutorType.class.getEnumConstants();
        if (i < actionAIExecutorTypeArr.length && i >= 0) {
            ActionAIExecutorType actionAIExecutorType = actionAIExecutorTypeArr[i];
            if (actionAIExecutorType.swigValue == i) {
                return actionAIExecutorType;
            }
        }
        for (ActionAIExecutorType actionAIExecutorType2 : actionAIExecutorTypeArr) {
            if (actionAIExecutorType2.swigValue == i) {
                return actionAIExecutorType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", ActionAIExecutorType.class, " with value ", i));
    }

    public static ActionAIExecutorType valueOf(String str) {
        return (ActionAIExecutorType) V0N.LJJJ(ActionAIExecutorType.class, str);
    }

    ActionAIExecutorType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ActionAIExecutorType(ActionAIExecutorType actionAIExecutorType) {
        int i = actionAIExecutorType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ActionAIExecutorType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
