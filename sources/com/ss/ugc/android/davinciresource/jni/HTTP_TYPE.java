package com.ss.ugc.android.davinciresource.jni;

import X.AnonymousClass073;
import X.V0N;
import X.X1T;

/* loaded from: classes16.dex */
public enum HTTP_TYPE {
    HTTP_GET(0),
    HTTP_POST(1);

    public final int swigValue;

    public final int swigValue() {
        return this.swigValue;
    }

    public static HTTP_TYPE swigToEnum(int i) {
        HTTP_TYPE[] http_typeArr = (HTTP_TYPE[]) HTTP_TYPE.class.getEnumConstants();
        if (i < http_typeArr.length && i >= 0) {
            HTTP_TYPE http_type = http_typeArr[i];
            if (http_type.swigValue == i) {
                return http_type;
            }
        }
        for (HTTP_TYPE http_type2 : http_typeArr) {
            if (http_type2.swigValue == i) {
                return http_type2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", HTTP_TYPE.class, " with value ", i));
    }

    public static HTTP_TYPE valueOf(String str) {
        return (HTTP_TYPE) V0N.LJJJ(HTTP_TYPE.class, str);
    }

    HTTP_TYPE() {
        int i = X1T.LIZ;
        X1T.LIZ = i + 1;
        this.swigValue = i;
    }

    HTTP_TYPE(HTTP_TYPE http_type) {
        int i = http_type.swigValue;
        this.swigValue = i;
        X1T.LIZ = i + 1;
    }

    HTTP_TYPE(int i) {
        this.swigValue = i;
        X1T.LIZ = i + 1;
    }
}
