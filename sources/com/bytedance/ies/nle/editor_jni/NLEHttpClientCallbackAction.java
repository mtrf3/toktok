package com.bytedance.ies.nle.editor_jni;

import X.AnonymousClass073;
import X.C45110Hn8;
import X.V0N;

/* loaded from: classes8.dex */
public enum NLEHttpClientCallbackAction {
    SUCCESS(0),
    RECEIVING_DATA(1),
    CANCELED(2),
    FAIL(3);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEHttpClientCallbackAction swigToEnum(int i) {
        NLEHttpClientCallbackAction[] nLEHttpClientCallbackActionArr = (NLEHttpClientCallbackAction[]) NLEHttpClientCallbackAction.class.getEnumConstants();
        if (i < nLEHttpClientCallbackActionArr.length && i >= 0) {
            NLEHttpClientCallbackAction nLEHttpClientCallbackAction = nLEHttpClientCallbackActionArr[i];
            if (nLEHttpClientCallbackAction.swigValue == i) {
                return nLEHttpClientCallbackAction;
            }
        }
        for (NLEHttpClientCallbackAction nLEHttpClientCallbackAction2 : nLEHttpClientCallbackActionArr) {
            if (nLEHttpClientCallbackAction2.swigValue == i) {
                return nLEHttpClientCallbackAction2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", NLEHttpClientCallbackAction.class, " with value ", i));
    }

    public static NLEHttpClientCallbackAction valueOf(String str) {
        return (NLEHttpClientCallbackAction) V0N.LJJJ(NLEHttpClientCallbackAction.class, str);
    }

    NLEHttpClientCallbackAction() {
        int i = C45110Hn8.LIZ;
        C45110Hn8.LIZ = i + 1;
        this.swigValue = i;
    }

    NLEHttpClientCallbackAction(NLEHttpClientCallbackAction nLEHttpClientCallbackAction) {
        int i = nLEHttpClientCallbackAction.swigValue;
        this.swigValue = i;
        C45110Hn8.LIZ = i + 1;
    }

    NLEHttpClientCallbackAction(int i) {
        this.swigValue = i;
        C45110Hn8.LIZ = i + 1;
    }
}
