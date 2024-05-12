package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum UIAnnotationCallbackMoreType {
    UIAnnotationCallbackMoreType_Unknown(0),
    UIAnnotationCallbackMoreType_Property,
    UIAnnotationCallbackMoreType_Method,
    UIAnnotationCallbackMoreType_ScriptMethod,
    UIAnnotationCallbackMoreType_SceneEvent;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationCallbackMoreType swigToEnum(int i) {
        UIAnnotationCallbackMoreType[] uIAnnotationCallbackMoreTypeArr = (UIAnnotationCallbackMoreType[]) UIAnnotationCallbackMoreType.class.getEnumConstants();
        if (i < uIAnnotationCallbackMoreTypeArr.length && i >= 0) {
            UIAnnotationCallbackMoreType uIAnnotationCallbackMoreType = uIAnnotationCallbackMoreTypeArr[i];
            if (uIAnnotationCallbackMoreType.swigValue == i) {
                return uIAnnotationCallbackMoreType;
            }
        }
        for (UIAnnotationCallbackMoreType uIAnnotationCallbackMoreType2 : uIAnnotationCallbackMoreTypeArr) {
            if (uIAnnotationCallbackMoreType2.swigValue == i) {
                return uIAnnotationCallbackMoreType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(UIAnnotationCallbackMoreType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static UIAnnotationCallbackMoreType valueOf(String str) {
        return (UIAnnotationCallbackMoreType) V0N.LJJJ(UIAnnotationCallbackMoreType.class, str);
    }

    UIAnnotationCallbackMoreType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationCallbackMoreType(UIAnnotationCallbackMoreType uIAnnotationCallbackMoreType) {
        int i = uIAnnotationCallbackMoreType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationCallbackMoreType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
