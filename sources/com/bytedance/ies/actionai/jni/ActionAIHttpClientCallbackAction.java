package com.bytedance.ies.actionai.jni;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes15.dex */
public enum ActionAIHttpClientCallbackAction {
    SUCCESS(0),
    RECEIVING_DATA(1),
    CANCELED(2),
    FAIL(3);

    public final int swigValue;

    /* loaded from: classes15.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ActionAIHttpClientCallbackAction swigToEnum(int i) {
        ActionAIHttpClientCallbackAction[] actionAIHttpClientCallbackActionArr = (ActionAIHttpClientCallbackAction[]) ActionAIHttpClientCallbackAction.class.getEnumConstants();
        if (i < actionAIHttpClientCallbackActionArr.length && i >= 0) {
            ActionAIHttpClientCallbackAction actionAIHttpClientCallbackAction = actionAIHttpClientCallbackActionArr[i];
            if (actionAIHttpClientCallbackAction.swigValue == i) {
                return actionAIHttpClientCallbackAction;
            }
        }
        for (ActionAIHttpClientCallbackAction actionAIHttpClientCallbackAction2 : actionAIHttpClientCallbackActionArr) {
            if (actionAIHttpClientCallbackAction2.swigValue == i) {
                return actionAIHttpClientCallbackAction2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", ActionAIHttpClientCallbackAction.class, " with value ", i));
    }

    public static ActionAIHttpClientCallbackAction valueOf(String str) {
        return (ActionAIHttpClientCallbackAction) V0N.LJJJ(ActionAIHttpClientCallbackAction.class, str);
    }

    ActionAIHttpClientCallbackAction() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ActionAIHttpClientCallbackAction(ActionAIHttpClientCallbackAction actionAIHttpClientCallbackAction) {
        int i = actionAIHttpClientCallbackAction.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ActionAIHttpClientCallbackAction(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
