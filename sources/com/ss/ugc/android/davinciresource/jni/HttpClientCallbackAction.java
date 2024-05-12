package com.ss.ugc.android.davinciresource.jni;

import X.AnonymousClass073;
import X.C83542WqY;
import X.V0N;

/* loaded from: classes15.dex */
public enum HttpClientCallbackAction {
    SUCCESS(0),
    RECEIVING_DATA(1),
    CANCELED(2),
    FAIL(3);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static HttpClientCallbackAction swigToEnum(int i) {
        HttpClientCallbackAction[] httpClientCallbackActionArr = (HttpClientCallbackAction[]) HttpClientCallbackAction.class.getEnumConstants();
        if (i < httpClientCallbackActionArr.length && i >= 0) {
            HttpClientCallbackAction httpClientCallbackAction = httpClientCallbackActionArr[i];
            if (httpClientCallbackAction.swigValue == i) {
                return httpClientCallbackAction;
            }
        }
        for (HttpClientCallbackAction httpClientCallbackAction2 : httpClientCallbackActionArr) {
            if (httpClientCallbackAction2.swigValue == i) {
                return httpClientCallbackAction2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", HttpClientCallbackAction.class, " with value ", i));
    }

    public static HttpClientCallbackAction valueOf(String str) {
        return (HttpClientCallbackAction) V0N.LJJJ(HttpClientCallbackAction.class, str);
    }

    HttpClientCallbackAction() {
        int i = C83542WqY.LIZ;
        C83542WqY.LIZ = i + 1;
        this.swigValue = i;
    }

    HttpClientCallbackAction(HttpClientCallbackAction httpClientCallbackAction) {
        int i = httpClientCallbackAction.swigValue;
        this.swigValue = i;
        C83542WqY.LIZ = i + 1;
    }

    HttpClientCallbackAction(int i) {
        this.swigValue = i;
        C83542WqY.LIZ = i + 1;
    }
}
