package com.bytedance.ies.nle.editor_jni;

import X.AnonymousClass073;
import X.C45111Hn9;
import X.V0N;

/* loaded from: classes8.dex */
public enum NLEHttpType {
    HTTP_GET(0),
    HTTP_POST(1);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static NLEHttpType swigToEnum(int i) {
        NLEHttpType[] nLEHttpTypeArr = (NLEHttpType[]) NLEHttpType.class.getEnumConstants();
        if (i < nLEHttpTypeArr.length && i >= 0) {
            NLEHttpType nLEHttpType = nLEHttpTypeArr[i];
            if (nLEHttpType.swigValue == i) {
                return nLEHttpType;
            }
        }
        for (NLEHttpType nLEHttpType2 : nLEHttpTypeArr) {
            if (nLEHttpType2.swigValue == i) {
                return nLEHttpType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", NLEHttpType.class, " with value ", i));
    }

    public static NLEHttpType valueOf(String str) {
        return (NLEHttpType) V0N.LJJJ(NLEHttpType.class, str);
    }

    NLEHttpType() {
        int i = C45111Hn9.LIZ;
        C45111Hn9.LIZ = i + 1;
        this.swigValue = i;
    }

    NLEHttpType(NLEHttpType nLEHttpType) {
        int i = nLEHttpType.swigValue;
        this.swigValue = i;
        C45111Hn9.LIZ = i + 1;
    }

    NLEHttpType(int i) {
        this.swigValue = i;
        C45111Hn9.LIZ = i + 1;
    }
}
