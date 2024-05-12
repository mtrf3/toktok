package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum UIAnnotationCallbackMoreFunctionType {
    UIAnnotationCallbackMoreFunction_Unknown(0),
    UIAnnotationCallbackMoreFunction_Single,
    UIAnnotationCallbackMoreFunction_OneToMany,
    UIAnnotationCallbackMoreFunction_OneToOne;

    public final int swigValue;

    /* loaded from: classes34.dex */
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(UIAnnotationCallbackMoreFunctionType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
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
