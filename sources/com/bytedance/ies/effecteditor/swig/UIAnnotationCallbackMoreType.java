package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes3.dex */
public enum UIAnnotationCallbackMoreType {
    UIAnnotationCallbackMoreType_Unknown(0),
    UIAnnotationCallbackMoreType_Property,
    UIAnnotationCallbackMoreType_Method,
    UIAnnotationCallbackMoreType_ScriptMethod,
    UIAnnotationCallbackMoreType_SceneEvent;

    public final int swigValue;

    /* loaded from: classes3.dex */
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
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationCallbackMoreType.class, " with value ", i));
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
