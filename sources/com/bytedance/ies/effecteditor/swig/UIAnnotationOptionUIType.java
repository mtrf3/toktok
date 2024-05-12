package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes3.dex */
public enum UIAnnotationOptionUIType {
    UIAnnotationOptionUIType_Texture(0),
    UIAnnotationOptionUIType_Unknown;

    public final int swigValue;

    /* loaded from: classes3.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationOptionUIType swigToEnum(int i) {
        UIAnnotationOptionUIType[] uIAnnotationOptionUITypeArr = (UIAnnotationOptionUIType[]) UIAnnotationOptionUIType.class.getEnumConstants();
        if (i < uIAnnotationOptionUITypeArr.length && i >= 0) {
            UIAnnotationOptionUIType uIAnnotationOptionUIType = uIAnnotationOptionUITypeArr[i];
            if (uIAnnotationOptionUIType.swigValue == i) {
                return uIAnnotationOptionUIType;
            }
        }
        for (UIAnnotationOptionUIType uIAnnotationOptionUIType2 : uIAnnotationOptionUITypeArr) {
            if (uIAnnotationOptionUIType2.swigValue == i) {
                return uIAnnotationOptionUIType2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationOptionUIType.class, " with value ", i));
    }

    public static UIAnnotationOptionUIType valueOf(String str) {
        return (UIAnnotationOptionUIType) V0N.LJJJ(UIAnnotationOptionUIType.class, str);
    }

    UIAnnotationOptionUIType() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationOptionUIType(UIAnnotationOptionUIType uIAnnotationOptionUIType) {
        int i = uIAnnotationOptionUIType.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationOptionUIType(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
