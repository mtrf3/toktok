package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes15.dex */
public enum UIAnnotationUpdateType {
    UIAnnotationUpdateType_Preview(0),
    UIAnnotationUpdateType_Done;

    public final int swigValue;

    /* loaded from: classes15.dex */
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
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationUpdateType.class, " with value ", i));
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
