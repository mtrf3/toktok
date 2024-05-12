package com.bytedance.ies.nle.editor_jni;

import X.AnonymousClass073;
import X.C126714yB;
import X.V0N;

/* loaded from: classes3.dex */
public enum NLEError {
    SUCCESS(0),
    FAILED(-1),
    OPERATION_ILLEGAL(-2),
    NO_CHANGED(-3),
    OBJECTS_NOT_FOUND(-4),
    NOT_SUPPORT(-5),
    FILE_ACCESS_ERROR(-6),
    PARAM_INVALID(-7);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEError swigToEnum(int i) {
        NLEError[] nLEErrorArr = (NLEError[]) NLEError.class.getEnumConstants();
        if (i < nLEErrorArr.length && i >= 0) {
            NLEError nLEError = nLEErrorArr[i];
            if (nLEError.swigValue == i) {
                return nLEError;
            }
        }
        for (NLEError nLEError2 : nLEErrorArr) {
            if (nLEError2.swigValue == i) {
                return nLEError2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", NLEError.class, " with value ", i));
    }

    public static NLEError valueOf(String str) {
        return (NLEError) V0N.LJJJ(NLEError.class, str);
    }

    NLEError() {
        int i = C126714yB.LIZ;
        C126714yB.LIZ = i + 1;
        this.swigValue = i;
    }

    NLEError(NLEError nLEError) {
        int i = nLEError.swigValue;
        this.swigValue = i;
        C126714yB.LIZ = i + 1;
    }

    NLEError(int i) {
        this.swigValue = i;
        C126714yB.LIZ = i + 1;
    }
}
