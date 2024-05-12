package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes3.dex */
public enum UIAnnotationCallbackMoreFunctionType {
    UIAnnotationCallbackMoreFunction_Unknown(0),
    UIAnnotationCallbackMoreFunction_Single,
    UIAnnotationCallbackMoreFunction_OneToMany,
    UIAnnotationCallbackMoreFunction_OneToOne;

    public final int swigValue;

    /* loaded from: classes3.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationCallbackMoreFunctionType swigToEnum(int i) {
        UIAnnotationCallbackMoreFunctionType[] uIAnnotationCallbackMoreFunctionTypeArr = (UIAnnotationCallbackMoreFunctionType[]) UIAnnotationCallbackMoreFunctionType.class.getEnumConstants();
        if (i < uIAnnotationCallbackMoreFunctionTypeArr.length && i >= 0) {
            UIAnnotationCallbackMoreFunctionType uIAnnotationCallbackMoreFunctionType = uIAnnotationCallbackMoreFunctionTypeArr[i];
            if (uIAnnotationCallbackMoreFunctionType.swigValue == i) {
                return uIAnnotationCallbackMoreFunctionType;
            }
        }
        for (UIAnnotationCallbackMoreFunctionType uIAnnotationCallbackMoreFunctionType2 : uIAnnotationCallbackMoreFunctionTypeArr) {
            if (uIAnnotationCallbackMoreFunctionType2.swigValue == i) {
                return uIAnnotationCallbackMoreFunctionType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationCallbackMoreFunctionType.class, " with value ", i));
    }

    public static UIAnnotationCallbackMoreFunctionType valueOf(String str) {
        return (UIAnnotationCallbackMoreFunctionType) V0N.LJJJ(UIAnnotationCallbackMoreFunctionType.class, str);
    }

    UIAnnotationCallbackMoreFunctionType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationCallbackMoreFunctionType(UIAnnotationCallbackMoreFunctionType uIAnnotationCallbackMoreFunctionType) {
        int i = uIAnnotationCallbackMoreFunctionType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationCallbackMoreFunctionType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
