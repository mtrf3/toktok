package com.bytedance.ies.effectcreator.swig;

import X.V0N;
import X.X1D;

/* loaded from: classes34.dex */
public enum UIAnnotationUpdateType {
    UIAnnotationUpdateType_Preview(0),
    UIAnnotationUpdateType_Done;

    public final int swigValue;

    /* loaded from: classes34.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationUpdateType swigToEnum(int i) {
        UIAnnotationUpdateType[] uIAnnotationUpdateTypeArr = (UIAnnotationUpdateType[]) UIAnnotationUpdateType.class.getEnumConstants();
        if (i < uIAnnotationUpdateTypeArr.length && i >= 0) {
            UIAnnotationUpdateType uIAnnotationUpdateType = uIAnnotationUpdateTypeArr[i];
            if (uIAnnotationUpdateType.swigValue == i) {
                return uIAnnotationUpdateType;
            }
        }
        for (UIAnnotationUpdateType uIAnnotationUpdateType2 : uIAnnotationUpdateTypeArr) {
            if (uIAnnotationUpdateType2.swigValue == i) {
                return uIAnnotationUpdateType2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("No enum ");
        LIZ.append(UIAnnotationUpdateType.class);
        LIZ.append(" with value ");
        LIZ.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static UIAnnotationUpdateType valueOf(String str) {
        return (UIAnnotationUpdateType) V0N.LJJJ(UIAnnotationUpdateType.class, str);
    }

    UIAnnotationUpdateType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationUpdateType(UIAnnotationUpdateType uIAnnotationUpdateType) {
        int i = uIAnnotationUpdateType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationUpdateType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
