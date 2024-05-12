package com.bytedance.ies.effecteditor.swig;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes3.dex */
public enum UIAnnotationNumberDisplayMode {
    UIAnnotationNumberDisplayMode_PercentWithoutSign(0),
    UIAnnotationNumberDisplayMode_Percent(1),
    UIAnnotationNumberDisplayMode_Raw(2);

    public final int swigValue;

    /* loaded from: classes3.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static UIAnnotationNumberDisplayMode swigToEnum(int i) {
        UIAnnotationNumberDisplayMode[] uIAnnotationNumberDisplayModeArr = (UIAnnotationNumberDisplayMode[]) UIAnnotationNumberDisplayMode.class.getEnumConstants();
        if (i < uIAnnotationNumberDisplayModeArr.length && i >= 0) {
            UIAnnotationNumberDisplayMode uIAnnotationNumberDisplayMode = uIAnnotationNumberDisplayModeArr[i];
            if (uIAnnotationNumberDisplayMode.swigValue == i) {
                return uIAnnotationNumberDisplayMode;
            }
        }
        for (UIAnnotationNumberDisplayMode uIAnnotationNumberDisplayMode2 : uIAnnotationNumberDisplayModeArr) {
            if (uIAnnotationNumberDisplayMode2.swigValue == i) {
                return uIAnnotationNumberDisplayMode2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", UIAnnotationNumberDisplayMode.class, " with value ", i));
    }

    public static UIAnnotationNumberDisplayMode valueOf(String str) {
        return (UIAnnotationNumberDisplayMode) V0N.LJJJ(UIAnnotationNumberDisplayMode.class, str);
    }

    UIAnnotationNumberDisplayMode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    UIAnnotationNumberDisplayMode(UIAnnotationNumberDisplayMode uIAnnotationNumberDisplayMode) {
        int i = uIAnnotationNumberDisplayMode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    UIAnnotationNumberDisplayMode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
